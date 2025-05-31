import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class AttendanceUI {
    private AttendanceSystem system;
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;

    public AttendanceUI() {
        system = new AttendanceSystem();
        initUI();
    }

    private void initUI() {
        frame = new JFrame("Attendance Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Top Panel - Add Student
        JPanel topPanel = new JPanel();
        JTextField idField = new JTextField(5);
        JTextField nameField = new JTextField(10);
        JButton addButton = new JButton("Add Student");

        topPanel.add(new JLabel("ID:"));
        topPanel.add(idField);
        topPanel.add(new JLabel("Name:"));
        topPanel.add(nameField);
        topPanel.add(addButton);

        // Table for Attendance
        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Present"}, 0);
        table = new JTable(tableModel);

        // Bottom Panel - Mark Attendance
        JPanel bottomPanel = new JPanel();
        JButton presentButton = new JButton("Mark Present");
        JButton absentButton = new JButton("Mark Absent");

        bottomPanel.add(presentButton);
        bottomPanel.add(absentButton);

        // Add Listeners
        addButton.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            Student student = new Student(id, name);
            system.addStudent(student);
            tableModel.addRow(new Object[]{id, name, "No"});
            idField.setText("");
            nameField.setText("");
        });

        presentButton.addActionListener(e -> markSelected(true));
        absentButton.addActionListener(e -> markSelected(false));

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void markSelected(boolean present) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int studentId = (int) tableModel.getValueAt(selectedRow, 0);
            system.markAttendance(studentId, present);
            tableModel.setValueAt(present ? "Yes" : "No", selectedRow, 2);
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a student.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AttendanceUI::new);
    }
}
