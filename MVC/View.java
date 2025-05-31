
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// package MVC;  
public class View extends  JFrame{
    JTextField jTextField = new JTextField(15);
    JButton jButton = new JButton("Greet");
    JLabel jLabel = new JLabel("Enter your name: ");
    
    public View(){
        setTitle("MVC Example");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(jLabel);
        add(jTextField);
        add(jButton);

        setVisible(true);
    }
    public String getNameInput(){
        return jTextField.getText();
    }   
    public void setGreeting(String greet){
        jLabel.setText(greet);
    }
    public JButton getButton(){
        return jButton;
    }   

    Object getGreetButton() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
