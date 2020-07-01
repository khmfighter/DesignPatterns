package org.zmcc.demo.design.store;

import java.util.Map;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName ICommodity.java
 * @Description 奖金接口
 * @createTime 2020年06月29日 17:07:00
 **/
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
