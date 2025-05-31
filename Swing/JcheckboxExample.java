import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JcheckboxExample{
    public static void main(String[] args) {
          JFrame frame= new JFrame("swing Event handing");
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JCheckBox c1 = new JCheckBox("checkbox 1");
        JPanel p = new JPanel();
        p.add(c1);

        frame.add(p);

        

        frame.setVisible(true);
    }
}