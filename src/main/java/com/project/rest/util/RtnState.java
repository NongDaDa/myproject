package com.project.rest.util;

public enum RtnState {
    SUCCESS(Contanst.SUCCESS_CODE, Contanst.SUCCESS_MSG), FAIL(Contanst.FAIL_CODE, Contanst.FAIL_MSG);

    private Integer code;
    private String msg;

    RtnState(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
