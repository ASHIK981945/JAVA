import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleuI extends JFrame {

    public SimpleuI() {
        setTitle("Simple UI");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Checkboxes
        JCheckBox c1 = new JCheckBox("java");
        JCheckBox c2 = new JCheckBox("python");
        JCheckBox c3 = new JCheckBox("Rect");

        // Radio buttons
        JRadioButton r1 = new JRadioButton("html");
        JRadioButton r2 = new JRadioButton("css");
        JRadioButton r3 = new JRadioButton("php");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        // Combo boxes
        String[] items = {"basic", "mid_face", "master"};
        JComboBox<String> cb1 = new JComboBox<>(items);
        JComboBox<String> cb2 = new JComboBox<>(items);
        JComboBox<String> cb3 = new JComboBox<>(items);

        // Submit button
        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedItems = new StringBuilder("You selected: ");

                // Checkboxes
                if (c1.isSelected()) selectedItems.append("C1, ");
                if (c2.isSelected()) selectedItems.append("C2, ");
                if (c3.isSelected()) selectedItems.append("C3, ");

                // Radio buttons
                if (r1.isSelected()) selectedItems.append("R1, ");
                else if (r2.isSelected()) selectedItems.append("R2, ");
                else if (r3.isSelected()) selectedItems.append("R3, ");

                // Combo boxes
                selectedItems.append(cb1.getSelectedItem()).append(", ");
                selectedItems.append(cb2.getSelectedItem()).append(", ");
                selectedItems.append(cb3.getSelectedItem());

                // Remove trailing comma if needed
                String message = selectedItems.toString().replaceAll(", $", "");

                JOptionPane.showMessageDialog(null, message);
            }
        });

        // Add components
        add(c1); add(c2); add(c3);
        add(r1); add(r2); add(r3);
        add(cb1); add(cb2); add(cb3);
        add(submit);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleuI();
    }
}
