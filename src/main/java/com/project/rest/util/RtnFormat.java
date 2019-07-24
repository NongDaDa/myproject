package com.project.rest.util;


public class RtnFormat {
    private Integer code;
    private String msg;
    private Object data;

    public RtnFormat(){
        this.code=Contanst.SUCCESS_CODE;
        this.msg=Contanst.SUCCESS_MSG;
    }

    public RtnFormat(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public RtnFormat(Integer code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public static RtnFormat success(){
        return  new  RtnFormat();
    }

    public static RtnFormat success(Object data){
       return  new  RtnFormat(Contanst.SUCCESS_CODE,Contanst.SUCCESS_MSG,data);
    }
    public static RtnFormat fail(Integer code ,String msg){
        return  new  RtnFormat(code,msg,null);
    }
    public static RtnFormat fail(){
        return  new  RtnFormat(Contanst.FAIL_CODE,Contanst.FAIL_MSG,null);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
