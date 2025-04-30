import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowlayoutExample {
    public static void main(String[] args) {
         JFrame frame= new JFrame("swing Event handing");
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton button1 =new JButton("Click me");
        frame.add(button1);

        JButton button2=new JButton("Click me");
        frame.add(button2);

        JButton button3 =new JButton("Click me");
        frame.add(button3);


        frame.setVisible(true);

    }
}
