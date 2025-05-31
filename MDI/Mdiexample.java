
// import javax.swing.JDesktopPane;
// import javax.swing.JFrame;
// import javax.swing.JInternalFrame;
// import javax.swing.JMenu;
// import javax.swing.JMenuBar;
// import javax.swing.JMenuItem;
// import javax.swing.SwingUtilities;

// public class Mdiexample extends JFrame{
//     private final JDesktopPane desktopPanel;
//     public Mdiexample(){
//         setTitle("MDI Example using Jdesktop and Internal frame ");
//         setSize(800,600);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);

//         desktopPanel = new JDesktopPane();
//         add(desktopPanel);

//         JMenuBar menuBar = new JMenuBar();
//         setJMenuBar(menuBar);
//         JMenu menu = new JMenu("File");
//         menuBar.add(menu);


//         JMenuItem newItem = new JMenuItem("new window ");
//         newItem.addActionListener(e -> createInternalFrame());
//         menu.add(newItem);

//         JMenuItem exitItem = new JMenuItem("Exit");
//         exitItem.addActionListener(e -> System.exit(0));
//         menu.add(exitItem);
//     }

//     private void createInternalFrame(){
//         JInternalFrame internalFrame = new JInternalFrame(
//             "Internal frame",true,true,true,true
//         );
//         internalFrame.setSize(300, 200);
//         internalFrame.setVisible(true);

//         desktopPanel.add(internalFrame);

//         try {
//             internalFrame.setSelected(true);
//         } catch (java.beans.PropertyVetoException e) {
//             e.printStackTrace();
//         }
//     }
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             new Mdiexample().setVisible(true);
//         });
//     }
// }