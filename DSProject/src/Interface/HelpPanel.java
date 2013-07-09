package Interface;

public class HelpPanel extends javax.swing.JPanel {

    public HelpPanel() {
        initComponents();
    }
    
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
