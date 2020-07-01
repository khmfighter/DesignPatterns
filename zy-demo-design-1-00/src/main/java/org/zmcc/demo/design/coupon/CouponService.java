package org.zmcc.demo.design.coupon;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CouponService.java
 * @Description TODO
 * @createTime 2020年06月29日 16:25:00
 **/
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
