import Core.MainFunc;
import Helper.Helper;
import org.jdesktop.swingx.JXTextField;
import org.jdesktop.swingx.prompt.PromptSupport;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TimerMain extends JFrame {


    private JTextField textField1;
    private JButton başlatButton;
    private JPanel panel1;
    private JButton DURDURButton;
    private JButton btn30Sec;
    private JButton btn60Sec;
    private JButton btn180Sec;

    private int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;
    ImageIcon icon;

    public TimerMain() {
        add(panel1);
        this.setSize(550, 200);
        setTitle("Kapatma Zamanlayıcısı");
        c = this.getContentPane();


        //Icon area
        this.setLocation(Helper.ScreenC("x", getSize()), Helper.ScreenC("y", getSize()));
        icon = new ImageIcon("src/Image/icon.png");
        setIconImage(icon.getImage());


        PromptSupport.setPrompt("Saniye cinsinden süreyi giriniz.", textField1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        başlatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MainFunc.close(textField1);
            }
        });
        DURDURButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process p = Runtime.getRuntime().exec("shutdown /a ");
                    JOptionPane.showMessageDialog(null, "Zamanlayıcı Durduruldu!", "Uyarı", JOptionPane.PLAIN_MESSAGE);
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(p.getInputStream()));

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        btn30Sec.addActionListener(e -> MainFunc.close(btn30Sec));
        btn60Sec.addActionListener(e -> MainFunc.close(btn60Sec));
        btn180Sec.addActionListener(e -> MainFunc.close(btn180Sec));

        this.setVisible(true);
    }
}
