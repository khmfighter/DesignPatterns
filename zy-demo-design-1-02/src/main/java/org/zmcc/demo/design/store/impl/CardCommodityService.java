package org.zmcc.demo.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zmcc.demo.design.card.IQiYiCardService;
import org.zmcc.demo.design.store.ICommodity;

import java.util.Map;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName CardCommodityService.java
 * @Description 发放第三方爱奇艺兑换卡
 * @createTime 2020年06月29日 17:08:00
 **/
public class CardCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);
    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }
    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
