package dsproject;

import Interface.TestPanel;
import javax.swing.JFrame;

public class DSProject {

    public static void mains(String[] args) {
        JFrame f = new JFrame();
        f.setSize(650, 500);
        f.add(new TestPanel());
        f.setVisible(true);
    }
}
