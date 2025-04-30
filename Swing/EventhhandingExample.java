
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventhhandingExample {
    public static void main(String[] args) {
        JFrame frame= new JFrame("swing Event handing");
        frame.setSize(350,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button =new JButton("Click me");

        button.setBounds(100,100,120,40);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public  void actionPerformed(ActionEvent actionEvent ){
                JOptionPane.showMessageDialog(frame, "button clicked");
            }
        });



        frame.setVisible(true);
    }
}