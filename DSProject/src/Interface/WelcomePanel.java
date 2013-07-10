package Interface;

import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class WelcomePanel extends javax.swing.JPanel {

    public WelcomePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeMessage = new javax.swing.JLabel();
        try{
            BufferedImage pic = ImageIO.read(new File("images/roda_grande.gif"));
            jLabel4 = new javax.swing.JLabel(new ImageIcon(pic));

            setMinimumSize(new java.awt.Dimension(833, 515));
            setPreferredSize(new java.awt.Dimension(833, 515));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            welcomeMessage.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
            welcomeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            welcomeMessage.setText("Bem Vindo ao PRODOWN");
            welcomeMessage.setPreferredSize(new java.awt.Dimension(833, 21));
            add(welcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, -1));

            /*
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText(null);
            */
        }catch(Exception e){
            jLabel4.setText("");
        }
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 70, 995, 330));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables

    public void setWelcomeMessage(String s) {
        this.welcomeMessage.setText(s + ", Bem Vindo ao PRODOWN");
    }

}
