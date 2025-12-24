package com.example.Exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Exam.model.Result;
import com.example.Exam.repository.ResultRepository;

@RestController
@CrossOrigin
public class ExamController {

    @Autowired
    private ResultRepository repo;



    @PostMapping("/saveResult")
    public String save(@RequestBody Result r) {

        if (r.getScore() >= 15) {
            r.setEligible("PASS");
        } else {
            r.setEligible("FAIL");
        }

        repo.save(r);
        return "Saved";
    }
}
