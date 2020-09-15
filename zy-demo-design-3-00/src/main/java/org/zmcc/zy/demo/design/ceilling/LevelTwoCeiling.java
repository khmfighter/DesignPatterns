package org.zmcc.zy.demo.design.ceilling;

import org.zmcc.zy.demo.design.Matter;

import java.math.BigDecimal;

/**
 * @ClassName LevelTwoCeiling.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description TODO
 * @CreateTime 2020年09月14日 14:23:00
 **/
public class LevelTwoCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }
}
