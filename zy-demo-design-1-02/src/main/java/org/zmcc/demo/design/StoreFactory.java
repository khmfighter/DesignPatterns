package org.zmcc.demo.design;

import org.zmcc.demo.design.store.ICommodity;
import org.zmcc.demo.design.store.impl.CardCommodityService;
import org.zmcc.demo.design.store.impl.CouponCommodityService;
import org.zmcc.demo.design.store.impl.GoodsCommodityService;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName StoreFactory.java
 * @Description 简单工厂模式
 * @createTime 2020年06月29日 17:06:00
 **/
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
