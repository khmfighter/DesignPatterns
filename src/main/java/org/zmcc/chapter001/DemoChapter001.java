package org.zmcc.chapter001;

import org.zmcc.chapter001.factory.Dialog;
import org.zmcc.chapter001.factory.HtmlDialog;
import org.zmcc.chapter001.factory.WindowsDialog;

import javax.swing.*;
import java.awt.*;

/**
 * @author khuaming
 * @version 1.0.0
 * @ClassName DemoChapter001.java
 * @Description TODO
 * @createTime 2020年05月26日 14:21:00
 **/
public class DemoChapter001 {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog=new WindowsDialog();
        }else{
            dialog=new HtmlDialog();
        }
    }
}
