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
public class ExportPanel extends javax.swing.JPanel {

    /** Creates new form ExportPanel */
    public ExportPanel() {
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
        jButton1 = new javax.swing.JButton();

        exportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("<html>A parte de exportação, gera uma copia do banco de dados local ou todos os dados do banco de dados local com exceçãos das avaliações?????</html>");
        exportPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 807, 54));

        jButton1.setText("Exportar");
        exportPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 101, -1, -1));

        jTabbedPane1.addTab("Exportar ", exportPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exportPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
