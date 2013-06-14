package dsproject;

import Interface.PIPanel;
import javax.swing.JFrame;

public class DSProject {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(650, 500);
        f.add(new PIPanel());
        f.setVisible(true);
    }
}
