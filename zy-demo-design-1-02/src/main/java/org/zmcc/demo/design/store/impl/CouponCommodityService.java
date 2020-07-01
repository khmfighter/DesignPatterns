package org.zmcc.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zmcc.demo.design.coupon.CouponResult;
import org.zmcc.demo.design.coupon.CouponService;
import org.zmcc.demo.design.store.ICommodity;

import java.util.Map;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CouponCommodityService.java
 * @Description 发放优惠券
 * @createTime 2020年06月29日 17:08:00
 **/
public class CouponCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
