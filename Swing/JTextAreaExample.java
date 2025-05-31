import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");

        JTextArea textArea = new JTextArea(10, 30);

        textArea.setText("Write something here...");

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
