package Interface;

import dsproject.*;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
*
* @author Günther
*/
public class StudentPanel extends javax.swing.JPanel {

    public StudentPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        newStudentPanel = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelBirthday = new javax.swing.JLabel();
        labelFather = new javax.swing.JLabel();
        labelMother = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelTelephone = new javax.swing.JLabel();
        labelMobile = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        mother = new javax.swing.JTextField();
        father = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        labelGender = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        labelCity = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        birthday = new com.toedter.calendar.JDateChooser();
        turma = new javax.swing.JComboBox();
        labelTurma = new javax.swing.JLabel();
        editStudentPanel = new javax.swing.JPanel();
        editLabelName = new javax.swing.JLabel();
        editLabelFather = new javax.swing.JLabel();
        editLabelMother = new javax.swing.JLabel();
        editLabelAddress = new javax.swing.JLabel();
        editLabelTelephone = new javax.swing.JLabel();
        editLabelMobile = new javax.swing.JLabel();
        editLabelBirthday = new javax.swing.JLabel();
        editLabelEmail = new javax.swing.JLabel();
        editMother = new javax.swing.JTextField();
        editFather = new javax.swing.JTextField();
        editTelephone = new javax.swing.JTextField();
        editAddress = new javax.swing.JTextField();
        editMobile = new javax.swing.JTextField();
        editEmail = new javax.swing.JTextField();
        editName = new javax.swing.JComboBox();
        editSaveButton = new javax.swing.JButton();
        editLabelGender = new javax.swing.JLabel();
        editGender = new javax.swing.JComboBox();
        editLabelCity = new javax.swing.JLabel();
        editCity = new javax.swing.JTextField();
        editBirthday = new com.toedter.calendar.JDateChooser();
        editTurma = new javax.swing.JComboBox();
        editLabelTurma = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        deleteStudentPanel = new javax.swing.JPanel();
        deleteLabel = new javax.swing.JLabel();
        deleteCombo = new javax.swing.JComboBox();
        deleteButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(833, 515));

        newStudentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelName.setText("Nome Completo");
        newStudentPanel.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 45, -1, -1));

        labelBirthday.setText("Data de Nascimento");
        newStudentPanel.add(labelBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 112, -1, -1));

        labelFather.setText("Nome Completo do Pai");
        newStudentPanel.add(labelFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 277, -1, 14));

        labelMother.setText("Nome Completo da Mãe");
        newStudentPanel.add(labelMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 243, -1, -1));

        labelAddress.setText("Endereço");
        newStudentPanel.add(labelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 177, -1, -1));

        labelTelephone.setText("Telefone");
        newStudentPanel.add(labelTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 309, -1, -1));

        labelMobile.setText("Celular");
        newStudentPanel.add(labelMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 342, -1, -1));

        labelEmail.setText("E-mail");
        newStudentPanel.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 376, -1, -1));

        name.setToolTipText("teste");
        newStudentPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 40, 396, -1));
        newStudentPanel.add(mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 238, 396, -1));
        newStudentPanel.add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 271, 396, -1));
        newStudentPanel.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 304, 396, -1));
        newStudentPanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 172, 396, -1));
        newStudentPanel.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 337, 396, -1));
        newStudentPanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 371, 396, -1));

        createButton.setText("Cadastrar");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        newStudentPanel.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 417, 90, -1));

        labelGender.setText("Gênero");
        newStudentPanel.add(labelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 144, -1, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        newStudentPanel.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 139, 396, -1));

        labelCity.setText("Cidade/Estado");
        newStudentPanel.add(labelCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 210, -1, -1));
        newStudentPanel.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 205, 396, -1));
        newStudentPanel.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 106, 396, -1));

        turma.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                turmaPopupMenuWillBecomeVisible(evt);
            }
        });
        newStudentPanel.add(turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 73, 396, -1));

        labelTurma.setText("Turma");
        newStudentPanel.add(labelTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 79, -1, -1));

        jTabbedPane1.addTab("Cadastrar Aluno", newStudentPanel);

        editStudentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editLabelName.setText("Selecionar Aluno");
        editStudentPanel.add(editLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 35, -1, -1));

        editLabelFather.setText("Nome Completo do Pai");
        editStudentPanel.add(editLabelFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 277, -1, 14));

        editLabelMother.setText("Nome Completo da Mãe");
        editStudentPanel.add(editLabelMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 243, -1, -1));

        editLabelAddress.setText("Endereço");
        editStudentPanel.add(editLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 177, -1, -1));

        editLabelTelephone.setText("Telefone");
        editStudentPanel.add(editLabelTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 309, -1, -1));

        editLabelMobile.setText("Celular");
        editStudentPanel.add(editLabelMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 342, -1, -1));

        editLabelBirthday.setText("Data de Nascimento");
        editStudentPanel.add(editLabelBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 112, -1, -1));

        editLabelEmail.setText("E-mail");
        editStudentPanel.add(editLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 376, -1, -1));
        editStudentPanel.add(editMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 238, 396, -1));
        editStudentPanel.add(editFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 271, 396, -1));
        editStudentPanel.add(editTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 304, 396, -1));
        editStudentPanel.add(editAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 172, 396, -1));
        editStudentPanel.add(editMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 337, 396, -1));
        editStudentPanel.add(editEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 371, 396, -1));

        editName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                editNamePopupMenuWillBecomeVisible(evt);
            }
        });
        editName.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                editNameComponentShown(evt);
            }
        });
        editStudentPanel.add(editName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 30, 396, -1));

        editSaveButton.setText("Salvar");
        editSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSaveButtonActionPerformed(evt);
            }
        });
        editStudentPanel.add(editSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 416, 90, -1));

        editLabelGender.setText("Gênero");
        editStudentPanel.add(editLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 144, -1, -1));

        editGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        editStudentPanel.add(editGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 139, 396, -1));

        editLabelCity.setText("Cidade/Estado");
        editStudentPanel.add(editLabelCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 210, -1, -1));
        editStudentPanel.add(editCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 205, 396, -1));

        editBirthday.setPreferredSize(new java.awt.Dimension(396, 27));
        editStudentPanel.add(editBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 106, -1, -1));

        editTurma.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                editTurmaPopupMenuWillBecomeVisible(evt);
            }
        });
        editStudentPanel.add(editTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 73, 396, -1));

        editLabelTurma.setText("Turma");
        editStudentPanel.add(editLabelTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 79, -1, -1));
        editStudentPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 10));

        jTabbedPane1.addTab("Editar Informações do Aluno", editStudentPanel);

        deleteStudentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteLabel.setText("Selecione um Aluno");
        deleteStudentPanel.add(deleteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        deleteCombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                deleteComboPopupMenuWillBecomeVisible(evt);
            }
        });
        deleteStudentPanel.add(deleteCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 536, -1));

        deleteButton.setText("Excluir");
        deleteStudentPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 80, 90, -1));

        jTabbedPane1.addTab("Excluir Cadastro do Aluno", deleteStudentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

   private void createButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createButtonActionPerformed
   {//GEN-HEADEREND:event_createButtonActionPerformed
       flag = false;
       String nameNewStudent = getNameStudent();
       Turma newTurma = getTurma();
       Date newBirthday = getBirthday();
       String newGender = getGender();
       String newAddress = getAddress();
       String newCity = getCity();
       String newMotherName = getMotherName();
       String newFatherName = getFatherName();
       String newTelephone = getTelephone();
       String newMobile = getMobile();
       String newEmail = getEmail();
       
       if (!flag) {
           Aluno student = new Aluno(nameNewStudent, newTurma, newBirthday, newGender, newAddress, newCity, newMotherName, newFatherName, newTelephone, newMobile, newEmail);

           if (newTurma == null) {
           } else {
               newTurma.inserirAluno(student);
           }

           JOptionPane.showMessageDialog(null, "Aluno "+student.toString()+" criado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);

           clearNewStudent();
       }
   }//GEN-LAST:event_createButtonActionPerformed

    private String getNameStudent() {
        if (name.getText().isEmpty()) {
            labelName.setForeground(Color.red);
            flag = true;
            return null;
        }
        labelName.setForeground(Color.black);
        return name.getText();
    }

    private Date getBirthday() {
        if (birthday.getDate() == null) {
            labelBirthday.setForeground(Color.red);
            flag = true;
            return null;
        }
        labelBirthday.setForeground(Color.black);
        return birthday.getDate();
    }

    private String getGender() {
        return gender.getSelectedItem().toString();
    }

    private String getAddress() {
        if (address.getText().isEmpty()) {
            labelAddress.setForeground(Color.red);
            flag = true;
            return null;
        }
        labelAddress.setForeground(Color.black);
        return address.getText();
    }

    private String getCity() {
        if (city.getText().isEmpty()) {
            labelCity.setForeground(Color.red);
            flag = true;
            return null;
        }
        labelCity.setForeground(Color.black);
        return city.getText();
    }

    private String getMotherName() {
        if (mother.getText().isEmpty()) {
            labelMother.setForeground(Color.red);
            flag = true;
            return null;
        }
        labelMother.setForeground(Color.black);
        return mother.getText();
    }

    private String getFatherName() {
        if (father.getText().isEmpty()) {
            labelFather.setForeground(Color.red);
            flag = true;
            return null;
        }
        labelFather.setForeground(Color.black);
        return father.getText();
    }

    private String getTelephone() {
        return telephone.getText();
    }

    private String getMobile() {
        return mobile.getText();
    }

    private String getEmail() {
        return email.getText();
    }

   private void deleteComboPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_deleteComboPopupMenuWillBecomeVisible
   {//GEN-HEADEREND:event_deleteComboPopupMenuWillBecomeVisible
       this.deleteCombo.removeAllItems();
       for (Turma i : Escola.getInstance().getLogado().getTurmas()) {
           for (Aluno j : i.buscaTodosAlunos()){
               this.deleteCombo.addItem(j);
           }
       }
   }//GEN-LAST:event_deleteComboPopupMenuWillBecomeVisible

    private void editComboNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editComboNameItemStateChanged
        Aluno student = (Aluno) this.editName.getSelectedItem();
        
        if (student == null){
            clearEditStudent();
            return;
        }
        
        this.editBirthday.setDate(student.getBirthday());
        this.editTurma.addItem(student.getTurma());
        this.editTurma.setSelectedIndex(0);
        this.editGender.setSelectedItem(student.getGenero());
        this.editAddress.setText(student.getEndereco());
        this.editCity.setText(student.getCidade());
        this.editMother.setText(student.getNomeDaMae());
        this.editFather.setText(student.getNomeDoPai());
        this.editTelephone.setText(student.getTelefone());
        this.editMobile.setText(student.getCelular());
        this.editEmail.setText(student.getEmail());
    }//GEN-LAST:event_editComboNameItemStateChanged

    private void editSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSaveButtonActionPerformed
        flag = false;
        Aluno student = getEditStudent();
        Turma newTurma = getEditTurma();
        Date newBirthday = getEditBirthday();
        String newGender = getEditGender();
        String newAddress = getEditAddress();
        String newCity = getEditCity();
        String newMotherName = getEditMotherName();
        String newFatherName = getEditFatherName();
        String newTelephone = getEditTelephone();
        String newMobile = getEditMobile();
        String newEmail = getEditEmail();
        
        if (!flag) {
            student.setTurma(newTurma);
            student.setDataDenascimento(newBirthday);
            student.setGenero(newGender);
            student.setEndereco(newAddress);
            student.setCidade(newCity);
            student.setNomeDaMae(newMotherName);
            student.setNomeDoPai(newFatherName);
            student.setTelefone(newTelephone);
            student.setCelular(newMobile);
            student.setEmail(newEmail);

            JOptionPane.showMessageDialog(null, "Aluno editado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);

            clearEditStudent();
        }
    }//GEN-LAST:event_editSaveButtonActionPerformed

    private void editStudentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_editStudentComponentShown
        this.editTurma.removeAllItems();
    }//GEN-LAST:event_editStudentComponentShown

    private void deleteStudentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteStudentComponentShown
        this.deleteCombo.removeAllItems();
    }//GEN-LAST:event_deleteStudentComponentShown

    private void editNameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_editNameComponentShown
        this.editName.removeAllItems();
    }//GEN-LAST:event_editNameComponentShown

    private void turmaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_turmaPopupMenuWillBecomeVisible
        this.turma.removeAllItems();
        Professor prof = Escola.getInstance().getLogado();
        for (Turma i : prof.getTurmas()){
            this.turma.addItem(i);
        }
    }//GEN-LAST:event_turmaPopupMenuWillBecomeVisible

    private void editTurmaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_editTurmaPopupMenuWillBecomeVisible
        this.editTurma.removeAllItems();
        for(Turma i : Escola.getInstance().getLogado().getTurmas()){
            this.editTurma.addItem(i);
        }
    }//GEN-LAST:event_editTurmaPopupMenuWillBecomeVisible

    private void editNamePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_editNamePopupMenuWillBecomeVisible
        this.editName.removeAllItems();
        Professor prof = Escola.getInstance().getLogado();
        System.out.println(prof.getTurmas());
        for (Turma i : prof.getTurmas()){
            System.out.println(i.buscaTodosAlunos());
           for (Aluno j : i.buscaTodosAlunos()){
               this.editName.addItem(j);
           }
        }
    }//GEN-LAST:event_editNamePopupMenuWillBecomeVisible

    private Aluno getEditStudent(){
        Aluno temp = (Aluno) this.editName.getSelectedItem();
        if (temp == null){
            this.editLabelName.setForeground(Color.red);
            flag = true;
            return null;
        }
        this.editLabelName.setForeground(Color.black);
        return temp;
    }    
    
    private Turma getTurma() {
        return (Turma) this.turma.getSelectedItem();
    }

    private Turma getEditTurma() {
        return (Turma) this.editTurma.getSelectedItem();
    }
    
    private Date getEditBirthday() {
        if (editBirthday.getDate() == null) {
            editLabelBirthday.setForeground(Color.red);
            flag = true;
            return null;
        }
        editLabelBirthday.setForeground(Color.black);
        return editBirthday.getDate();
    }

    private String getEditGender() {
        return editGender.getSelectedItem().toString();
    }

    private String getEditAddress() {
        if (editAddress.getText().isEmpty()) {
            editLabelAddress.setForeground(Color.red);
            flag = true;
            return null;
        }
        editLabelAddress.setForeground(Color.black);
        return editAddress.getText();
    }

    private String getEditCity() {
        if (editCity.getText().isEmpty()) {
            editLabelCity.setForeground(Color.red);
            flag = true;
            return null;
        }
        editLabelCity.setForeground(Color.black);
        return editCity.getText();
    }

    private String getEditMotherName() {
        if (editMother.getText().isEmpty()) {
            editLabelMother.setForeground(Color.red);
            flag = true;
            return null;
        }
        editLabelMother.setForeground(Color.black);
        return editMother.getText();
    }

    private String getEditFatherName() {
        if (editFather.getText().isEmpty()) {
            editLabelFather.setForeground(Color.red);
            flag = true;
            return null;
        }
        editLabelFather.setForeground(Color.black);
        return editFather.getText();
    }

    private String getEditTelephone() {
        return editTelephone.getText();
    }

    private String getEditMobile() {
        return editMobile.getText();
    }

    private String getEditEmail() {
        return editEmail.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser birthday;
    private javax.swing.JTextField city;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox deleteCombo;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JPanel deleteStudentPanel;
    private javax.swing.JTextField editAddress;
    private com.toedter.calendar.JDateChooser editBirthday;
    private javax.swing.JTextField editCity;
    private javax.swing.JTextField editEmail;
    private javax.swing.JTextField editFather;
    private javax.swing.JComboBox editGender;
    private javax.swing.JLabel editLabelAddress;
    private javax.swing.JLabel editLabelBirthday;
    private javax.swing.JLabel editLabelCity;
    private javax.swing.JLabel editLabelEmail;
    private javax.swing.JLabel editLabelFather;
    private javax.swing.JLabel editLabelGender;
    private javax.swing.JLabel editLabelMobile;
    private javax.swing.JLabel editLabelMother;
    private javax.swing.JLabel editLabelName;
    private javax.swing.JLabel editLabelTelephone;
    private javax.swing.JLabel editLabelTurma;
    private javax.swing.JTextField editMobile;
    private javax.swing.JTextField editMother;
    private javax.swing.JComboBox editName;
    private javax.swing.JButton editSaveButton;
    private javax.swing.JPanel editStudentPanel;
    private javax.swing.JTextField editTelephone;
    private javax.swing.JComboBox editTurma;
    private javax.swing.JTextField email;
    private javax.swing.JTextField father;
    private javax.swing.JComboBox gender;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JLabel labelAddress;
    private static javax.swing.JLabel labelBirthday;
    private static javax.swing.JLabel labelCity;
    private static javax.swing.JLabel labelEmail;
    private static javax.swing.JLabel labelFather;
    private static javax.swing.JLabel labelGender;
    private static javax.swing.JLabel labelMobile;
    private static javax.swing.JLabel labelMother;
    private static javax.swing.JLabel labelName;
    private static javax.swing.JLabel labelTelephone;
    private javax.swing.JLabel labelTurma;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField mother;
    private javax.swing.JTextField name;
    private javax.swing.JPanel newStudentPanel;
    private javax.swing.JTextField telephone;
    private javax.swing.JComboBox turma;
    // End of variables declaration//GEN-END:variables
    private boolean flag;

    public void clearNewStudent() {
        name.setText("");
        address.setText("");
        mobile.setText("");
        city.setText("");
        birthday.setDate(null);
        email.setText("");
        father.setText("");
        mother.setText("");
        telephone.setText("");
    }

    public void clearEditStudent() {
        editMobile.setText("");
        editCity.setText("");
        editTurma.removeAllItems();
        birthday.setDate(null);
        editEmail.setText("");
        editAddress.setText("");
        editMother.setText("");
        editFather.setText("");
        editTelephone.setText("");
    }
}
