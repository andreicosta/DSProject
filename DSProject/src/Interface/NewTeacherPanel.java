package Interface;

import dsproject.Escola;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
/*import net.java.balloontip.BalloonTip;
 import net.java.balloontip.BalloonTip.AttachLocation;
 import net.java.balloontip.BalloonTip.Orientation;
 import net.java.balloontip.styles.BalloonTipStyle;
 import net.java.balloontip.styles.MinimalBalloonStyle;
 import net.java.balloontip.utils.FadingUtils;*/

public class NewTeacherPanel extends javax.swing.JPanel {

    public NewTeacherPanel() {
        initComponents();
    }

    public NewTeacherPanel(JPanel superPanel) {
        this.superPanel = superPanel;
        initComponents();
    }
    private javax.swing.JPanel superPanel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelCpf = new javax.swing.JLabel();
        labelNomeCompleto = new javax.swing.JLabel();
        campoNomeCompleto = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        labelSenha = new javax.swing.JLabel();
        labelConfirmarSenha = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        campoFormatadoCpf = new javax.swing.JFormattedTextField();
        campoPasswordSenha = new javax.swing.JPasswordField();
        campoPasswordConfirmarSenha = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(984, 536));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCpf.setText("CPF");
        jPanel1.add(labelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        labelNomeCompleto.setText("Nome Completo");
        jPanel1.add(labelNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 88, -1, -1));
        jPanel1.add(campoNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 83, 427, -1));

        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 201, 85, -1));

        labelSenha.setText("Senha");
        jPanel1.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 127, -1, -1));

        labelConfirmarSenha.setText("Confirmar Senha");
        jPanel1.add(labelConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 166, -1, -1));

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 201, 85, -1));

        campoFormatadoCpf.setFormatterFactory(setFormatoData());
        jPanel1.add(campoFormatadoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 45, 427, -1));
        jPanel1.add(campoPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 122, 427, -1));

        campoPasswordConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPasswordConfirmarSenhaKeyTyped(evt);
            }
        });
        jPanel1.add(campoPasswordConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 161, 427, -1));

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
        this.save();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void save() {
        errorflag = false;

        char[] password = campoPasswordSenha.getPassword();
        char[] confirmPassword = campoPasswordConfirmarSenha.getPassword();
        String strPassword = new String(password);
        String strConfirmPassword = new String(confirmPassword);
        System.out.println("cpf cadastro -" + campoFormatadoCpf.getText());
        erroscadlist = Escola.getInstance().cadastrarProfessor(campoFormatadoCpf.getText(), campoNomeCompleto.getText(), strPassword,
                strConfirmPassword);

        for (int k = 0; k < erroscadlist.size(); k++) {
            System.out.println(erroscadlist.get(k));
        }

        int error;

        if (erroscadlist.get(0).equals(0)) {
            // sem erros - tudo lindo
            clear();
            CardLayout card = (CardLayout) this.superPanel.getLayout();
            card.show(this.superPanel, "cardLogin");
        } else {
            for (int i = 0; i < erroscadlist.size(); i++) {
                error = erroscadlist.get(i);
                switch (error) {
                    case (1):
                        //erro cpf
                        labelCpf.setForeground(Color.red);
                        /*BalloonTipStyle borda = new MinimalBalloonStyle(Color.getHSBColor(53, 101, 30), 5);
                         myBalloonTip = new BalloonTip(campoFormatadoCpf, new JLabel("Digite um CPF válido"), borda, Orientation.RIGHT_ABOVE, AttachLocation.EAST, 125, 7, false);
                         FadingUtils.fadeInBalloon(myBalloonTip, nullActionListener, 100, 24);
                         FadingUtils.fadeOutBalloon(myBalloonTip, nullActionListener, 6300, 24);*/
                        break;
                    case (2):
                        // error nome
                        labelNomeCompleto.setForeground(Color.red);
                        /*BalloonTipStyle edgedLook = new MinimalBalloonStyle(Color.getHSBColor(53, 101, 30), 5);
                         myBalloonTip = new BalloonTip(campoNomeCompleto, new JLabel("Digite nome e sobrenome"), edgedLook, Orientation.RIGHT_ABOVE, AttachLocation.EAST, 160, 7, false);
                         FadingUtils.fadeInBalloon(myBalloonTip, nullActionListener, 100, 24);
                         FadingUtils.fadeOutBalloon(myBalloonTip, nullActionListener, 6300, 24);*/
                        break;
                    case (7):
                        // erro senha
                        labelSenha.setForeground(Color.red);
                        /*BalloonTipStyle borda1 = new MinimalBalloonStyle(Color.getHSBColor(53, 101, 30), 5);
                         myBalloonTip = new BalloonTip(campoPasswordSenha, new JLabel("Digite uma senha"), borda1, Orientation.RIGHT_ABOVE, AttachLocation.EAST, 110, 7, false);
                         FadingUtils.fadeInBalloon(myBalloonTip, nullActionListener, 100, 24);
                         FadingUtils.fadeOutBalloon(myBalloonTip, nullActionListener, 6300, 24);*/
                        break;
                    case (8):
                        labelConfirmarSenha.setForeground(Color.red);
                        /*BalloonTipStyle borda2 = new MinimalBalloonStyle(Color.getHSBColor(53, 101, 30), 5);
                         myBalloonTip = new BalloonTip(campoPasswordConfirmarSenha, new JLabel("Senhas diferentes"), borda2, Orientation.RIGHT_ABOVE, AttachLocation.EAST, 110, 7, false);
                         FadingUtils.fadeInBalloon(myBalloonTip, nullActionListener, 100, 24);
                         FadingUtils.fadeOutBalloon(myBalloonTip, nullActionListener, 6300, 24);*/
                        break;
                    case (9):
                        //erro cpf
                        labelCpf.setForeground(Color.red);
                        /*BalloonTipStyle borda3 = new MinimalBalloonStyle(Color.getHSBColor(53, 101, 30), 5);
                         myBalloonTip = new BalloonTip(campoFormatadoCpf, new JLabel("CPF já existe"), borda3, Orientation.RIGHT_ABOVE, AttachLocation.EAST, 77, 7, false);
                         FadingUtils.fadeInBalloon(myBalloonTip, nullActionListener, 100, 24);
                         FadingUtils.fadeOutBalloon(myBalloonTip, nullActionListener, 6300, 24);*/
                        break;
                    case (10):
                        // erro senha
                        labelSenha.setForeground(Color.red);
                        /*BalloonTipStyle borda4 = new MinimalBalloonStyle(Color.getHSBColor(53, 101, 30), 5);
                         myBalloonTip = new BalloonTip(campoPasswordSenha, new JLabel("Senha deve conter no mínimo 4 caracteres"), borda4, Orientation.RIGHT_ABOVE, AttachLocation.EAST, 200, 7, false);
                         FadingUtils.fadeInBalloon(myBalloonTip, nullActionListener, 100, 24);
                         FadingUtils.fadeOutBalloon(myBalloonTip, nullActionListener, 6300, 24);*/
                        break;
                    case (11):
                        labelConfirmarSenha.setForeground(Color.red);
                        /*BalloonTipStyle borda5 = new MinimalBalloonStyle(Color.getHSBColor(53, 101, 30), 5);
                         myBalloonTip = new BalloonTip(campoPasswordConfirmarSenha, new JLabel("Confirme a senha"), borda5, Orientation.RIGHT_ABOVE, AttachLocation.EAST, 110, 7, false);
                         FadingUtils.fadeInBalloon(myBalloonTip, nullActionListener, 100, 24);
                         FadingUtils.fadeOutBalloon(myBalloonTip, nullActionListener, 6300, 24);*/
                        break;
                }
            }
        }
    }

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        clear();
        CardLayout card = (CardLayout) this.superPanel.getLayout();
        card.show(this.superPanel, "cardLogin");
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        campoFormatadoCpf.requestFocus();
    }//GEN-LAST:event_formComponentShown

    private void campoPasswordConfirmarSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPasswordConfirmarSenhaKeyTyped
        if (evt.getKeyChar() == '\n') {
            this.save();
        }
    }//GEN-LAST:event_campoPasswordConfirmarSenhaKeyTyped
    private ArrayList<Integer> erroscadlist;
    private boolean errorflag;
    private MaskFormatter cpfmask;
    //BalloonTip myBalloonTip;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField campoFormatadoCpf;
    private javax.swing.JTextField campoNomeCompleto;
    private javax.swing.JPasswordField campoPasswordConfirmarSenha;
    private javax.swing.JPasswordField campoPasswordSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JLabel labelConfirmarSenha;
    private static javax.swing.JLabel labelCpf;
    private static javax.swing.JLabel labelNomeCompleto;
    private static javax.swing.JLabel labelSenha;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

    public void campoFormatadoCpfRequestFocus() {
        campoFormatadoCpf.requestFocus();
    }

    public static JLabel getLabelCpf() {
        return labelCpf;
    }

    public static JLabel getLabelConfirmarSenha() {
        return labelConfirmarSenha;
    }

    public static JLabel getLabelNomeCompleto() {
        return labelNomeCompleto;
    }

    public static JLabel getLabelSenha() {
        return labelSenha;
    }

    public static DefaultFormatterFactory setFormatoData() {
        MaskFormatter comFoco = null;
        try {
            comFoco = new MaskFormatter("###.###.###-##");
        } catch (Exception pe) {
        }
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);
        return factory;
    }
    private static final ActionListener nullActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
        }
    };

    public void clear() {
        this.campoNomeCompleto.setText("");
        this.campoFormatadoCpf.setValue("");
        this.campoPasswordSenha.setText("");
        this.campoPasswordConfirmarSenha.setText("");
    }
}
