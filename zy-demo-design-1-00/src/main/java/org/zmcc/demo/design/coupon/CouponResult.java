package org.zmcc.demo.design.coupon;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CouponResult.java
 * @Description TODO
 * @createTime 2020年06月29日 16:24:00
 **/
public class CouponResult {
    private String code;
    private String info;

    public CouponResult(String code, String info) {
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
