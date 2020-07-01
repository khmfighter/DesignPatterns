package org.zmcc.demo.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName GoodsService.java
 * @Description TODO
 * @createTime 2020年06月29日 16:27:00
 **/
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
