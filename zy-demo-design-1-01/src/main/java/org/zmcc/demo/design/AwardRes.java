package org.zmcc.demo.design;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName AwardRes.java
 * @Description TODO
 * @createTime 2020年06月29日 16:52:00
 **/
public class AwardRes {
    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
