package com.example.Exam.model;

import jakarta.persistence.*;

@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int score;
    private int violations;
    private String eligible;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public int getViolations() { return violations; }
    public void setViolations(int violations) { this.violations = violations; }

    public String getEligible() { return eligible; }
    public void setEligible(String eligible) { this.eligible = eligible; }
}
