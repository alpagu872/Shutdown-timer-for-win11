import Helper.Helper;

import javax.swing.*;

public class Open {
    public static void main(String[] args) {

        Helper.setLayout();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                TimerMain f1 = new TimerMain();
                f1.setVisible(true);

            }
        });


    }
}
