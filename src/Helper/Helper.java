package Helper;



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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }


    }


}
