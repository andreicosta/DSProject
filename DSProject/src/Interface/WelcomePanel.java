package Interface;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class WelcomePanel extends javax.swing.JPanel {

    public WelcomePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeMessage = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(833, 515));
        setPreferredSize(new java.awt.Dimension(833, 515));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeMessage.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        welcomeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeMessage.setText("Bem Vindo ao PRODOWN");
        welcomeMessage.setPreferredSize(new java.awt.Dimension(833, 21));
        add(welcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables

    public void setWelcomeMessage(String s) {
        this.welcomeMessage.setText(s + ", Bem Vindo ao PRODOWN");
    }

}
