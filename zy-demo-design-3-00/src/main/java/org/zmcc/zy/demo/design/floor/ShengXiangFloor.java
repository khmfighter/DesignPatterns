package org.zmcc.zy.demo.design.floor;

import org.zmcc.zy.demo.design.Matter;

import java.math.BigDecimal;

/**
 * @ClassName ShengXiangFloor.java
 * @Author khuaming
 * @Version 1.0.0
 * @Description 圣象
 * @CreateTime 2020年09月14日 14:29:00
 **/
public class ShengXiangFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "圣象";
    }

    @Override
    public String model() {
        return "一级";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    @Override
    public String desc() {
        return "圣象地板是中国地板行业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }
}
