package dev.jobtracker.dto.job;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public class JobApplicationRequestDTO {
    @NotBlank(message = "Company name is required")
    private String companyName;

    @NotBlank(message = "Job title is required")
    private String jobTitle;

    @NotNull(message = "Application date is required")
    private LocalDate applicationDate;

    @NotBlank(message = "Status is required")
    private String status;

    @NotBlank(message = "Job URL is required")
    private String jobUrl;

    private String notes;

    @NotNull(message = "Skill list cannot be null")
    @Size(min = 1, message = "At least one skill is required")
    private List<JobSkillDTO> skills;

    public JobApplicationRequestDTO() {

    }

    public JobApplicationRequestDTO(String companyName, String jobTitle, LocalDate applicationDate, String status, String jobUrl, String notes, List<JobSkillDTO> skills) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.applicationDate = applicationDate;
        this.status = status;
        this.jobUrl = jobUrl;
        this.notes = notes;
        this.skills = skills;
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
