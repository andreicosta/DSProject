/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import dsproject.Aluno;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author pazuti
 */
public class TestPanel extends javax.swing.JPanel
{

    /**
     * Creates new form TestPanel
     */
    public TestPanel()
    {
        /*try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestPanel.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chairButtonGroup = new javax.swing.ButtonGroup();
        runningButtonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        newEditPanel = new javax.swing.JPanel();
        comboTurma = new javax.swing.JComboBox();
        comboBoxStudentName = new javax.swing.JComboBox();
        labelTurma = new javax.swing.JLabel();
        labelStudentName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelTestDate = new javax.swing.JLabel();
        fieldTestDate = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelTemperature = new javax.swing.JLabel();
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
        labelTime = new javax.swing.JLabel();
        fieldTime = new javax.swing.JTextField();
        labelIMC = new javax.swing.JLabel();
        fieldIMC = new javax.swing.JTextField();
        controlPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        loadPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        chairButtonGroup.add(radioSitAndAchieveWithSeat);
        chairButtonGroup.add(radioSitAndAchieveWithoutSeat);

        runningButtonGroup.add(radio6Minutes);
        runningButtonGroup.add(radio9Minutes);

        setMinimumSize(new java.awt.Dimension(833, 515));
        setPreferredSize(new java.awt.Dimension(833, 515));

        newEditPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboTurma.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTurmaPopupMenuWillBecomeVisible(evt);
            }
        });
        newEditPanel.add(comboTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 18, 210, -1));

        newEditPanel.add(comboBoxStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 18, 350, -1));

        labelTurma.setText("Turma");
        newEditPanel.add(labelTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, -1, -1));

        labelStudentName.setText("Nome do Aluno");
        newEditPanel.add(labelStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 23, -1, -1));
        newEditPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 801, -1));

        labelTestDate.setText("Data da Avaliação");
        newEditPanel.add(labelTestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, -1, -1));
        newEditPanel.add(fieldTestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 69, 180, -1));
        newEditPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 329, 801, -1));

        jLabel4.setText("Saúde");
        newEditPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 108, -1, -1));

        jLabel5.setText("Desempenho Motor");
        newEditPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 306, -1, -1));
        newEditPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 801, 10));

        labelTemperature.setText("Temperatura");
        newEditPanel.add(labelTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 74, -1, -1));

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
        newEditPanel.add(fieldSitAndAchieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 181, 80, -1));

        fieldSpread.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldSpreadKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldSpread, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 259, 80, -1));

        fieldHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldHeightKeyTyped(evt);
            }
        });
        newEditPanel.add(fieldHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 181, 80, -1));

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
        newEditPanel.add(field20MetersRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 386, 80, -1));
        newEditPanel.add(fiedlSquareTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 341, 80, -1));
        newEditPanel.add(fieldHorizontalJump, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 341, 80, -1));
        newEditPanel.add(fieldThrowOfMedicineBall, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 386, 80, -1));

        jLabel24.setText("cm");
        newEditPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 346, -1, -1));

        jLabel25.setText("cm");
        newEditPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 391, -1, -1));

        jLabel26.setText("s");
        newEditPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 346, -1, -1));

        jLabel27.setText("s");
        newEditPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 391, -1, -1));

        buttonSave.setText("Salvar");
        buttonSave.setPreferredSize(new java.awt.Dimension(80, 29));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        newEditPanel.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 425, 90, -1));

        labelTime.setText("Horário");
        newEditPanel.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 74, -1, -1));

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

        jTabbedPane1.addTab("Nova Avaliação / Editar Avaliação", newEditPanel);

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
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);

        controlPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 25, 710, -1));

        jTabbedPane1.addTab("Controle de Avaliações", controlPanel);

        loadPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Turma");
        loadPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 55, -1, -1));

        loadPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 50, 648, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Aluno", "Status da Avaliação"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        loadPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 95, 727, 347));

        jTabbedPane1.addTab("Carregar Avaliação", loadPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonSaveActionPerformed
   {//GEN-HEADEREND:event_buttonSaveActionPerformed
      java.util.Date dataDeNascimento;
      java.util.Date dataDaAvaliacao;
      java.util.Date horaDaAvaliacao = null;
      java.sql.Date sqlDataDeNascimento = null;
      java.sql.Date sqlDataDaAvaliacao = null;
      String horaDaAvaliacaoString = null;
      String temperatura;
      String dataDeNascimentoString = "13/04/1999"; //aqui vai Aluno.getDataDeNascimento()
      SimpleDateFormat formatoDaData = new SimpleDateFormat("dd/MM/yyyy");
      SimpleDateFormat formatoDaHora = new SimpleDateFormat("HH:mm");
      FileInputStream arquivo;
      ArrayList<Aluno> alunos;
      ObjectInputStream entrada = null;
      ObjectOutputStream saida = null;
      File arquivoAlunos = new File("alunos.txt");

      try
      {
         dataDaAvaliacao = getCampoDataDaAvaliacao();
         horaDaAvaliacaoString = getCampoHora();
         temperatura = getCampoTemperatura();
         
         if(dataDaAvaliacao != null && horaDaAvaliacaoString != null && temperatura != null)
         {
            //testa se foi digitado uma hora mais : mais minutos
            if(horaDaAvaliacaoString.length() != 5)
            {
               JOptionPane.showMessageDialog(null, "Digite um horario correto", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
               //pega o que esta antes e depois dos dois pontos e põe no vetor horarioDividido
               String splitedTime[] = horaDaAvaliacaoString.split(":");
               //testa se a hora é maior que 23
               if(Integer.parseInt(splitedTime[0]) > 23)
               {
                  JOptionPane.showMessageDialog(null, "Digite uma hora no formato 24h", "Erro", JOptionPane.ERROR_MESSAGE);
               }
               else
               {
                  //testa se os minutos são maiores que 59
                  if(Integer.parseInt(splitedTime[1]) > 59)
                  {
                     JOptionPane.showMessageDialog(null, "Digite os minutos corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
                  }
                  else
                  {
                     //converte uma data escrita no formato de string para o formato de data do java
                     dataDeNascimento = formatoDaData.parse(dataDeNascimentoString);

                     //converte a data em formato do java para o formato do mysql
                     sqlDataDaAvaliacao = new java.sql.Date(dataDaAvaliacao.getTime());
                     sqlDataDeNascimento = new java.sql.Date(dataDeNascimento.getTime());

                     horaDaAvaliacao = formatoDaHora.parse(horaDaAvaliacaoString);

                     dsproject.Aluno aluno = new dsproject.Aluno("Maria", "Joao", null, null, null, null, "Miguel", sqlDataDeNascimento, "sdfgdfsg", "Masculino", "Pelotas", "RS");
                     if(aluno.inserirAvaliacao(sqlDataDaAvaliacao, horaDaAvaliacaoString, temperatura))
                     {
                        // daqui até o catch salva objeto aluno
                        try
                        {
                           //fileStudents = new File("alunos.txt");
                           if(arquivoAlunos.exists())
                           {
                              FileInputStream file = new FileInputStream(arquivoAlunos);
                              entrada = new ObjectInputStream(file);
                              alunos = (ArrayList<Aluno>)entrada.readObject();
                              alunos.add(aluno);
                              saida = new ObjectOutputStream(new FileOutputStream("alunos.txt"));
                              saida.writeObject(alunos);
                              saida.close();
                              JOptionPane.showMessageDialog(null, "Avaliação salva", "Confirmação!", JOptionPane.INFORMATION_MESSAGE);
                           }
                           else
                           {
                              alunos = new ArrayList<>();
                              alunos.add(aluno);
                              saida = new ObjectOutputStream(new FileOutputStream("alunos.txt"));
                              saida.writeObject(alunos);
                              saida.close();
                              JOptionPane.showMessageDialog(null, "Avaliação salva com sucesso", "Confirmação!", JOptionPane.INFORMATION_MESSAGE);
                           }
                        }
                        catch (IOException | ClassNotFoundException ex)
                        {
                           System.err.println(ex);
                        }
                        //System.out.println(sh.format(hora));
                        //System.out.println(sd.format(dataAvaliacao));
                     }
                  }
               }
            }
         }
      }
      catch (ParseException | NullPointerException ex)
      {
	 System.err.println(ex);
      }
   }//GEN-LAST:event_buttonSaveActionPerformed

   private void fieldTimeKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldTimeKeyTyped
   {//GEN-HEADEREND:event_fieldTimeKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
      {
         evt.setKeyChar('\0');
      }
      else
      {
         String textoCampo = fieldTime.getText();
         if(textoCampo.length() == 2)
            fieldTime.setText(textoCampo + ":");
         else
         {
            if(textoCampo.length() > 4)
               evt.setKeyChar('\0');
         }
      }
   }//GEN-LAST:event_fieldTimeKeyTyped

   private void fieldTemperatureKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldTemperatureKeyTyped
   {//GEN-HEADEREND:event_fieldTemperatureKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
      {
         evt.setKeyChar('\0');
      }
      else
      {
         String textoCampo = fieldTemperature.getText();
         if(textoCampo.length() > 1)
            evt.setKeyChar('\0');
      }
   }//GEN-LAST:event_fieldTemperatureKeyTyped

   private void fieldBodyMassKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldBodyMassKeyTyped
   {//GEN-HEADEREND:event_fieldBodyMassKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
      {
         evt.setKeyChar('\0');
      }
      else
      {
         String textoCampo = fieldBodyMass.getText();
         if(textoCampo.length() > 2)
            evt.setKeyChar('\0');
      }
   }//GEN-LAST:event_fieldBodyMassKeyTyped

   private void fieldHeightKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldHeightKeyTyped
   {//GEN-HEADEREND:event_fieldHeightKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
      {
         evt.setKeyChar('\0');
      }
      else
      {
         String textoCampo = fieldHeight.getText();
         if(textoCampo.length() > 2)
            evt.setKeyChar('\0');
      }
   }//GEN-LAST:event_fieldHeightKeyTyped

   private void fieldIMCKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldIMCKeyTyped
   {//GEN-HEADEREND:event_fieldIMCKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
      {
         evt.setKeyChar('\0');
      }
      else
      {
         String textoCampo = fieldIMC.getText();
         //System.out.println("length sem ponto = " + campoIMC.getText().length());
         if(textoCampo.length() == 2)
         {
            fieldIMC.setText(textoCampo + ".");
            //System.out.println("ponto colocado length = " + campoIMC.getText().length());
         }
         else
         {
            if(textoCampo.length() > 3)
               evt.setKeyChar('\0');
         }
      }
   }//GEN-LAST:event_fieldIMCKeyTyped

   private void fieldSpreadKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldSpreadKeyTyped
   {//GEN-HEADEREND:event_fieldSpreadKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
      {
         evt.setKeyChar('\0');
      }
      else
      {
         String textoCampo = fieldSpread.getText();
         if(textoCampo.length() > 2)
            evt.setKeyChar('\0');
      }
   }//GEN-LAST:event_fieldSpreadKeyTyped

   private void fieldSitUpKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_fieldSitUpKeyTyped
   {//GEN-HEADEREND:event_fieldSitUpKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
      {
         evt.setKeyChar('\0');
      }
      else
      {
         String textoCampo = fieldSitUp.getText();
         if(textoCampo.length() > 2)
            evt.setKeyChar('\0');
      }
   }//GEN-LAST:event_fieldSitUpKeyTyped

   private void comboTurmaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_comboTurmaPopupMenuWillBecomeVisible
   {//GEN-HEADEREND:event_comboTurmaPopupMenuWillBecomeVisible
      Object isNull;
      isNull = comboTurma.getItemAt(0);
      int i = 0;
      ArrayList<dsproject.Turma> turmas;
      File arquivoTurmas = new File("turmas.txt");
      FileInputStream arquivo;
      ObjectInputStream in;
      if(isTurmaAdicionada() && isNull == null)
      {
         //daqui até o catch le um objeto gravado no arquivo alunos.txt
         if(arquivoTurmas.exists())
         {
            try
            {
               arquivo = new FileInputStream(arquivoTurmas);
               in = new ObjectInputStream(arquivo);
               turmas = (ArrayList<dsproject.Turma>)in.readObject();
               i = 0;
               comboTurma.addItem("");
               while(i < turmas.size())
               {
                  comboTurma.addItem(turmas.get(i).getId());
                  i++;
               }
            }
            catch (IOException | ClassNotFoundException ex)
            {
               System.err.println(ex);
            }

         }
         setTurmaAdicionada(false);
         setNumeroDeTurmasAdicionadas(0);
      }
      else
      {
         if(isTurmaAdicionada()&& isNull != null)
         {
            //daqui até o catch le um objeto gravado no arquivo alunos.txt
            if(arquivoTurmas.exists())
            {
               try
               {
                  arquivo = new FileInputStream(arquivoTurmas);
                  in = new ObjectInputStream(arquivo);
                  turmas = (ArrayList<dsproject.Turma>)in.readObject();
                  i = (turmas.size() - getNumeroDeTurmasAdicionadas());
                  while(i < turmas.size())
                  {
                     comboTurma.addItem(turmas.get(i).getId());
                     i++;
                  }
               }
               catch (IOException | ClassNotFoundException ex)
               {
                  System.err.println(ex);
               }

            }
            setTurmaAdicionada(false);
            setNumeroDeTurmasAdicionadas(0);
         }
         else
         {
            if(isNull == null)
            {
               i = 0;

               //daqui até o catch le um objeto gravado no arquivo alunos.txt
               if(arquivoTurmas.exists())
               {
                  try
                  {
                     arquivo = new FileInputStream(arquivoTurmas);
                     in = new ObjectInputStream(arquivo);
                     turmas = (ArrayList<dsproject.Turma>)in.readObject();
                     comboTurma.addItem("");
                     while(i < turmas.size())
                     {
                        comboTurma.addItem(turmas.get(i).getId());
                        i++;
                     }
                  }
                  catch (IOException | ClassNotFoundException ex)
                  {
                     System.err.println(ex);
                  }
               }
            }
         }
      }
   }//GEN-LAST:event_comboTurmaPopupMenuWillBecomeVisible

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.ButtonGroup chairButtonGroup;
    private javax.swing.JComboBox comboBoxStudentName;
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
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private static javax.swing.JLabel label20MetersRun;
    private static javax.swing.JLabel labelBodyMass;
    private static javax.swing.JLabel labelHeight;
    private static javax.swing.JLabel labelHorizontalJump;
    private static javax.swing.JLabel labelIMC;
    private static javax.swing.JLabel labelRun;
    private static javax.swing.JLabel labelSitAndAchieve;
    private static javax.swing.JLabel labelSitUp;
    private static javax.swing.JLabel labelSpread;
    private static javax.swing.JLabel labelSquareTest;
    private javax.swing.JLabel labelStudentName;
    private static javax.swing.JLabel labelTemperature;
    private static javax.swing.JLabel labelTestDate;
    private static javax.swing.JLabel labelThrowOfMedicineBall;
    private static javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTurma;
    private javax.swing.JPanel loadPanel;
    private javax.swing.JPanel newEditPanel;
    private static javax.swing.JRadioButton radio6Minutes;
    private static javax.swing.JRadioButton radio9Minutes;
    private static javax.swing.JRadioButton radioSitAndAchieveWithSeat;
    private static javax.swing.JRadioButton radioSitAndAchieveWithoutSeat;
    private javax.swing.ButtonGroup runningButtonGroup;
    // End of variables declaration//GEN-END:variables
   private static boolean turmaAdicionada;
   private static int numeroDeTurmasAdicionadas = 0;

   public static boolean isTurmaAdicionada()
   {
      return turmaAdicionada;
   }

   public static void setTurmaAdicionada(boolean turmaAdicionada)
   {
      TestPanel.turmaAdicionada = turmaAdicionada;
   }

   public static int getNumeroDeTurmasAdicionadas()
   {
      return numeroDeTurmasAdicionadas;
   }

   public static void setNumeroDeTurmasAdicionadas(int numeroDeTurmasAdicionadas)
   {
      TestPanel.numeroDeTurmasAdicionadas = numeroDeTurmasAdicionadas;
   }
   
   public static Date getCampoDataDaAvaliacao()
   {
      if(fieldTestDate.getDate() == null)
      {
         JOptionPane.showMessageDialog(null, "Escolha uma " + labelTestDate.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
         return null;
      }
      else
      {
         return fieldTestDate.getDate();
      }
   }

   public static String getCampoHora()
   {
      if(fieldTime.getText().isEmpty())
      {
         JOptionPane.showMessageDialog(null, "Digite um " + labelTime.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
         return null;
      }
      else
      {
         return fieldTime.getText();
      }
   }

   public static String getCampoTemperatura()
   {
      if(fieldTemperature.getText().isEmpty())
      {
         JOptionPane.showMessageDialog(null, "Digite uma " + labelTemperature.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
         return null;
      }
      else
      {
         return fieldTemperature.getText();
      }
   }

   public static float getCampoMassaCorporal()
   {
      try
      {
         return Float.parseFloat(fieldBodyMass.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelBodyMass.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }

   public static float getCampoEstatura()
   {
      try
      {
	 return Float.parseFloat(fieldHeight.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelHeight.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }

   public static float getCampoIMC()
   {
      try
      {
	 return Float.parseFloat(fieldIMC.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelIMC.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }

   public static float getCampoEnvergadura()
   {
      try
      {
	 return Float.parseFloat(fieldSpread.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelSpread.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }

   public static int getCampoAbdominal()
   {
      try
      {
	 return Integer.parseInt(fieldSitUp.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelSitUp.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }

   public static float getCampoSentarEAlcancar()
   {
      try
      {
	 return Float.parseFloat(fieldSitAndAchieve.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelSitAndAchieve.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }
   
   public static boolean getRadioSentarEAlcancarComBanco()
   {
      if(radioSitAndAchieveWithSeat.isSelected())
         return true;
      else
         return false;
   }

   public static boolean getRadioSentarEAlcancarSemBanco()
   {
      if(radioSitAndAchieveWithoutSeat.isSelected())
         return true;
      else
         return false;
   }

   public static float getCampoCorrida6Ou9Minutos()
   {
      try
      {
	 return Float.parseFloat(fieldRun.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelRun.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }

   public static boolean getRadio6Minutos()
   {
      if(radio6Minutes.isSelected())
         return true;
      else
         return false;
   }

   public static boolean getRadio9Minutos()
   {
      if(radio9Minutes.isSelected())
         return true;
      else
         return false;
   }
   
   public static float getCampoSaltoHorizontal()
   {
      try
      {
	 return Float.parseFloat(fieldHorizontalJump.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelHorizontalJump.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }

   public static float getCampoQuadrado()
   {
      try
      {
	 return Float.parseFloat(fiedlSquareTest.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelSquareTest.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }
   
   public static float getCampoArremessoDeMedicineBall()
   {
      try
      {
	 return Float.parseFloat(fieldThrowOfMedicineBall.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + labelThrowOfMedicineBall.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }
   
   public static float getCampoCorridaDe20Metros()
   {
      try
      {
	 return Float.parseFloat(field20MetersRun.getText());
      }
      catch (NumberFormatException ex)
      {
	 JOptionPane.showMessageDialog(null, "Digite um número em " + label20MetersRun.getText(), "Erro", JOptionPane.ERROR_MESSAGE);
	 return -1;
      }
   }
}
