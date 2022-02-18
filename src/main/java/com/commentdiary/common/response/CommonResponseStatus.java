package com.commentdiary.common.response;

import lombok.Getter;

@Getter
public enum CommonResponseStatus {
    /**
     * 1000 : 요청 성공
     */
    SUCCESS(1000, "요청에 성공하였습니다."),

    FAIL(1001, "인증 번호가 틀렸습니다.")
    ;

    private final int code;
    private final String message;

    CommonResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
