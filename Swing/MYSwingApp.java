// package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MYSwingApp {
    public static void main(String[] args) {
        //create a freame
        JFrame jFrame = new JFrame("my swing application");

        // set form size
        jFrame.setSize(500,300);

        // close operation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set defult layout
        jFrame.setLayout(null);

        //create compone
        JLabel jLabel= new JLabel("Enter You Name");
        jLabel.setBounds(50,70,200,100);
        JTextField jTextField=new JTextField(20);
        jTextField.setBounds(50,70,100,30);
        JButton jButton = new JButton("submit");
        jButton.setBounds(150,180,90,30);
        jFrame.add(jLabel);
        jFrame.add(jTextField);
        jFrame.add(jButton);

        // set visibility
        jFrame.setVisible(true);
    }
}


// int x,y,h,w set 