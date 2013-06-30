package Interface;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import dsproject.Aluno;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Günther
 */
public class StudentPanel extends javax.swing.JPanel {

    public StudentPanel() {
        initComponents();
        /*Setar datas maximas e minimas
        this.birthday.setMinSelectableDate(null);
        this.birthday.setMaxSelectableDate(null);
        this.editBirthday.setMinSelectableDate(null);
        this.editBirthday.setMaxSelectableDate(null);
        */
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        createStudent = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        labelBirthday = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelCity = new javax.swing.JLabel();
        labelState = new javax.swing.JLabel();
        labelMotherName = new javax.swing.JLabel();
        labelFatherName = new javax.swing.JLabel();
        labelTelephone = new javax.swing.JLabel();
        labelMobile = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        birthday = new com.toedter.calendar.JDateChooser();
        gender = new javax.swing.JComboBox();
        address = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        motherName = new javax.swing.JTextField();
        fatherName = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        editStudent = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelNomeDoPai = new javax.swing.JLabel();
        labelNomeDaMae = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelCelular = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        labelE_mail = new javax.swing.JLabel();
        editMotherName = new javax.swing.JTextField();
        editFatherName = new javax.swing.JTextField();
        editTelephone = new javax.swing.JTextField();
        editAddress = new javax.swing.JTextField();
        editMobile = new javax.swing.JTextField();
        editEmail = new javax.swing.JTextField();
        editComboName = new javax.swing.JComboBox();
        editSaveButton = new javax.swing.JButton();
        labelGenero = new javax.swing.JLabel();
        editGender = new javax.swing.JComboBox();
        labelCidade = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        editCity = new javax.swing.JTextField();
        editState = new javax.swing.JTextField();
        editBirthday = new com.toedter.calendar.JDateChooser();
        deleteStudent = new javax.swing.JPanel();
        deleteCombo = new javax.swing.JComboBox();
        deleteButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(833, 515));

        createStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelName.setText("Nome Completo");
        createStudent.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 45, -1, -1));

        labelBirthday.setText("Data de Nascimento");
        createStudent.add(labelBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 20));

        labelGender.setText("Gênero");
        createStudent.add(labelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 111, -1, -1));

        labelAddress.setText("Endereço");
        createStudent.add(labelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 144, -1, -1));

        labelCity.setText("Cidade");
        createStudent.add(labelCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 177, -1, -1));

        labelState.setText("Estado");
        createStudent.add(labelState, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 210, -1, -1));

        labelMotherName.setText("Nome Completo da Mãe");
        createStudent.add(labelMotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 243, -1, -1));

        labelFatherName.setText("Nome Completo do Pai");
        createStudent.add(labelFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 277, -1, 14));

        labelTelephone.setText("Telefone");
        createStudent.add(labelTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 309, -1, -1));

        labelMobile.setText("Celular");
        createStudent.add(labelMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 342, -1, -1));

        labelEmail.setText("E-mail");
        createStudent.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 376, -1, -1));

        name.setToolTipText("teste");
        createStudent.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 40, 396, -1));
        createStudent.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 73, 396, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outro" }));
        createStudent.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 106, 396, -1));
        createStudent.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 139, 396, -1));
        createStudent.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 172, 396, -1));
        createStudent.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 205, 396, -1));
        createStudent.add(motherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 238, 396, -1));
        createStudent.add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 271, 396, -1));
        createStudent.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 304, 396, -1));
        createStudent.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 337, 396, -1));
        createStudent.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 371, 396, -1));

        createButton.setText("Cadastrar");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        createStudent.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 417, 90, -1));

        jTabbedPane1.addTab("Cadastrar Aluno", createStudent);

        editStudent.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                editStudentComponentShown(evt);
            }
        });
        editStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNome.setText("Nome Completo");
        editStudent.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 45, -1, -1));

        labelNomeDoPai.setText("Nome Completo do Pai");
        editStudent.add(labelNomeDoPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 277, -1, 14));

        labelNomeDaMae.setText("Nome Completo da Mãe");
        editStudent.add(labelNomeDaMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 243, -1, -1));

        labelEndereco.setText("Endereço");
        editStudent.add(labelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 144, -1, -1));

        labelTelefone.setText("Telefone");
        editStudent.add(labelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 309, -1, -1));

        labelCelular.setText("Celular");
        editStudent.add(labelCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 342, -1, -1));

        labelDataDeNascimento.setText("Data de Nascimento");
        editStudent.add(labelDataDeNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 83, -1, -1));

        labelE_mail.setText("E-mail");
        editStudent.add(labelE_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 376, -1, -1));
        editStudent.add(editMotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 238, 396, -1));
        editStudent.add(editFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 271, 396, -1));
        editStudent.add(editTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 304, 396, -1));
        editStudent.add(editAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 139, 396, -1));
        editStudent.add(editMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 337, 396, -1));
        editStudent.add(editEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 371, 396, -1));

        editComboName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                editComboNamePopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        editComboName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editComboNameItemStateChanged(evt);
            }
        });
        editStudent.add(editComboName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 40, 396, -1));

        editSaveButton.setText("Salvar");
        editSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSaveButtonActionPerformed(evt);
            }
        });
        editStudent.add(editSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 416, 90, -1));

        labelGenero.setText("Gênero");
        editStudent.add(labelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 111, -1, -1));

        editGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outro" }));
        editStudent.add(editGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 106, 396, -1));

        labelCidade.setText("Cidade");
        editStudent.add(labelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 177, -1, -1));

        labelEstado.setText("Estado");
        editStudent.add(labelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 210, -1, -1));
        editStudent.add(editCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 172, 396, -1));
        editStudent.add(editState, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 205, 396, -1));

        editBirthday.setPreferredSize(new java.awt.Dimension(396, 27));
        editStudent.add(editBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 73, 396, -1));

        jTabbedPane1.addTab("Editar Informações do Aluno", editStudent);

        deleteStudent.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deleteStudentComponentShown(evt);
            }
        });
        deleteStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDeleteChoose.setText("Selecione um Aluno");
        deleteStudent.add(labelDeleteChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 45, -1, -1));

        deleteCombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                deleteComboPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        deleteStudent.add(deleteCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 536, -1));

        deleteButton.setText("Excluir");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        deleteStudent.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 80, 90, -1));

        jTabbedPane1.addTab("Excluir Cadastro do Aluno", deleteStudent);

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

   private void createButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createButtonActionPerformed
   {//GEN-HEADEREND:event_createButtonActionPerformed
       flag = false;
       String nameNewStudent = getNameStudent();
       Date newBirthday = getBirthday();
       String newGender = getGender();
       String newAddress = getAddress();
       String newCity = getCity();
       String newState = getState();
       String newMotherName = getMotherName();
       String newFatherName = getFatherName();
       String newTelephone = getTelephone();
       String newMobile = getMobile();
       String newEmail = getEmail();

       if (!flag) {
           Aluno student = new Aluno(nameNewStudent, newBirthday, newGender, newAddress, newCity, newState, newMotherName, newFatherName, newTelephone, newMobile, newEmail);

           ArrayList<Aluno> students = loadStudentData();

           students.add(student);

           saveStudentData(students);

           JOptionPane.showMessageDialog(null, "Aluno salvo com sucesso", "Confirmação!", JOptionPane.INFORMATION_MESSAGE);

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

    private String getState() {
        if (state.getText().isEmpty()) {
            labelState.setForeground(Color.red);
            flag = true;
            return null;
        }

        labelState.setForeground(Color.black);
        return state.getText();
    }

    private String getMotherName() {
        if (motherName.getText().isEmpty()) {
            labelMotherName.setForeground(Color.red);
            flag = true;
            return null;
        }

        labelMotherName.setForeground(Color.black);
        return motherName.getText();
    }

    private String getFatherName() {
        if (fatherName.getText().isEmpty()) {
            labelFatherName.setForeground(Color.red);
            flag = true;
            return null;
        }
        labelFatherName.setForeground(Color.black);
        return fatherName.getText();

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

   private void editComboNamePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_editComboNamePopupMenuWillBecomeVisible
   {//GEN-HEADEREND:event_editComboNamePopupMenuWillBecomeVisible
       editComboName.removeAllItems();
       for(Aluno i : loadStudentData()){
           editComboName.addItem(i);
       }
   }//GEN-LAST:event_editComboNamePopupMenuWillBecomeVisible

   private void deleteComboPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_deleteComboPopupMenuWillBecomeVisible
   {//GEN-HEADEREND:event_deleteComboPopupMenuWillBecomeVisible
       deleteCombo.removeAllItems();
       for(Aluno i : loadStudentData()){
           deleteCombo.addItem(i);
       }
   }//GEN-LAST:event_deleteComboPopupMenuWillBecomeVisible

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        ArrayList<Aluno> students = loadStudentData();
        Aluno student = (Aluno)deleteCombo.getSelectedItem();
        
        for (Aluno i : students){
            if (i.equals(student)){
                students.remove(i);
                break;
            }
        }
        
        saveStudentData(students);
        deleteCombo.removeAllItems();
        
        JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso", "Confirmação!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editComboNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editComboNameItemStateChanged
        Aluno student = (Aluno)editComboName.getSelectedItem();
        
        if (student == null){
            clearEditStudent();
            return;
        }
        
        this.editBirthday.setDate(student.getBirthday());
        this.editGender.setSelectedItem(student.getGenero());
        this.editAddress.setText(student.getEndereco());
        this.editCity.setText(student.getCidade());
        this.editState.setText(student.getEstado());
        this.editMotherName.setText(student.getNomeDaMae());
        this.editFatherName.setText(student.getNomeDoPai());
        this.editTelephone.setText(student.getTelefone());
        this.editMobile.setText(student.getCelular());
        this.editEmail.setText(student.getEmail());
    }//GEN-LAST:event_editComboNameItemStateChanged

    private void editSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSaveButtonActionPerformed
        flag = false;
        Aluno student = (Aluno) editComboName.getSelectedItem();
        Date newBirthday = getEditBirthday();
        String newGender = getEditGender();
        String newAddress = getEditAddress();
        String newCity = getEditCity();
        String newState = getEditState();
        String newMotherName = getEditMotherName();
        String newFatherName = getEditFatherName();
        String newTelephone = getEditTelephone();
        String newMobile = getEditMobile();
        String newEmail = getEditEmail();

        if (!flag) {
            ArrayList<Aluno> students = loadStudentData();

            for (Aluno i : students) {
                if (i.equals(student)) {
                    i.setDataDenascimento(newBirthday);
                    i.setGenero(newGender);
                    i.setEndereco(newAddress);
                    i.setCidade(newCity);
                    i.setEstado(newState);
                    i.setNomeDaMae(newMotherName);
                    i.setNomeDoPai(newFatherName);
                    i.setTelefone(newTelephone);
                    i.setCelular(newMobile);
                    i.setEmail(newEmail);
                    break;
                }
            }

            saveStudentData(students);

            JOptionPane.showMessageDialog(null, "Aluno editado com sucesso", "Confirmação!", JOptionPane.INFORMATION_MESSAGE);

            clearEditStudent();
        }
    }//GEN-LAST:event_editSaveButtonActionPerformed

    private void editStudentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_editStudentComponentShown
        this.editComboName.removeAllItems();
    }//GEN-LAST:event_editStudentComponentShown

    private void deleteStudentComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteStudentComponentShown
        deleteCombo.removeAllItems();
    }//GEN-LAST:event_deleteStudentComponentShown

    private Date getEditBirthday() {
        if (editBirthday.getDate() == null) {
            labelBirthday.setForeground(Color.red);
            flag = true;
            return null;
        }
        return editBirthday.getDate();
    }

    private String getEditGender() {
        return editGender.getSelectedItem().toString();
    }

    private String getEditAddress() {
        if (editAddress.getText().isEmpty()) {
            labelAddress.setForeground(Color.red);
            flag = true;
            return null;
        }
        return editAddress.getText();
    }

    private String getEditCity() {
        if (editCity.getText().isEmpty()) {
            labelCity.setForeground(Color.red);
            flag = true;
            return null;
        }
        return editCity.getText();
    }

    private String getEditState() {
        if (editState.getText().isEmpty()) {
            labelState.setForeground(Color.red);
            flag = true;
            return null;
        }
        return editState.getText();
    }

    private String getEditMotherName() {
        if (editMotherName.getText().isEmpty()) {
            labelMotherName.setForeground(Color.red);
            flag = true;
            return null;
        }
        return editMotherName.getText();
    }

    private String getEditFatherName() {
        if (editFatherName.getText().isEmpty()) {
            labelFatherName.setForeground(Color.red);
            flag = true;
            return null;
        }
        return editFatherName.getText();
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
    private static javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser birthday;
    private static javax.swing.JTextField city;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel createStudent;
    private javax.swing.JButton deleteButton;
    private static javax.swing.JComboBox deleteCombo;
    private javax.swing.JPanel deleteStudent;
    private javax.swing.JTextField editAddress;
    private com.toedter.calendar.JDateChooser editBirthday;
    private javax.swing.JTextField editCity;
    private javax.swing.JComboBox editComboName;
    private javax.swing.JTextField editEmail;
    private javax.swing.JTextField editFatherName;
    private javax.swing.JComboBox editGender;
    private javax.swing.JTextField editMobile;
    private javax.swing.JTextField editMotherName;
    private javax.swing.JButton editSaveButton;
    private javax.swing.JTextField editState;
    private javax.swing.JPanel editStudent;
    private javax.swing.JTextField editTelephone;
    private static javax.swing.JTextField email;
    private static javax.swing.JTextField fatherName;
    private static javax.swing.JComboBox gender;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JLabel labelAddress;
    private static javax.swing.JLabel labelBirthday;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCidade;
    private static javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelDataDeNascimento;
    private final javax.swing.JLabel labelDeleteChoose = new javax.swing.JLabel();
    private javax.swing.JLabel labelE_mail;
    private static javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEstado;
    private static javax.swing.JLabel labelFatherName;
    private static javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelGenero;
    private static javax.swing.JLabel labelMobile;
    private static javax.swing.JLabel labelMotherName;
    private static javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeDaMae;
    private javax.swing.JLabel labelNomeDoPai;
    private static javax.swing.JLabel labelState;
    private javax.swing.JLabel labelTelefone;
    private static javax.swing.JLabel labelTelephone;
    private static javax.swing.JTextField mobile;
    private static javax.swing.JTextField motherName;
    private static javax.swing.JTextField name;
    private static javax.swing.JTextField state;
    private static javax.swing.JTextField telephone;
    // End of variables declaration//GEN-END:variables
    private boolean flag;
    
    private void saveStudentData(ArrayList<Aluno> students) {
        try {
            ObjectOutputStream out;
            out = new ObjectOutputStream(new FileOutputStream("alunos.txt"));
            out.writeObject(students);
            out.close();
        } catch (Exception ex) {
            Logger.getLogger(StudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private ArrayList<Aluno> loadStudentData() {
        try {

            FileInputStream file = new FileInputStream(new File("alunos.txt"));
            ObjectInputStream in = new ObjectInputStream(file);
            
            return (ArrayList<Aluno>) in.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public void clearNewStudent() {
        name.setText("");
        address.setText("");
        mobile.setText("");
        city.setText("");
        birthday.setDate(null);
        email.setText("");
        fatherName.setText("");
        motherName.setText("");
        state.setText("");
        telephone.setText("");
    }

    public void clearEditStudent() {
        editMobile.setText("");
        editCity.setText("");
        birthday.setDate(null);
        editEmail.setText("");
        editAddress.setText("");
        editState.setText("");
        editMotherName.setText("");
        editFatherName.setText("");
        editTelephone.setText("");
    }
}
