package Interface;

import dsproject.Escola;
import java.awt.CardLayout;

public class MainPanel extends javax.swing.JPanel {

    public MainPanel() {
        initComponents();
    }

    public MainPanel(javax.swing.JPanel panel) {
        this.superPanel = panel;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftBarPanel = new javax.swing.JPanel();
        studentButton = new javax.swing.JButton();
        classButton = new javax.swing.JButton();
        testButton = new javax.swing.JButton();
        importExportButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        welcomePanel2 = new Interface.WelcomePanel();
        classPanel1 = new Interface.ClassPanel(this);
        importPanel1 = new Interface.ImportPanel();
        sendPanel1 = new Interface.SendPanel();
        studentPanel1 = new Interface.StudentPanel(this);
        testPanel1 = new Interface.TestPanel();
        exportPanel1 = new Interface.HelpPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentButton.setText("<html><center>Aluno</center></html>");
        studentButton.setPreferredSize(new java.awt.Dimension(57, 30));
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        leftBarPanel.add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 75));

        classButton.setText("<html><center>Turma</center></html>");
        classButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classButtonActionPerformed(evt);
            }
        });
        leftBarPanel.add(classButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 145, 75));

        testButton.setText("<html><center>Avaliações</center></html>");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });
        leftBarPanel.add(testButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 153, 145, 75));

        importExportButton.setText("<html>Importar/Exportar</html>");
        importExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importExportButtonActionPerformed(evt);
            }
        });
        leftBarPanel.add(importExportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 145, 75));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        leftBarPanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 461, 145, 75));

        sendButton.setText("Enviar");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        leftBarPanel.add(sendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 307, 145, 75));

        jButton1.setText("Ajuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        leftBarPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 384, 145, 75));

        add(leftBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        displayPanel.setPreferredSize(new java.awt.Dimension(833, 515));
        displayPanel.setLayout(new java.awt.CardLayout());
        displayPanel.add(welcomePanel2, "card9");
        displayPanel.add(classPanel1, "cardClass");
        displayPanel.add(importPanel1, "cardImport");
        displayPanel.add(sendPanel1, "cardSend");
        displayPanel.add(studentPanel1, "cardStudent");
        displayPanel.add(testPanel1, "cardTest");
        displayPanel.add(exportPanel1, "cardHelp");

        add(displayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 0, -1, 536));
    }// </editor-fold>//GEN-END:initComponents

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        CardLayout card = (CardLayout) displayPanel.getLayout();
        card.show(displayPanel, "cardStudent");
    }//GEN-LAST:event_studentButtonActionPerformed

    private void classButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classButtonActionPerformed
        CardLayout card = (CardLayout) displayPanel.getLayout();
        card.show(displayPanel, "cardClass");
    }//GEN-LAST:event_classButtonActionPerformed

    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        CardLayout card = (CardLayout) displayPanel.getLayout();
        card.show(displayPanel, "cardTest");
    }//GEN-LAST:event_testButtonActionPerformed

    private void importExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importExportButtonActionPerformed
        CardLayout card = (CardLayout) displayPanel.getLayout();
        card.show(displayPanel, "cardImport");
    }//GEN-LAST:event_importExportButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        CardLayout card1 = (CardLayout) displayPanel.getLayout();
        card1.show(displayPanel, "cardWelcome");
        CardLayout card2 = (CardLayout) superPanel.getLayout();
        card2.show(superPanel, "cardLogin");
        this.clear();
        this.logout();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void logout(){
        Escola escola = Escola.getInstance();
        escola.logout();
    }
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        CardLayout card = (CardLayout) displayPanel.getLayout();
        card.show(displayPanel, "cardSend");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout card = (CardLayout) displayPanel.getLayout();
        card.show(displayPanel, "cardHelp");
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classButton;
    private Interface.ClassPanel classPanel1;
    private javax.swing.JPanel displayPanel;
    private Interface.HelpPanel exportPanel1;
    private javax.swing.JButton importExportButton;
    private Interface.ImportPanel importPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel leftBarPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton sendButton;
    private Interface.SendPanel sendPanel1;
    private javax.swing.JButton studentButton;
    private Interface.StudentPanel studentPanel1;
    private javax.swing.JButton testButton;
    private Interface.TestPanel testPanel1;
    private Interface.WelcomePanel welcomePanel2;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel superPanel;

    public ClassPanel getClassPanel(){
        return this.classPanel1;
    }
    
    public StudentPanel getStudentPanel(){
        return this.studentPanel1;
    }
    
    public WelcomePanel getWelcomePanel1() {
        return this.welcomePanel2;
    }

    private void clear() {
        studentPanel1.clearAll();
        classPanel1.clearAll();
    }
}
