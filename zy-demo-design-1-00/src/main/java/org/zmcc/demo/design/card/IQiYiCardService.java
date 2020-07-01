package org.zmcc.demo.design.card;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName IQiYiCardService.java
 * @Description TODO
 * @createTime 2020年06月29日 16:21:00
 **/
public class IQiYiCardService  {
    public void grantToken(String bindMobileNumber,String cardId){
        System.out.println("模拟发放爱奇艺会员卡一张："+bindMobileNumber+"，"+cardId);
    }
}
