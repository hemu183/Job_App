package com.example.JobApp.service;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl {
    @Autowired
    private JobRepo jobRepo;

    public void addingJob(JobPost jobPost){
        jobRepo.addingjob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobRepo.getAllJobs();


    }

}
