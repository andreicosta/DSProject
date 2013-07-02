/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import dsproject.Escola;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author pazuti, Israel
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
        senha = new javax.swing.JLabel();
        passwTextField = new javax.swing.JTextField();
        confsenha = new javax.swing.JLabel();
        confPassTextField = new javax.swing.JTextField();

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

        senha.setText("Senha");
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 279, -1, -1));

        passwTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 269, 427, -1));

        confsenha.setText("Confirmar Senha");
        jPanel1.add(confsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 318, -1, -1));
        jPanel1.add(confPassTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 308, 427, -1));

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
        erroscadlist = Escola.getInstance().cadastrarProfessor(cpfTextField.getText(),nameTextField.getText(),
                                  adressTextField.getText(),phoneTextField.getText(),
                                  cellphoneTextField.getText(),emilTextField.getText(),
                                  passwTextField.getText(),confPassTextField.getText());
        int error;
        if(erroscadlist.get(0).equals(0)){
            // sem erros - tudo lindo
            return;
        }else{
            for(int i =0 ; i< erroscadlist.size();i++){
                error = erroscadlist.get(i);
                switch(error)
                {
                    case(1):
                        //erro cpf
                        cpf.setForeground(Color.red);
                        return;
                    case(2):
                        // error nome
                        name.setForeground(Color.red);
                        return;
                    case(3):
                        //error endereço
                        adress.setForeground(Color.red);
                        return;
                    case(4):
                        // erro telefone
                        phone.setForeground(Color.red);
                        return;
                    case(5):
                         // erro celular
                         cellphone.setForeground(Color.red);
                        return;
                    case(6):
                        // erro email
                        email.setForeground(Color.red);
                        return;
                    case(7):
                        // erro senha
                        senha.setForeground(Color.red);
                        return;
                }         
            }
        }
        
        CardLayout card =  (CardLayout) this.superPanel.getLayout();
        card.show(this.superPanel,"cardLogin");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void passwTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwTextFieldActionPerformed

    private ArrayList<Integer> erroscadlist ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adress;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JLabel cellphone;
    private javax.swing.JTextField cellphoneTextField;
    private javax.swing.JTextField confPassTextField;
    private javax.swing.JLabel confsenha;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emilTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwTextField;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}
