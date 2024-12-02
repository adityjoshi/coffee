import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Advanced Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Split Pane
        JTextArea leftTextArea = new JTextArea("Left Pane");
        JTextArea rightTextArea = new JTextArea("Right Pane");
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(leftTextArea), new JScrollPane(rightTextArea));
        splitPane.setDividerLocation(300);

        // Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Split Pane", splitPane);

        // Desktop Pane with Internal Frames
        JDesktopPane desktopPane = new JDesktopPane();

        JInternalFrame internalFrame1 = createInternalFrame("Frame 1", 20, 20);
        JInternalFrame internalFrame2 = createInternalFrame("Frame 2", 100, 100);
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        tabbedPane.addTab("Desktop Pane", desktopPane);

        // Cascading and Tiling
        JButton cascadeButton = new JButton("Cascade Frames");
        cascadeButton.addActionListener(e -> cascadeFrames(desktopPane));

        JButton tileButton = new JButton("Tile Frames");
        tileButton.addActionListener(e -> tileFrames(desktopPane));

        JPanel desktopControlPanel = new JPanel();
        desktopControlPanel.add(cascadeButton);
        desktopControlPanel.add(tileButton);
        tabbedPane.addTab("Desktop Controls", desktopControlPanel);

        // Advanced Components: List, Tree, Table, Progress Bar
        JPanel advancedPanel = new JPanel(new GridLayout(2, 2));

        // List
        JList<String> list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"});
        advancedPanel.add(new JScrollPane(list));

        // Tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);
        advancedPanel.add(new JScrollPane(tree));

        // Table
        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][]{{"1", "John", "25"}, {"2", "Jane", "30"}},
                new Object[]{"ID", "Name", "Age"}
        );
        JTable table = new JTable(tableModel);
        advancedPanel.add(new JScrollPane(table));

        // Progress Bar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);
        progressBar.setStringPainted(true);
        advancedPanel.add(progressBar);

        tabbedPane.addTab("Advanced Components", advancedPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Helper method to create internal frames
    private static JInternalFrame createInternalFrame(String title, int x, int y) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setBounds(x, y, 200, 150);
        internalFrame.setVisible(true);
        return internalFrame;
    }

    // Helper method to cascade internal frames
    private static void cascadeFrames(JDesktopPane desktopPane) {
        int x = 20, y = 20;
        for (JInternalFrame frame : desktopPane.getAllFrames()) {
            frame.setLocation(x, y);
            x += 30;
            y += 30;
        }
    }

    // Helper method to tile internal frames
    private static void tileFrames(JDesktopPane desktopPane) {
        JInternalFrame[] frames = desktopPane.getAllFrames();
        int count = frames.length;
        if (count == 0) return;

        int rows = (int) Math.sqrt(count);
        int cols = (int) Math.ceil((double) count / rows);

        Dimension size = desktopPane.getSize();
        int w = size.width / cols;
        int h = size.height / rows;

        int x = 0, y = 0;
        for (int i = 0; i < count; i++) {
            frames[i].setBounds(x, y, w, h);
            x += w;
            if (x + w > size.width) {
                x = 0;
                y += h;
            }
        }
    }
}