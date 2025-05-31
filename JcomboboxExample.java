import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JcomboboxExample {
    public static void main(String[] args) {
         JFrame frame= new JFrame("swing Event handing");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        String s1[] = { "PROKHARA", "PALPA", "KTM", "BUTWAL", "JHAPA" };
        JComboBox c1 = new JComboBox(s1);
        JPanel p = new JPanel();
        p.add(c1);

        frame.add(p);
          

        frame.setVisible(true);
    }
}
