package com.example.JobApp.controller;

import org.springframework.ui.Model;
import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobServiceImpl jobService;

    //recieves request from server i.e 8080
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> jobs = jobService.getAllJobs();
        m.addAttribute("jobPosts", jobs);

        return "viewalljobs";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addingJob(jobPost);
        return "success";
    }
}
