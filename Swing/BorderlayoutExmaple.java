
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderlayoutExmaple {
    public static void main(String[] args) {
        JFrame jframe =new JFrame("Border layout Example");
        jframe.setSize(600,500);//w,h
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        jframe.setLayout(new BorderLayout());

        jframe.add(new JButton("header"),BorderLayout.NORTH);
        jframe.add(new JButton("south"),BorderLayout.SOUTH);
        jframe.add(new JButton("right"),BorderLayout.EAST);
        jframe.add(new JButton("left"),BorderLayout.WEST);
        jframe.add(new JButton("mainbody"),BorderLayout.CENTER);

        jframe.setVisible(true);
    }
}
