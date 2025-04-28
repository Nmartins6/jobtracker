package dev.jobtracker.controller;

import dev.jobtracker.dto.job.JobApplicationRequestDTO;
import dev.jobtracker.dto.job.JobApplicationResponseDTO;
import dev.jobtracker.service.JobApplicationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @PostMapping
    public ResponseEntity<JobApplicationResponseDTO> createJob(@RequestBody @Valid JobApplicationRequestDTO dto) {
        JobApplicationResponseDTO response = jobApplicationService.createJobApplication(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
