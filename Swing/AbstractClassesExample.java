
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AbstractClassesExample{
    public static void main(String[] args) {
        JFrame jFrame= new JFrame("mouse adapter class example");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         JLabel jLabel = new JLabel("click inside the window");
         jLabel.setBounds(50,50,200,30);

         jFrame.add(jLabel);
         jFrame.setLayout(null);

         jFrame.addMouseListener(new MouseAdapter(){
            @Override
            public void  mouseClicked(MouseEvent e){
                jLabel.setText("Mouse Clicked at :" +
                 e.getX()   + " ," + e.getY()
                 );
            }
         });
        jFrame.setVisible(true);
    }
}