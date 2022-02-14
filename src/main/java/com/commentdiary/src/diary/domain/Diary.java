package com.commentdiary.src.diary.domain;

import com.commentdiary.common.domain.BaseTimeEntity;
import com.commentdiary.src.member.domain.Member;
import com.commentdiary.src.member.domain.enums.MemberStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Diary extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Lob
    private String content;

    private char deliveryYn;
}
