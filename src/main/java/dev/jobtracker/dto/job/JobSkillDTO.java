package dev.jobtracker.dto.job;

import jakarta.validation.constraints.NotBlank;

public class JobSkillDTO {
    @NotBlank(message = "Skill name is required")
    private String name;
    private boolean required;

    public JobSkillDTO() {

    }

    public JobSkillDTO(String name, boolean required) {
        this.name = name;
        this.required = required;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

}
