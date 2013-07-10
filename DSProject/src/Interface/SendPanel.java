package Interface;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class SendPanel extends javax.swing.JPanel {

    public SendPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        importPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        try{
            BufferedImage enviarImg = ImageIO.read(new File("images/send.png"));
            jLabel3 = new javax.swing.JLabel(new ImageIcon(enviarImg));

            setMinimumSize(new java.awt.Dimension(833, 515));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            importPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setText("<html>A função de enviar abre o site do projeto Prodown diretamente para facilitar o envio das Avaliações realizadas.</html>");
            importPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, 784, 54));

            jButton1.setText("Enviar");
            importPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 84, -1));

            /*
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(null);
            */
        }catch(Exception e){
            jLabel1.setText("");
        }
        importPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 232, 800, 240));

        jTabbedPane1.addTab("Enviar", importPanel);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel importPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
