package Interface;

import dsproject.Escola;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class LoginJPanel extends javax.swing.JPanel {

    public LoginJPanel() {
        initComponents();
    }
    private MainFrame frame;

    public LoginJPanel(JPanel superPanel, JFrame frame) {
        this.superPanel = superPanel;
        this.frame = (MainFrame) frame;
        initComponents();
        JRootPane r = frame.getRootPane();
    }
    
    private javax.swing.JPanel superPanel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginpassw = new javax.swing.JPasswordField();
        loginbut = new javax.swing.JButton();
        cadbut = new javax.swing.JButton();
        campocpflogin = new javax.swing.JFormattedTextField();
        try{
            BufferedImage pic = ImageIO.read(new File("images/prodown.png"));
            jLabel3 = new javax.swing.JLabel(new ImageIcon(pic));

            setPreferredSize(new java.awt.Dimension(995, 515));
            addComponentListener(new java.awt.event.ComponentAdapter() {
                public void componentShown(java.awt.event.ComponentEvent evt) {
                    formComponentShown(evt);
                }
            });
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setText("CPF");
            add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 224, -1, -1));

            jLabel2.setText("Senha");
            add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 263, -1, -1));

            loginpassw.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
            loginpassw.setToolTipText("Entre com a senha válida");
            loginpassw.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    loginpasswKeyTyped(evt);
                }
            });
            add(loginpassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 258, 178, -1));

            loginbut.setText("Login");
            loginbut.setToolTipText("Clique aqui para logar com o usuário acima");
            loginbut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    loginbutActionPerformed(evt);
                }
            });
            add(loginbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 292, 114, -1));

            cadbut.setText("Cadastrar");
            cadbut.setToolTipText("Clique aqui para cadastrar um novo Usuário");
            cadbut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cadbutActionPerformed(evt);
                }
            });
            add(cadbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 292, 113, -1));

            campocpflogin.setFormatterFactory(setFormatoData());
            campocpflogin.setToolTipText("Entre com um CPF ja cadastrado (Somente números)");
            campocpflogin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
            add(campocpflogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 218, 178, -1));

            /*
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText(null);
            */
        }catch(Exception e){
            jLabel1.setText("");
        }
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 995, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void cadbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadbutActionPerformed
        clear();
        
        CardLayout card = (CardLayout) superPanel.getLayout();
        card.show(superPanel, "cardNewTeacher");
        //frame.getNewTeacherPanel1().campoFormatadoCpfRequestFocus();
    }//GEN-LAST:event_cadbutActionPerformed

    private void loginbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutActionPerformed
        this.login();
    }//GEN-LAST:event_loginbutActionPerformed

    private void login() {
        Escola escola = Escola.getInstance();
        boolean b = escola.login(campocpflogin.getText(), new String(loginpassw.getPassword()));
        if (b) {
            clear();
            CardLayout card = (CardLayout) superPanel.getLayout();
            card.show(superPanel, "cardMain");
            String name = escola.getProfessorLogado().getNome();
            this.frame.getMainPanel1().getWelcomePanel1().setWelcomeMessage(name);
            String title = this.frame.getTitle();
            this.frame.setTitle(name + " - " + title);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Fazer Login.","",JOptionPane.ERROR_MESSAGE);
            this.loginpassw.setText("");
        }

    }

    private void clear() {
        this.campocpflogin.setValue("");
        this.loginpassw.setText("");
    }

    private void loginpasswKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginpasswKeyTyped
        if (evt.getKeyChar() == '\n') {
            this.login();
        }
    }//GEN-LAST:event_loginpasswKeyTyped

private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    this.campocpflogin.requestFocus(true);
    
    this.frame.setTitle("ProDown");
}//GEN-LAST:event_formComponentShown

    public static DefaultFormatterFactory setFormatoData() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("###.###.###-##");
        } catch (Exception pe) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadbut;
    private javax.swing.JFormattedTextField campocpflogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginbut;
    private javax.swing.JPasswordField loginpassw;
    // End of variables declaration//GEN-END:variables
}
