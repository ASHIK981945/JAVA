import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JtableExample {

    public static void main(String[] args) {
       
        JFrame frame = new JFrame("JTable Example");

        String[] columnNames = { "Name", "Roll Number", "Department" };

        String[][] data = {
            { "ashik", "1", "BCA" },
            { "OM", "2", "IT" },
            
        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);

        frame.setSize(500, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
