/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExportPanel.java
 *
 * Created on 14/06/2013, 17:32:42
 */
package Interface;

/**
 *
 * @author Günther
 */
public class HelpPanel extends javax.swing.JPanel {

    /** Creates new form ExportPanel */
    public HelpPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        exportPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(833, 515));

        exportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("<html>AJUDA!!!!!!</html>");
        exportPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 807, 54));

        jTabbedPane1.addTab("Ajuda", exportPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exportPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}