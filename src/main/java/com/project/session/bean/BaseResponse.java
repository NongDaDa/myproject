package com.project.session.bean;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    public BaseResponse(){}

    public BaseResponse(Boolean ok){
        this.ok = ok;
    }

    private boolean ok;
    private String message;
    private Object data;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
