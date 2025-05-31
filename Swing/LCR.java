import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LCR {
    public static void main(String[] args) {
         JFrame frame1= new JFrame("swing Event handing");
        frame1.setSize(350,300);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new FlowLayout(FlowLayout.L));
        JButton button1 =new JButton("Click me");
        frame1.add(button1);

        JFrame cframe= new JFrame("swing Event handing");
        cframe.setSize(350,300);
        cframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cframe.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button2=new JButton("Click me");
        cframe.add(button2);


        JFrame Rframe= new JFrame("swing Event handing");
        Rframe.setSize(350,300);
        Rframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Rframe.setLayout(new FlowLayout(FlowLayout.TRAILING));
        JButton button3 =new JButton("Click me");
        Rframe.add(button3);


        frame1.setLocation(100, 100); 
        cframe.setLocation(450, 100);
        Rframe.setLocation(800, 100);

        frame1.setVisible(true);
        cframe.setVisible(true);
        Rframe.setVisible(true);
    }
}
