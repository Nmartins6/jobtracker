package dev.jobtracker.dto.job;

import java.time.LocalDate;
import java.util.List;

public class JobApplicationResponseDTO {
    private Long id;
    private String companyName;
    private String jobTitle;
    private LocalDate applicationDate;
    private String status;
    private String jobUrl;
    private String notes;
    private List<JobSkillDTO> skills;

    public JobApplicationResponseDTO() {
    }

    public JobApplicationResponseDTO(Long id, String companyName, String jobTitle, LocalDate applicationDate, String status, String jobUrl, String notes, List<JobSkillDTO> skills) {
        this.id = id;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.applicationDate = applicationDate;
        this.status = status;
        this.jobUrl = jobUrl;
        this.notes = notes;
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJobUrl() {
        return jobUrl;
    }

    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<JobSkillDTO> getSkills() {
        return skills;
    }

    public void setSkills(List<JobSkillDTO> skills) {
        this.skills = skills;
    }
}
