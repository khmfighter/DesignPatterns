package org.zmcc.zy.demo.design.floor;

import org.zmcc.zy.demo.design.Matter;

import java.math.BigDecimal;

/**
 * @ClassName DerFloor.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description 德尔(Der)
 * @CreateTime 2020年09月14日 14:28:00
 **/
public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔(Der)";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业木地板制造商，北京2008年奥运会家装和公装地板供应商";
    }
}
