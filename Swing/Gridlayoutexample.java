import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayoutexample {
    public static void main(String[] args) {
        JFrame jframe =new JFrame("Border layout Example");
        jframe.setSize(600,500);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        jframe.setLayout(new GridLayout(2,3));//r,c
        for (int i = 1; i <=10; i++) {
            jframe.add(new JButton("Button" + i));
        }


        jframe.setVisible(true);

    }
}
