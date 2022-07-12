package Helper;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;


public class Helper {
    public static int ScreenC(String axis, Dimension dimension) {
        int point;
        switch (axis) {
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - dimension.width) / 2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height - dimension.width) / 2;
                break;
            default:
                point = 0;
        }
        return point;
    }

    public static void setLayout() {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }


    }


}
