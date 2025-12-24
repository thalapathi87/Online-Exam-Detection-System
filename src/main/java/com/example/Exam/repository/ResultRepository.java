package com.example.Exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Exam.model.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
}
