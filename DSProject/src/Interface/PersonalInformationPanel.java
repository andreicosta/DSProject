package Interface;

public class PersonalInformationPanel extends javax.swing.JPanel {

    public PersonalInformationPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        cpf1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        adress1 = new javax.swing.JLabel();
        adressLabel = new javax.swing.JLabel();
        phone1 = new javax.swing.JLabel();
        cellphone1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        cellphoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
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

        setMinimumSize(new java.awt.Dimension(833, 515));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 516, 26));
        jPanel2.add(cpfLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 72, 516, 26));

        cpf1.setText("CPF");
        jPanel2.add(cpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 81, -1, -1));

        name1.setText("Nome Completo");
        jPanel2.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 119, -1, -1));

        adress1.setText("Endereço");
        jPanel2.add(adress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 161, -1, -1));
        jPanel2.add(adressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 152, 516, 26));

        phone1.setText("Telefone");
        jPanel2.add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 203, -1, -1));

        cellphone1.setText("Celular");
        jPanel2.add(cellphone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 245, -1, -1));

        email1.setText("E-mail");
        jPanel2.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 287, -1, -1));
        jPanel2.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 194, 516, 26));
        jPanel2.add(cellphoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 236, 516, 26));
        jPanel2.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 278, 516, 26));

        jTabbedPane1.addTab("Visualizar Informações Pessoais", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpf.setText("CPF");
        jPanel1.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 82, -1, -1));

        name.setText("Nome Completo");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 120, -1, -1));

        adress.setText("Endereço");
        jPanel1.add(adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 158, -1, -1));

        phone.setText("Telefone");
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 196, -1, -1));

        cellphone.setText("Celular");
        jPanel1.add(cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 234, -1, -1));

        email.setText("E-mail");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 272, -1, -1));
        jPanel1.add(cpfTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 72, 427, -1));
        jPanel1.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 427, -1));
        jPanel1.add(adressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 148, 427, -1));
        jPanel1.add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 186, 427, -1));
        jPanel1.add(cellphoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 224, 427, -1));
        jPanel1.add(emilTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 262, 427, -1));

        saveButton.setText("Salvar");
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 356, 116, -1));

        jTabbedPane1.addTab("Editar Informações Pessoais", jPanel1);

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
    private javax.swing.JLabel adress;
    private javax.swing.JLabel adress1;
    private javax.swing.JLabel adressLabel;
    private javax.swing.JTextField adressTextField;
    private javax.swing.JLabel cellphone;
    private javax.swing.JLabel cellphone1;
    private javax.swing.JLabel cellphoneLabel;
    private javax.swing.JTextField cellphoneTextField;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel cpf1;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emilTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phone1;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
