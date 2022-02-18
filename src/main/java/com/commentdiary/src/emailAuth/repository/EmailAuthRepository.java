package com.commentdiary.src.emailAuth.repository;

import com.commentdiary.src.emailAuth.domain.EmailAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAuthRepository extends JpaRepository<EmailAuth, Long> {
    boolean existsByEmailAndCode(String email, int code);
}