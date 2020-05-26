package org.zmcc.chapter001.buttons;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName HtmlButton.java
 * @Description TODO
 * @createTime 2020年05月26日 14:09:00
 **/
public class HtmlButton  implements Button{
    @Override
    public void render() {
        System.out.println("<button> Test Button </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
