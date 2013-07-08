package Interface;

public class ImportPanel extends javax.swing.JPanel {

    public ImportPanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        importPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        exportPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(833, 515));
        setPreferredSize(new java.awt.Dimension(833, 515));

        importPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("<html>A parte de importação, recebe uma copia do banco de dados local ou todos os dados do banco de dados local com exceçãos das avaliações</html>");
        importPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 807, 54));

        jButton1.setText("Importar");
        importPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 101, -1, -1));

        jTabbedPane1.addTab("Importar ", importPanel);

        exportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("<html>A parte de exportação, gera uma copia do banco de dados local ou todos os dados do banco de dados local com exceçãos das avaliações?????</html>");
        exportPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 807, 54));

        jButton2.setText("Exportar");
        exportPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 101, -1, -1));

        jTabbedPane1.addTab("Exportar", exportPanel);

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
    private javax.swing.JPanel importPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
