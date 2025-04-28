package dev.jobtracker.service;

import dev.jobtracker.dto.job.JobApplicationRequestDTO;
import dev.jobtracker.dto.job.JobApplicationResponseDTO;
import dev.jobtracker.dto.job.JobSkillDTO;
import dev.jobtracker.model.JobApplication;
import dev.jobtracker.model.JobSkills;
import dev.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplicationResponseDTO createJobApplication(JobApplicationRequestDTO dto) {
        JobApplication job = new JobApplication();
        job.setCompanyName(dto.getCompanyName());
        job.setJobTitle(dto.getJobTitle());
        job.setApplicationDate(dto.getApplicationDate());
        job.setStatus(dto.getStatus());
        job.setJobUrl(dto.getJobUrl());
        job.setNotes(dto.getNotes());

        List<JobSkills> skills = dto.getSkills().stream().map(jobSkillDTO -> {
            JobSkills skill = new JobSkills();
            skill.setName(jobSkillDTO.getName());
            skill.setRequired(jobSkillDTO.isRequired());
            skill.setJobApplication(job);
            return skill;
        }).toList();

        job.setSkills(skills);
        JobApplication saved = jobApplicationRepository.save(job);

        List<JobSkillDTO> skillDTOs = saved.getSkills().stream().map(skill ->
                new JobSkillDTO(skill.getName(), skill.isRequired())
        ).toList();

        return new JobApplicationResponseDTO(
                saved.getId(),
                saved.getCompanyName(),
                saved.getJobTitle(),
                saved.getApplicationDate(),
                saved.getStatus(),
                saved.getJobUrl(),
                saved.getNotes(),
                skillDTOs
        );
    }
}
