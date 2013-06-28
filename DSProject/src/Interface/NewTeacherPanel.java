/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pazuti
 */
public class NewTeacherPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewTeacherPanel
     */
    public NewTeacherPanel() {
        initComponents();
    }

    public NewTeacherPanel(JPanel superPanel) {
        this.superPanel = superPanel;
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private javax.swing.JPanel superPanel;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cpf = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        cellphone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        adressTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        cellphoneTextField = new javax.swing.JTextField();
        emilTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        email1 = new javax.swing.JLabel();
        emilTextField1 = new javax.swing.JTextField();
        email2 = new javax.swing.JLabel();
        emilTextField2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(984, 536));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpf.setText("CPF");
        jPanel1.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        name.setText("Nome Completo");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 88, -1, -1));

        adress.setText("Endereço");
        jPanel1.add(adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 126, -1, -1));

        phone.setText("Telefone");
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 164, -1, -1));

        cellphone.setText("Celular");
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 202, -1, -1));

        email.setText("E-mail");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));
        jPanel1.add(cpfTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 40, 427, -1));
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 78, 427, -1));
        jPanel1.add(adressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 116, 427, -1));
        jPanel1.add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 154, 427, -1));
        jPanel1.add(cellphoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 192, 427, -1));
        jPanel1.add(emilTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 230, 427, -1));

        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 353, 85, -1));

        email1.setText("Senha");
        jPanel1.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 279, -1, -1));
        jPanel1.add(emilTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 269, 427, -1));

        email2.setText("Confirmar Senha");
        jPanel1.add(email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 318, -1, -1));
        jPanel1.add(emilTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 308, 427, -1));

        jTabbedPane1.addTab("Cadastrar Professor", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        CardLayout card =  (CardLayout) this.superPanel.getLayout();
        card.show(this.superPanel,"cardLogin");
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adress;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JLabel cellphone;
    private javax.swing.JTextField cellphoneTextField;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel email2;
    private javax.swing.JTextField emilTextField;
    private javax.swing.JTextField emilTextField1;
    private javax.swing.JTextField emilTextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}