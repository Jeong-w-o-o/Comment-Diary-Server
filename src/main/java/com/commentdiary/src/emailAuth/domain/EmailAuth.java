package com.commentdiary.src.emailAuth.domain;

import com.commentdiary.common.domain.BaseTimeEntity;
import com.commentdiary.src.member.domain.enums.MemberStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "email_auth")
public class EmailAuth extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 45, nullable = false)
    private String email;

    @Column(length = 4, nullable = false)
    private int code;

    @Builder
    public EmailAuth(String email, int code) {
        this.email = email;
        this.code = code;
    }
}
