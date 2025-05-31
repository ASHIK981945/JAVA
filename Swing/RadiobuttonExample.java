import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadiobuttonExample {
    public static void main(String[] args) {
        JFrame frame= new JFrame("swing Event handing");
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JRadioButton c1 = new JRadioButton("Radio 1");
        JPanel p = new JPanel();
        p.add(c1);

        frame.add(p);

        

        frame.setVisible(true);
    }
}
