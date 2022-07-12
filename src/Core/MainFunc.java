package Core;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFunc {

    public static void close(JTextField textField) {
        String timeS = textField.getText();
        int time;
        try {
            time = Integer.parseInt(timeS);
        } catch (NumberFormatException exx) {
            time = 120;
            JOptionPane.showMessageDialog(null, "Yanlış veri girdisi, bilgisayar 120 saniye sonra kapatılacak...");
        }
        JOptionPane.showMessageDialog(null, "Geri sayım başlatıldı " + time + " sn.", "Bilgi", JOptionPane.PLAIN_MESSAGE);

        try {
            Process p = Runtime.getRuntime().exec("shutdown -s -t " + time);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void close(JButton btn) {
        String timeS = String.valueOf(Integer.parseInt(btn.getText()));
        int time;
        try {
            time = Integer.parseInt(timeS);
        } catch (NumberFormatException exx) {
            time = 120;
            JOptionPane.showMessageDialog(null, "Yanlış veri girdisi, bilgisayar 120 saniye sonra kapatılacak...");
        }
        JOptionPane.showMessageDialog(null, "Geri sayım başlatıldı " + time + " sn.", "Bilgi", JOptionPane.PLAIN_MESSAGE);

        try {
            Process p = Runtime.getRuntime().exec("shutdown -s -t " + time);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
