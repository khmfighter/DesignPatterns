package org.zmcc.zy.demo.design;

import java.math.BigDecimal;

/**
 * @ClassName Matter.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description 物料接口
 * 提供了基本的信息，以保证所有的装修材料都可以按照统一标准进行获取
 * @CreateTime 2020年09月14日 14:18:00
 **/
public interface Matter {
    String scene();  //场景；地板、地砖、涂料、吊顶
    String brand();  //品牌
    String model();  //型号
    BigDecimal price();  //价格
    String desc();  //描述
}
