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

    private int EkranX, EkranY;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Container c;

    public TimerMain() {
        add(panel1);
        setTitle("Kapatma Zamanlayıcısı");
        c = this.getContentPane();
        EkranX = (int) kit.getScreenSize().width; //Ekran boyutunun genişliğini alıyoruz...
        EkranY = (int) kit.getScreenSize().height;//Ekran boyutunun yüksekliğini alıyoruz...
        this.setSize(400, 200); // Pencere boyutunu belirliyoruz...
        this.setLocation((EkranX - 600) / 2, (EkranY - 470) / 2); // Pencerenin ekranın tam ortasında açılması için pencere yüksekliği ve genişliğinin yarısı kadar geri çekme işlemi uyguluyoruz...

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        başlatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String timeS = textField1.getText();
                int time;
                try {
                    time = Integer.parseInt(timeS);
                } catch (NumberFormatException exx) {
                    time = 120;
                    JOptionPane.showMessageDialog(null, "Yanlış veri girdisi, bilgisayar 120 saniye sonra kapatılacak...");
                }
                JOptionPane.showMessageDialog(null, "Geri sayım başlatıldı " + time);

                try {
                    Process p = Runtime.getRuntime().exec("shutdown -s -t " + time);
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(p.getInputStream()));

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        DURDURButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Process p = Runtime.getRuntime().exec("shutdown /a ");
                    JOptionPane.showMessageDialog(null, "ZAMANLAYICI DURDURULDU.");
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(p.getInputStream()));

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}
