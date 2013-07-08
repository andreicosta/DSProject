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
        try{
            BufferedImage pic = ImageIO.read(new File("prodown.png"));
            jLabel1 = new javax.swing.JLabel(new ImageIcon(pic));

            setMinimumSize(new java.awt.Dimension(833, 515));
            setPreferredSize(new java.awt.Dimension(833, 515));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            welcomeMessage.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
            welcomeMessage.setText("Bem Vindo ao PRODOWN");
            add(welcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

            /*
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText(null);
            */
        }catch(Exception e){
            jLabel1.setText("");
        }
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 120));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables

    public void setWelcomeMessage(String s) {
        this.welcomeMessage.setText(s + ", Bem Vindo ao PRODOWN");
    }

}
