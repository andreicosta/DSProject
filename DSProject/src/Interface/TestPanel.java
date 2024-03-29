package Interface;

import dsproject.Aluno;
import dsproject.Avaliacao;
import dsproject.Escola;
import dsproject.Turma;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class TestPanel extends javax.swing.JPanel {

    public TestPanel() {
        //Inicializa os componentes do TestPanel.
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chairButtonGroup = new javax.swing.ButtonGroup();
        runningButtonGroup = new javax.swing.ButtonGroup();
        testTabbedPane = new javax.swing.JTabbedPane();
        newEditPanel = new javax.swing.JPanel();
        comboTurma = new javax.swing.JComboBox();
        comboNomeDoAluno = new javax.swing.JComboBox();
        labelTurma = new javax.swing.JLabel();
        labelStudentName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelDataDaAvaliacao = new javax.swing.JLabel();
        fieldTestDate = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelTemperatura = new javax.swing.JLabel();
        fieldTemperature = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelBodyMass = new javax.swing.JLabel();
        labelHeight = new javax.swing.JLabel();
        labelSpread = new javax.swing.JLabel();
        labelSitAndAchieve = new javax.swing.JLabel();
        fieldSitAndAchieve = new javax.swing.JTextField();
        fieldSpread = new javax.swing.JTextField();
        fieldHeight = new javax.swing.JTextField();
        fieldBodyMass = new javax.swing.JTextField();
        radioSitAndAchieveWithSeat = new javax.swing.JRadioButton();
        radioSitAndAchieveWithoutSeat = new javax.swing.JRadioButton();
        labelSitUp = new javax.swing.JLabel();
        fieldSitUp = new javax.swing.JTextField();
        labelRun = new javax.swing.JLabel();
        fieldRun = new javax.swing.JTextField();
        radio6Minutes = new javax.swing.JRadioButton();
        radio9Minutes = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        labelHorizontalJump = new javax.swing.JLabel();
        labelThrowOfMedicineBall = new javax.swing.JLabel();
        labelSquareTest = new javax.swing.JLabel();
        label20MetersRun = new javax.swing.JLabel();
        field20MetersRun = new javax.swing.JTextField();
        fiedlSquareTest = new javax.swing.JTextField();
        fieldHorizontalJump = new javax.swing.JTextField();
        fieldThrowOfMedicineBall = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        labelHorario = new javax.swing.JLabel();
        fieldTime = new javax.swing.JTextField();
        labelIMC = new javax.swing.JLabel();
        fieldIMC = new javax.swing.JTextField();
        avaliacaoFinalizadaCheckBox = new javax.swing.JCheckBox();
        controlPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        chairButtonGroup.add(radioSitAndAchieveWithSeat);
        chairButtonGroup.add(radioSitAndAchieveWithoutSeat);

        runningButtonGroup.add(radio6Minutes);
        runningButtonGroup.add(radio9Minutes);

        setMinimumSize(new java.awt.Dimension(833, 515));
        setPreferredSize(new java.awt.Dimension(833, 515));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        testTabbedPane.setMaximumSize(new java.awt.Dimension(833, 515));
        testTabbedPane.setMinimumSize(new java.awt.Dimension(833, 515));
        testTabbedPane.setPreferredSize(new java.awt.Dimension(833, 515));

        newEditPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboTurma.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboTurmaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTurmaPopupMenuWillBecomeVisible(evt);
            }
        });
        newEditPanel.add(comboTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 18, 210, -1));

        comboNomeDoAluno.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboNomeDoAlunoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboNomeDoAlunoPopupMenuWillBecomeVisible(evt);
            }
        });
        newEditPanel.add(comboNomeDoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 18, 350, -1));

        labelTurma.setText("Turma");
        newEditPanel.add(labelTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        labelStudentName.setText("Nome do Aluno");
        newEditPanel.add(labelStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 23, -1, -1));
        newEditPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 801, -1));

        labelDataDaAvaliacao.setText("Data da Avaliação*");
        newEditPanel.add(labelDataDaAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, -1, -1));

        fieldTestDate.setFocusable(false);
        newEditPanel.add(fieldTestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 69, 180, -1));
        fieldTestDate.getAccessibleContext().setAccessibleDescription("");

        newEditPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 329, 801, -1));

        jLabel4.setText("Saúde");
        newEditPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 108, -1, -1));

        jLabel5.setText("Desempenho Motor");
        newEditPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 306, -1, -1));
        newEditPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 801, 10));

        labelTemperatura.setText("Temperatura*");
        newEditPanel.add(labelTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 74, -1, -1));

        fieldTemperature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTemperatureKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 69, 102, -1));

        jLabel7.setText("ºC");
        newEditPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 74, -1, -1));

        labelBodyMass.setText("Massa Corporal");
        newEditPanel.add(labelBodyMass, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, -1, -1));

        labelHeight.setText("Estatura");
        newEditPanel.add(labelHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, -1, -1));

        labelSpread.setText("Envergadura");
        newEditPanel.add(labelSpread, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 264, -1, -1));

        labelSitAndAchieve.setText("Sentar-e-Alcançar");
        newEditPanel.add(labelSitAndAchieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 186, -1, -1));

        fieldSitAndAchieve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldSitAndAchieveKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldSitAndAchieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 181, 80, -1));

        fieldSpread.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldSpreadKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldSpread, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 259, 80, -1));

        fieldHeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldHeightFocusLost(evt);
            }
        });
        fieldHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldHeightKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 181, 80, -1));

        fieldBodyMass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldBodyMassFocusLost(evt);
            }
        });
        fieldBodyMass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldBodyMassKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldBodyMass, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 142, 80, -1));

        radioSitAndAchieveWithSeat.setText("Com Banco");
        radioSitAndAchieveWithSeat.setSelected(true);
        newEditPanel.add(radioSitAndAchieveWithSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 182, -1, -1));

        radioSitAndAchieveWithoutSeat.setText("Sem Banco");
        newEditPanel.add(radioSitAndAchieveWithoutSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 182, -1, -1));

        labelSitUp.setText("Abdominal");
        newEditPanel.add(labelSitUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 147, -1, -1));

        fieldSitUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldSitUpKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldSitUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 142, 80, -1));

        labelRun.setText("Corrida");
        newEditPanel.add(labelRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 225, -1, -1));

        fieldRun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldRunKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 220, 80, -1));

        radio6Minutes.setText("6 minutos");
        radio6Minutes.setSelected(true);
        newEditPanel.add(radio6Minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 221, -1, -1));

        radio9Minutes.setText("9 minutos");
        newEditPanel.add(radio9Minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 221, -1, -1));

        jLabel14.setText("Kg");
        newEditPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 147, -1, -1));

        jLabel15.setText("cm");
        newEditPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 186, -1, -1));

        jLabel16.setText("cm");
        newEditPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 264, -1, -1));

        jLabel17.setText("qtde");
        newEditPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 147, -1, -1));

        jLabel18.setText("cm");
        newEditPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 186, -1, -1));

        jLabel19.setText("m");
        newEditPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 225, -1, -1));

        labelHorizontalJump.setText("Salto Horizontal");
        newEditPanel.add(labelHorizontalJump, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 346, -1, -1));

        labelThrowOfMedicineBall.setText("Arremesso de Medicineball");
        newEditPanel.add(labelThrowOfMedicineBall, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 391, -1, -1));

        labelSquareTest.setText("Quadrado");
        newEditPanel.add(labelSquareTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 346, -1, -1));

        label20MetersRun.setText("Corrida de 20 metros");
        newEditPanel.add(label20MetersRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 391, -1, -1));

        field20MetersRun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field20MetersRunKeyTyped(evt);
            }
        });
        newEditPanel.add(field20MetersRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 386, 80, -1));

        fiedlSquareTest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fiedlSquareTestKeyTyped(evt);
            }
        });
        newEditPanel.add(fiedlSquareTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 341, 80, -1));

        fieldHorizontalJump.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldHorizontalJumpKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldHorizontalJump, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 341, 80, -1));

        fieldThrowOfMedicineBall.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldThrowOfMedicineBallKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldThrowOfMedicineBall, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 386, 80, -1));

        jLabel24.setText("cm");
        newEditPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 346, -1, -1));

        jLabel25.setText("cm");
        newEditPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 391, -1, -1));

        jLabel26.setText("s");
        newEditPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 346, -1, -1));

        jLabel27.setText("s");
        newEditPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 391, -1, -1));

        buttonSave.setText("Salvar Alterações");
        buttonSave.setPreferredSize(new java.awt.Dimension(80, 29));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        newEditPanel.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 425, 140, -1));

        labelHorario.setText("Horário*");
        newEditPanel.add(labelHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 74, -1, -1));

        fieldTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTimeKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 69, 130, -1));

        labelIMC.setText("IMC");
        newEditPanel.add(labelIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 225, -1, -1));

        fieldIMC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldIMCKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 220, 80, -1));

        avaliacaoFinalizadaCheckBox.setText("Avaliação Finalizada");
        newEditPanel.add(avaliacaoFinalizadaCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 427, -1, -1));

        testTabbedPane.addTab("Nova Avaliação / Editar Avaliação", newEditPanel);

        controlPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                controlPanelComponentShown(evt);
            }
        });
        controlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Turma", "Dia da Avaliação", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);

        controlPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 25, 710, 390));

        jButton1.setText("Gerar Arquivo para Envio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        controlPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 427, -1, -1));

        testTabbedPane.addTab("Controle de Avaliações", controlPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(testTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(testTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

   private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonSaveActionPerformed
   {//GEN-HEADEREND:event_buttonSaveActionPerformed
       //Salva todos os dados quando clica no botao salvar alteracoes.
       //Primeramente ele testa se e valido os dados do campo data, horario e temperatuda da avaliacao.
       //Se algum deles nao estiver correto ou em algum formato errado, as alteracoes nao sao salvar.
       saveAll();
   }//GEN-LAST:event_buttonSaveActionPerformed

   private void fieldTimeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldTimeKeyTyped
   {//GEN-HEADEREND:event_fieldTimeKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       //Adiciona : entre as horas e os minutos no painel.
       if (!Character.isDigit(evt.getKeyChar())) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = fieldTime.getText();
           if (textoCampo.length() == 2) {
               fieldTime.setText(textoCampo + ":");
           } else {
               if (textoCampo.length() > 4) {
                   evt.setKeyChar('\0');
               }
           }
       }
   }//GEN-LAST:event_fieldTimeKeyTyped

   private void fieldTemperatureKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldTemperatureKeyTyped
   {//GEN-HEADEREND:event_fieldTemperatureKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = fieldTemperature.getText();
           if (textoCampo.length() > 1) {
               evt.setKeyChar('\0');
           }
       }
   }//GEN-LAST:event_fieldTemperatureKeyTyped

   private void fieldBodyMassKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldBodyMassKeyTyped
   {//GEN-HEADEREND:event_fieldBodyMassKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       //O pattern serve para que somente possa ser digitado os numeros no formato correto. Da forma implementada
       //ele aceita entradas contendo 0.xx valores, ou se nao comecar com 0, podendo ter ate 3 digitos antes do .,
       //aceitando entradas de 0.00 ate 999.99.
       if (!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar() == '.')) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = fieldBodyMass.getText();
           textoCampo = textoCampo.concat(String.valueOf(evt.getKeyChar()));
           String pattern = "(([0])|(([1-9])([0-9])?([0-9])?))(\\.([0-9])?([0-9])?)?";
           Pattern pesoPattern = Pattern.compile(pattern);
           if (!pesoPattern.matcher(textoCampo).matches()){
               evt.setKeyChar('\0');
           }
       }
   }//GEN-LAST:event_fieldBodyMassKeyTyped

   private void fieldHeightKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldHeightKeyTyped
   {//GEN-HEADEREND:event_fieldHeightKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = fieldHeight.getText();
           if (textoCampo.length() > 2) {
               evt.setKeyChar('\0');
           }
       }
   }//GEN-LAST:event_fieldHeightKeyTyped

   private void fieldIMCKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldIMCKeyTyped
   {//GEN-HEADEREND:event_fieldIMCKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       //Adiciona um . apos 2 digitos serem escritos.     
       if (!Character.isDigit(evt.getKeyChar())) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = fieldIMC.getText();
           if (textoCampo.length() == 2) {
               fieldIMC.setText(textoCampo + ".");
           } else {
               if (textoCampo.length() > 3) {
                   evt.setKeyChar('\0');
               }
           }
       }
   }//GEN-LAST:event_fieldIMCKeyTyped

   private void fieldSpreadKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldSpreadKeyTyped
   {//GEN-HEADEREND:event_fieldSpreadKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = fieldSpread.getText();
           if (textoCampo.length() > 2) {
               evt.setKeyChar('\0');
           }
       }
   }//GEN-LAST:event_fieldSpreadKeyTyped

   private void fieldSitUpKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldSitUpKeyTyped
   {//GEN-HEADEREND:event_fieldSitUpKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = fieldSitUp.getText();
           if (textoCampo.length() > 4) {
               evt.setKeyChar('\0');
           }
       }
   }//GEN-LAST:event_fieldSitUpKeyTyped

   private void comboTurmaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_comboTurmaPopupMenuWillBecomeVisible
   {//GEN-HEADEREND:event_comboTurmaPopupMenuWillBecomeVisible
       //Quando clicado no combobox para escolher uma turma para realizar a avaliacao, ele limpa a secao e adiciona todas
       //as turmas cadastradas pelo professor, exceto pela turma padrao, a aba.
       this.comboTurma.removeAllItems();
       for (Turma i : Escola.getInstance().getLogado().getTurmas()) {
           if(!i.getId().equals("Sem Turma")){
                this.comboTurma.addItem(i);
           }
       }
   }//GEN-LAST:event_comboTurmaPopupMenuWillBecomeVisible

    private void fieldBodyMassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldBodyMassFocusLost
        //Quando clicado em qualquer coisa que nao o campo de peso apos ele ter sido selecionado, se ambos o campo peso
        //e o campo altura estiverem preenchido, ele calcula e preenche o campo IMC automaticamente.
        if(!fieldHeight.getText().isEmpty() && !fieldBodyMass.getText().isEmpty()){
            float alt = Float.valueOf(fieldHeight.getText()) / 100;
            float mass = Float.valueOf(fieldBodyMass.getText());
            float calcimc = mass / (alt*alt);
            fieldIMC.setText(new DecimalFormat("##.##").format(calcimc).replace(",", "."));                    
        }
    }//GEN-LAST:event_fieldBodyMassFocusLost

    private void fieldSitAndAchieveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldSitAndAchieveKeyTyped
       //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.setKeyChar('\0');
        } else {
            String textoCampo = fieldSitAndAchieve.getText();
            if (textoCampo.length() > 2) {
                evt.setKeyChar('\0');
            }
        }
    }//GEN-LAST:event_fieldSitAndAchieveKeyTyped

    private void fieldRunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldRunKeyTyped
        //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.setKeyChar('\0');
        } else {
            String textoCampo = fieldRun.getText();
            if (textoCampo.length() > 2) {
                evt.setKeyChar('\0');
            }
        }
    }//GEN-LAST:event_fieldRunKeyTyped

    private void fieldHorizontalJumpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldHorizontalJumpKeyTyped
        //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.setKeyChar('\0');
        } else {
            String textoCampo = fieldHorizontalJump.getText();
            if (textoCampo.length() > 3) {
                evt.setKeyChar('\0');
            }
        }
    }//GEN-LAST:event_fieldHorizontalJumpKeyTyped

    private void fieldThrowOfMedicineBallKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldThrowOfMedicineBallKeyTyped
        //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.setKeyChar('\0');
        } else {
            String textoCampo = fieldThrowOfMedicineBall.getText();
            if (textoCampo.length() > 3) {
                evt.setKeyChar('\0');
            }
        }
    }//GEN-LAST:event_fieldThrowOfMedicineBallKeyTyped

    private void fiedlSquareTestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fiedlSquareTestKeyTyped
        //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.setKeyChar('\0');
        } else {
            String textoCampo = fiedlSquareTest.getText();
            if (textoCampo.length() > 4) {
                evt.setKeyChar('\0');
            }
        }
    }//GEN-LAST:event_fiedlSquareTestKeyTyped

    private void field20MetersRunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field20MetersRunKeyTyped
        //Caso um nao-digito seja digitado ou se a quantidade de digitos for errado, ele nao insere o caractere digitado.
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.setKeyChar('\0');
        } else {
            String textoCampo = field20MetersRun.getText();
            if (textoCampo.length() > 4) {
                evt.setKeyChar('\0');
            }
        }
    }//GEN-LAST:event_field20MetersRunKeyTyped

    private void fieldHeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldHeightFocusLost
        //Quando clicado em qualquer coisa que nao o campo de altura apos ele ter sido selecionado, se ambos o campo peso
        //e o campo altura estiverem preenchido, ele calcula e preenche o campo IMC automaticamente.
        if(!fieldHeight.getText().isEmpty() && !fieldBodyMass.getText().isEmpty()){
            float alt = Float.valueOf(fieldHeight.getText()) / 100;
            float mass = Float.valueOf(fieldBodyMass.getText());
            float calcimc = mass / (alt*alt);
            fieldIMC.setText(new DecimalFormat("##.##").format(calcimc).replace(",", "."));                    
        }
    }//GEN-LAST:event_fieldHeightFocusLost

    private void comboTurmaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboTurmaPopupMenuWillBecomeInvisible
        //Apos selecionar algum aluno, limpa os campos dos dados.
        this.limpaComboNomeDoAluno();
        this.limpaCampos();
    }//GEN-LAST:event_comboTurmaPopupMenuWillBecomeInvisible

    private void comboNomeDoAlunoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboNomeDoAlunoPopupMenuWillBecomeVisible
        //Ao abrir o combobox dos alunos ele remove tudo do combobox e entao adiciona todos os alunos pertencentes a turma
        //selecionada no combobox turma ao combobox aluno para escolher a qual aluno sera feito a avaliacao.
        Turma turma = (Turma) this.comboTurma.getSelectedItem();
        comboNomeDoAluno.removeAllItems();
        if (turma == null) {
            this.limpaComboNomeDoAluno();
            this.limpaComboNomeTurma();
            this.limpaCampos();
            return;
        }
        for (Aluno i : turma.buscaTodosAlunos()) {
            comboNomeDoAluno.addItem(i);
        }
    }//GEN-LAST:event_comboNomeDoAlunoPopupMenuWillBecomeVisible

    private void comboNomeDoAlunoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboNomeDoAlunoPopupMenuWillBecomeInvisible
        //Apos selecionar um aluno, se esse aluno ja possui algum dado salvo de sua avaliacao ele carrega automaticamente os dados
        //para os campos correspondentes.
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        
        this.limpaCampos();
        
        if (student == null) {
            this.limpaComboNomeDoAluno();
            return;
        }
        
        Avaliacao avaliacao = (Avaliacao) student.getLastAvaliation();
        
        fieldTime.setForeground(Color.black);
        labelHorario.setForeground(Color.black);
        
        labelTemperatura.setForeground(Color.black);
        fieldTemperature.setForeground(Color.black);
        
        labelDataDaAvaliacao.setForeground(Color.black);
        fieldTestDate.setForeground(Color.black);
        
        if (avaliacao.getData() == null) {
            fieldTestDate.setDate(null);
        } else {
            fieldTestDate.setDate(avaliacao.getData());
        }

        if (avaliacao.getHorario() == null) {
            fieldTime.setText("");
        } else {
            fieldTime.setText(avaliacao.getHorario());
        }

        if (avaliacao.getTemperatura() == null) {
            fieldTemperature.setText("");
        } else {
            fieldTemperature.setText(avaliacao.getTemperatura());
        }

        if (avaliacao.getMassaCorporal() == -1) {
            fieldBodyMass.setText("");
        } else {
            fieldBodyMass.setText(String.valueOf(avaliacao.getMassaCorporal()));
        }

        if (avaliacao.getEstatura() == -1) {
            fieldHeight.setText("");
        } else {
            fieldHeight.setText(String.valueOf((int)avaliacao.getEstatura()));
        }

        if (avaliacao.getIMC() == -1) {
            fieldIMC.setText("");
        } else {
            fieldIMC.setText(String.valueOf(avaliacao.getIMC()));
        }

        if (avaliacao.getEnvergadura() == -1) {
            fieldSpread.setText("");
        } else {
            fieldSpread.setText(String.valueOf((int)avaliacao.getEnvergadura()));
        }

        if (avaliacao.getAbdominal() == -1) {
            fieldSitUp.setText("");
        } else {
            fieldSitUp.setText(String.valueOf(avaliacao.getAbdominal()));
        }

        if (avaliacao.getSentarEAlcancar() == -1) {
            fieldSitAndAchieve.setText("");
        } else {
            fieldSitAndAchieve.setText(String.valueOf((int)avaliacao.getSentarEAlcancar()));
        }

        if (avaliacao.get6Minutos() == -1 && avaliacao.get9Minutos() == -1) {
            fieldRun.setText("");
            radio6Minutes.setSelected(true);
            radio9Minutes.setSelected(false);

        } else {
            if (avaliacao.get6Minutos() != -1) {
                fieldRun.setText(String.valueOf((int)avaliacao.get6Minutos()));
                radio6Minutes.setSelected(true);
                radio9Minutes.setSelected(false);
            } else {
                fieldRun.setText(String.valueOf((int)avaliacao.get9Minutos()));
                radio6Minutes.setSelected(false);
                radio9Minutes.setSelected(true);
            }
        }

        if (avaliacao.getSaltoHorizontal() == -1) {
            fieldHorizontalJump.setText("");
        } else {
            fieldHorizontalJump.setText(String.valueOf((int)avaliacao.getSaltoHorizontal()));
        }

        if (avaliacao.getArremessoMedicineBall() == -1) {
            fieldThrowOfMedicineBall.setText("");
        } else {
            fieldThrowOfMedicineBall.setText(String.valueOf((int)avaliacao.getArremessoMedicineBall()));
        }

        if (avaliacao.getTesteDoQuadrado() == -1) {
            fiedlSquareTest.setText("");
        } else {
            fiedlSquareTest.setText(String.valueOf((int)avaliacao.getTesteDoQuadrado()));
        }

        if (avaliacao.getCorrida20Metros() == -1) {
            field20MetersRun.setText("");
        } else {
            field20MetersRun.setText(String.valueOf((int)avaliacao.getCorrida20Metros()));
        }

        if (avaliacao.isSentarEAlcancarComBanco() == true) {
            radioSitAndAchieveWithSeat.setSelected(true);
            radioSitAndAchieveWithoutSeat.setSelected(false);
        } else {
            radioSitAndAchieveWithSeat.setSelected(false);
            radioSitAndAchieveWithoutSeat.setSelected(true);
        }
        
        if (avaliacao.isSalvoParaEnviar() == true){
            avaliacaoFinalizadaCheckBox.setSelected(true);
        }
        else{
            avaliacaoFinalizadaCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_comboNomeDoAlunoPopupMenuWillBecomeInvisible

    private void controlPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_controlPanelComponentShown
       atualizaJTable();
    }//GEN-LAST:event_controlPanelComponentShown
    
    //Adiciona no controle de avaliacoa todas as turmas.
    //No campo nome, mostra o nome da turma.
    //No campo data da ultima avaliacao ele mostra a data da avaliacao mais recente feita por alguem daquela turma.
    //No campo status ele mostra quantos alunos possuem uma avaliacao pronta para ser salva para enviar ao servidor do total de alunos da turma.
    private void atualizaJTable(){
        clearJTable();       
        
        int jTableRow = 0;
        
        Date data = null;
        int quantidadeTotal;
        int quantidadeAvaliacao;
        
        int rowsTotalSize = Escola.getInstance().getLogado().getTurmas().size();
        if(rowsTotalSize > jTable1.getRowCount()){
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(rowsTotalSize);
        }
        for(Turma i : Escola.getInstance().getLogado().getTurmas()){
            if(!i.getId().equals("Sem Turma") && i != null){
                quantidadeTotal = i.buscaTodosAlunos().size();
                quantidadeAvaliacao = 0;
                
                
                for(Aluno j : i.buscaTodosAlunos()){
                    if(j != null){
                        Avaliacao avaliacao = (Avaliacao) j.getLastAvaliation();
                        if (avaliacao.isSalvoParaEnviar() && !avaliacao.isEnviado()){

                            if(data == null){
                                data = avaliacao.getData();
                            }
                            else if(avaliacao.getData().before(data)){
                                data = avaliacao.getData();
                            }
                            quantidadeAvaliacao++;

                        }             
                    }
                }
                if(quantidadeAvaliacao > 0){
                    jTable1.setValueAt(i, jTableRow, 0);
                    String[] dataSplit = data.toString().split(" ");
                    jTable1.setValueAt(String.valueOf(dataSplit[2]) + " de " + returnMonth(dataSplit[1]) + " de "+dataSplit[5], jTableRow, 1);
                    jTable1.setValueAt(String.valueOf(quantidadeAvaliacao) + " aluno(s) avaliado(s) de " + String.valueOf(quantidadeTotal), jTableRow, 2);
                }
                else{
                    jTable1.setValueAt(i, jTableRow, 0);
                    jTable1.setValueAt("0 aluno(s) avaliado(s) de " + String.valueOf(quantidadeTotal), jTableRow, 2);
                }
                jTableRow++;
           }   
        }
    }
    
    //Pega as turmas selecionadas no controle de avaliação e envia para ser salvo em XML quando o botão gerar arquivo para envio é acionado
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Pega todas as turmas selecionadas na tabela para gerar o arquivo de envio para o site e gera o .xml do arquivo.
        ArrayList<Turma> turmasSelecionadas = new ArrayList<>();
        ArrayList<Turma> turmasParaSalvar = new ArrayList<>();
        
        for (int i : jTable1.getSelectedRows()){
            Turma tmp = (Turma) jTable1.getValueAt(i, 0);
            if(tmp != null){
                turmasSelecionadas.add(tmp);
            }
        }
        
        if (turmasSelecionadas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma Turma Selecionada!", "Erro",  JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        
        for(Turma i : turmasSelecionadas){
            for(Aluno j : i.buscaTodosAlunos()){
                if(j != null){
                    Avaliacao avaliacao = (Avaliacao) j.getLastAvaliation();
                    if (avaliacao.isSalvoParaEnviar()){
                        turmasParaSalvar.add(i);
                        break;
                    }
                }  
            }
        }
        
        if (turmasParaSalvar.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhuma avaliação apta a ser enviada!", "Erro",  JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        UIManager.put("FileChooser.openButtonText", "Salvar"); 
        
        File file;
        JFileChooser arquivo = new JFileChooser();
        
        arquivo.setDialogTitle("Selecione o local para salvar o arquivo de envio");    
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);    
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML Files", new String[]{"xml"});
        arquivo.setFileFilter(filter);          
        arquivo.setAcceptAllFileFilterUsed(false);  
        arquivo.setMultiSelectionEnabled(false); 
        arquivo.setPreferredSize( new Dimension(600, 400) );
        
        int option = arquivo.showOpenDialog(this);
        
        if (option == JFileChooser.APPROVE_OPTION){

            file = arquivo.getSelectedFile();

            if (!file.getAbsolutePath().endsWith(".xml"))
            {
                /*se o arquivo não termina com a extensão do filtro então ele põe todo o caminho do arquivo
                 * mais o nome seguido da extensão do filtro*/
                file = new File(file.getAbsolutePath() + ".xml");
            }
            
            if (!file.exists()){
                boolean salvar = Escola.getInstance().salvarParaEnviar2(turmasParaSalvar, file.getAbsolutePath());
                
                if (salvar){
                    JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro ao tentar salvar as avaliações!", "Erro",  JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "O arquivo já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        atualizaJTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        this.testTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_formComponentHidden

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox avaliacaoFinalizadaCheckBox;
    private javax.swing.JButton buttonSave;
    private javax.swing.ButtonGroup chairButtonGroup;
    private javax.swing.JComboBox comboNomeDoAluno;
    private javax.swing.JComboBox comboTurma;
    private javax.swing.JPanel controlPanel;
    private static javax.swing.JTextField fiedlSquareTest;
    private static javax.swing.JTextField field20MetersRun;
    private static javax.swing.JTextField fieldBodyMass;
    private static javax.swing.JTextField fieldHeight;
    private static javax.swing.JTextField fieldHorizontalJump;
    private static javax.swing.JTextField fieldIMC;
    private static javax.swing.JTextField fieldRun;
    private static javax.swing.JTextField fieldSitAndAchieve;
    private static javax.swing.JTextField fieldSitUp;
    private static javax.swing.JTextField fieldSpread;
    private static javax.swing.JTextField fieldTemperature;
    private static com.toedter.calendar.JDateChooser fieldTestDate;
    private static javax.swing.JTextField fieldThrowOfMedicineBall;
    private static javax.swing.JTextField fieldTime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private static javax.swing.JLabel label20MetersRun;
    private static javax.swing.JLabel labelBodyMass;
    private static javax.swing.JLabel labelDataDaAvaliacao;
    private static javax.swing.JLabel labelHeight;
    private static javax.swing.JLabel labelHorario;
    private static javax.swing.JLabel labelHorizontalJump;
    private static javax.swing.JLabel labelIMC;
    private static javax.swing.JLabel labelRun;
    private static javax.swing.JLabel labelSitAndAchieve;
    private static javax.swing.JLabel labelSitUp;
    private static javax.swing.JLabel labelSpread;
    private static javax.swing.JLabel labelSquareTest;
    private javax.swing.JLabel labelStudentName;
    private static javax.swing.JLabel labelTemperatura;
    private static javax.swing.JLabel labelThrowOfMedicineBall;
    private javax.swing.JLabel labelTurma;
    private javax.swing.JPanel newEditPanel;
    private static javax.swing.JRadioButton radio6Minutes;
    private static javax.swing.JRadioButton radio9Minutes;
    private static javax.swing.JRadioButton radioSitAndAchieveWithSeat;
    private static javax.swing.JRadioButton radioSitAndAchieveWithoutSeat;
    private javax.swing.ButtonGroup runningButtonGroup;
    private javax.swing.JTabbedPane testTabbedPane;
    // End of variables declaration//GEN-END:variables
    private static boolean turmaAdicionada;
    private static int numeroDeTurmasAdicionadas = 0;
    private static boolean turmaAdicionadaComboTurma;
    private static int numeroDeTurmasAdicionadasComboTurma = 0;

    //Passa como parametro o mes obtido da classe Data.getDate().ToString() e retorna o mes escrito por extenso em portugues. 
    private String returnMonth(String mes){
        String literal = "";
        switch (mes){
            case "Jan":
                literal = "Janeiro";
                break;
            case "Fev":
                literal = "Fevereiro";
                break;
            case "Mar":
                literal = "Marco";
                break;
            case "Abr":
                literal = "Abril"; 
                break;
            case "May":
                literal = "Maio";
                break;
            case "Jun":
                literal = "Junho";
                break;
            case "Jul":
                literal = "Julho";
                break;
            case "Ago":
                literal = "Agosto";
                break;
            case "Sep":
                literal = "Setembro";
                break;
            case "Oct":
                literal = "Outubro";
                break;
            case "Nov":
                literal = "Novembro";
                break;
            case "Dec":              
                literal = "Dezembro";
                break;
        }
        return literal;
    }
    
    public static boolean isTurmaAdicionadaComboTurma() {
        return turmaAdicionadaComboTurma;
    }

    public static void setTurmaAdicionadaComboTurma(boolean turmaAdicionadaComboTurma) {
        TestPanel.turmaAdicionadaComboTurma = turmaAdicionadaComboTurma;
    }

    public static int getNumeroDeTurmasAdicionadasComboTurma() {
        return numeroDeTurmasAdicionadasComboTurma;
    }

    public static void setNumeroDeTurmasAdicionadasComboTurma(int numeroDeTurmasAdicionadasComboTurma) {
        TestPanel.numeroDeTurmasAdicionadasComboTurma = numeroDeTurmasAdicionadasComboTurma;
    }

    public static boolean isTurmaAdicionada() {
        return turmaAdicionada;
    }

    public static void setTurmaAdicionada(boolean turmaAdicionada) {
        TestPanel.turmaAdicionada = turmaAdicionada;
    }

    public static int getNumeroDeTurmasAdicionadas() {
        return numeroDeTurmasAdicionadas;
    }

    public static void setNumeroDeTurmasAdicionadas(int numeroDeTurmasAdicionadas) {
        TestPanel.numeroDeTurmasAdicionadas = numeroDeTurmasAdicionadas;
    }

    public static Date getCampoDataDaAvaliacao() {
        if (fieldTestDate.getDate() == null) {
            return null;
        } else {
            return fieldTestDate.getDate();
        }
    }

    public static String getCampoHora() {
        if (fieldTime.getText().isEmpty()) {
            return null;
        } else {
            return fieldTime.getText();
        }
    }

    public static String getCampoTemperatura() {
        if (fieldTemperature.getText().isEmpty()) {
            return null;
        } else {
            return fieldTemperature.getText();
        }
    }

    public static float getCampoMassaCorporal() {
        try {
            return Float.parseFloat(fieldBodyMass.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelBodyMass.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static float getCampoEstatura() {
        try {
            return Float.parseFloat(fieldHeight.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelHeight.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static float getCampoIMC() {
        try {
            return Float.parseFloat(fieldIMC.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelIMC.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static float getCampoEnvergadura() {
        try {
            return Float.parseFloat(fieldSpread.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelSpread.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static int getCampoAbdominal() {
        try {
            return Integer.parseInt(fieldSitUp.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelSitUp.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static float getCampoSentarEAlcancar() {
        try {
            return Float.parseFloat(fieldSitAndAchieve.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelSitAndAchieve.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static boolean getRadioSentarEAlcancarComBanco() {
        if (radioSitAndAchieveWithSeat.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getRadioSentarEAlcancarSemBanco() {
        if (radioSitAndAchieveWithoutSeat.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public static float getCampoCorrida6Ou9Minutos() {
        try {
            return Float.parseFloat(fieldRun.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelRun.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static boolean getRadio6Minutos() {
        if (radio6Minutes.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getRadio9Minutos() {
        if (radio9Minutes.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public static float getCampoSaltoHorizontal() {
        try {
            return Float.parseFloat(fieldHorizontalJump.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelHorizontalJump.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static float getCampoQuadrado() {
        try {
            return Float.parseFloat(fiedlSquareTest.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelSquareTest.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static float getCampoArremessoDeMedicineBall() {
        try {
            return Float.parseFloat(fieldThrowOfMedicineBall.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + labelThrowOfMedicineBall.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public static float getCampoCorridaDe20Metros() {
        try {
            return Float.parseFloat(field20MetersRun.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número em " + label20MetersRun.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public void limpaComboNomeDoAluno() {
        comboNomeDoAluno.removeAllItems();
    }

    public void limpaComboNomeTurma() {
        comboTurma.removeAllItems();
    }

    public void limpaCampos() {
        fieldTestDate.setDate(null);
        fieldTime.setText("");
        fieldTemperature.setText("");
        fieldBodyMass.setText("");
        fieldHeight.setText("");
        fieldIMC.setText("");
        fieldSpread.setText("");
        fieldSitUp.setText("");
        fieldSitAndAchieve.setText("");
        fieldRun.setText("");
        fieldHorizontalJump.setText("");
        fieldThrowOfMedicineBall.setText("");
        fiedlSquareTest.setText("");
        field20MetersRun.setText("");
        radioSitAndAchieveWithSeat.setSelected(true);
        radio6Minutes.setSelected(true);
        radioSitAndAchieveWithoutSeat.setSelected(false);
        radio9Minutes.setSelected(false);
        avaliacaoFinalizadaCheckBox.setSelected(false);
    }
    
    //Se a data estiver invalida, pinta o label data de vermelho para saber que ha algo errado com a data.
    private boolean saveData(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null) {
            return false;
        }
        if(fieldTestDate.getDate() == null){
            labelDataDaAvaliacao.setForeground(Color.red);
            return false;
        }
        labelDataDaAvaliacao.setForeground(Color.black);
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setData(fieldTestDate.getDate());
        return true;
    }
    
    //Se o campo do horario estiver errado, ou em algum horario invalido pinta o label e o texto em vermelho para saber que ha algo errado.
    private boolean saveTime(){
        String horaDaAvaliacaoString = getCampoHora();
        boolean Error = false;
        if (getCampoHora() != null) {
            String splitedTime[] = horaDaAvaliacaoString.split(":");
            //pega o que esta antes e depois dos dois pontos e põe no vetor horarioDividido
            if ((horaDaAvaliacaoString.length() != 5) || !(splitedTime.length == 2)) {
                Error = true;
            } else if (Integer.parseInt(splitedTime[0]) > 23 || Integer.parseInt(splitedTime[0]) < 0 || Integer.parseInt(splitedTime[1]) > 59 || Integer.parseInt(splitedTime[1]) < 0 ) {
                Error = true;
            }
        }
        if (getCampoHora() == null || Error == true) {
            fieldTime.setForeground(Color.red);
            labelHorario.setForeground(Color.red);
            return false;
        } else {
            fieldTime.setForeground(Color.black);
            labelHorario.setForeground(Color.black);
            Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
            if (student == null) {
                return false;
            }
            Avaliacao avaliacao = student.getLastAvaliation();
            avaliacao.setHorario(fieldTime.getText());
        }
        return true;
    }
    
    private boolean saveTemperature(){
        if (getCampoTemperatura() == null) {
            labelTemperatura.setForeground(Color.red);
            fieldTemperature.setForeground(Color.red);
            return false;
        } else {
            labelTemperatura.setForeground(Color.black);
            fieldTemperature.setForeground(Color.black);
            Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
            if (student == null) {
                return false;
            }
            Avaliacao avaliacao = student.getLastAvaliation();
            avaliacao.setTemperatura(fieldTemperature.getText());
        }
        return true;
    }
    
    private void saveBodyMass(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldBodyMass.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setMassaCorporal(Float.valueOf(fieldBodyMass.getText()));
        
    }
    
    private void saveHeight(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldHeight.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setEstatura(Float.valueOf(fieldHeight.getText()));
    }
    
    private void saveIMC(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldIMC.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setIMC(Float.valueOf(fieldIMC.getText()));
    }
    
    private void saveSpread(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldSpread.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setEnvergadura(Float.valueOf(fieldSpread.getText()));
    }
    
    private void saveSitUp(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldSitUp.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setAbdominal(Integer.valueOf(fieldSitUp.getText()));
    }
    
    private void saveSitUpAndAchieve(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldSitAndAchieve.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setSentarEAlcancar(Float.valueOf(fieldSitAndAchieve.getText()));
    }
    
    private void saveRun(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldRun.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        if (getRadio6Minutos()) {
            avaliacao.set6Minutos(getCampoCorrida6Ou9Minutos());
            avaliacao.set9Minutos(-1);
        } else {
            avaliacao.set6Minutos(-1);
            avaliacao.set9Minutos(getCampoCorrida6Ou9Minutos());
        }
    }
    
    private void saveWithSeat(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        if(getRadioSentarEAlcancarComBanco())
            avaliacao.setSentarEAlcancarComBanco(true);
    }
    
    private void saveWithoutSeat(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        if(getRadioSentarEAlcancarSemBanco())
            avaliacao.setSentarEAlcancarComBanco(false);
    }
    
    private void saveRadio6(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldRun.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        if(getRadio6Minutos()){
            avaliacao.set6Minutos(Float.valueOf(fieldRun.getText()));
            avaliacao.set9Minutos(-1);
        }
    }
    
    private void saveRadio9(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldRun.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        if(getRadio9Minutos()){
            avaliacao.set9Minutos(Float.valueOf(fieldRun.getText()));
            avaliacao.set6Minutos(-1);
        }
    }
    
    private void saveHorizontalJump(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldHorizontalJump.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setSaltoHorizontal(Float.valueOf(fieldHorizontalJump.getText()));
    }
    
    private void saveMedicineBallThrow(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fieldThrowOfMedicineBall.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setArremessoMedicineBall(Float.valueOf(fieldThrowOfMedicineBall.getText()));
    }
    
    private void saveSquareTest(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(fiedlSquareTest.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setTesteDoQuadrado(Float.valueOf(fiedlSquareTest.getText()));
    }
    
    private void save20MettersRun(){
        Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
        if (student == null || "".equals(field20MetersRun.getText())) {
            return;
        }
        Avaliacao avaliacao = student.getLastAvaliation();
        avaliacao.setCorrida20Metros(Float.valueOf(field20MetersRun.getText()));
    }

    public void clearAll() {
        this.testTabbedPane.setSelectedIndex(0);
    }
    
    //Como o jTable nao possui metodo para limpar todos os dados escritos nele, foi implementado um metodo para passar por todos
    //os campos escritos e limpar eles.
    private void clearJTable(){
        int i=0;
        while(true){
            if(jTable1.getValueAt(i, 0) != null){
                jTable1.setValueAt(null, i, 0);
                jTable1.setValueAt(null, i, 1);
                jTable1.setValueAt(null, i, 2);
            }
            else
                break;
            i++;
        }
    }
    
    //Metodo que salva todos os dados dos campos correspondentes a avaliacao do aluno.
    //Primeiramente ele tenta salvar a data, o horario e a temperatura. Se algum deles estiver errado, ele para de salvar os dados da
    //avaliacao. Se todos os 3 estiverem correto, ele salva todos os dados na avaliacao, limpa os campos e avisa ao usuario de que
    //as alteracoes foram salvas com sucesso.
    private void saveAll(){
       boolean trySave = true;
       trySave = saveData() && trySave;
       trySave = saveTime() && trySave;
       trySave = saveTemperature() && trySave;
       if(trySave){
           salvarEnviadoCheckbox();
            saveBodyMass();
            saveHeight();
            saveIMC();
            saveSpread();
            saveSitUp();
            saveSitUpAndAchieve();
            saveWithSeat();
            saveWithoutSeat();
            saveRadio6();
            saveRadio9();
            saveRun();
            saveHorizontalJump();
            saveMedicineBallThrow();
            saveSquareTest();
            save20MettersRun();
            
            Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
            Escola.getInstance().salvarAvaliacoes(student);
            
            this.limpaCampos();
            this.limpaComboNomeDoAluno();
            this.limpaComboNomeTurma();
            
            JOptionPane.showMessageDialog(null, "Avaliacao salva com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void salvarEnviadoCheckbox(){
       Aluno student = (Aluno) comboNomeDoAluno.getSelectedItem();
       if (student == null) {
           return;
       }
       Avaliacao avaliacao = student.getLastAvaliation();
       if(avaliacaoFinalizadaCheckBox.isSelected()){
            avaliacao.setSalvoParaEnviar(true); 
       }
       else{
            avaliacao.setSalvoParaEnviar(false); 
       }
    }
}
