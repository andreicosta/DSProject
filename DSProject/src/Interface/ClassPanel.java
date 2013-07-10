package Interface;

import dsproject.Aluno;
import dsproject.Turma;
import dsproject.Professor;
import dsproject.Escola;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class ClassPanel extends javax.swing.JPanel {

    private MainPanel superPanel = null;

    public ClassPanel() {
        initComponents();
    }

    public ClassPanel(MainPanel superPanel) {
        initComponents();
        this.superPanel = superPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        classTabbedPane = new javax.swing.JTabbedPane();
        newClassPanel = new javax.swing.JPanel();
        labelTurma = new javax.swing.JLabel();
        campoTurma = new javax.swing.JTextField();
        labelAnoLetivo = new javax.swing.JLabel();
        campoAnoLetivo = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAlunosSemTurmaCad = new DefaultListModel();
        availableStudentList = new javax.swing.JList(listaAlunosSemTurmaCad);
        jScrollPane3 = new javax.swing.JScrollPane();
        listaAlunosMatriculadosCad = new DefaultListModel();
        studentInClassList = new javax.swing.JList(listaAlunosMatriculadosCad);
        addToClassButton = new javax.swing.JButton();
        removeStudentFromClassButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editClassPanel = new javax.swing.JPanel();
        labelTurmaEditarTurma = new javax.swing.JLabel();
        comboTurmaEditarTurma = new javax.swing.JComboBox();
        labelAnoLetivoEditarTurma = new javax.swing.JLabel();
        campoAnoLetivoEditarTurma = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaAlunosSemTurma = new DefaultListModel();
        availableStudentList2 = new javax.swing.JList(listaAlunosSemTurma);
        jScrollPane7 = new javax.swing.JScrollPane();
        listaAlunosMatriculadosEdi = new DefaultListModel();
        studentInClassList2 = new javax.swing.JList(listaAlunosMatriculadosEdi);
        addToClassButton2 = new javax.swing.JButton();
        removeStudentFromClassButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        listClassesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alunosListaTurmaTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        turmaAlunosTable = new javax.swing.JTable();
        deleteClassPanel = new javax.swing.JPanel();
        labelTurmaRemoverTurma = new javax.swing.JLabel();
        comboTurmaRemoverTurma = new javax.swing.JComboBox();
        botaoRemover = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(833, 515));
        setMinimumSize(new java.awt.Dimension(833, 515));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        classTabbedPane.setPreferredSize(new java.awt.Dimension(833, 515));

        newClassPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newClassPanelComponentShown(evt);
            }
        });
        newClassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTurma.setText("Turma");
        newClassPanel.add(labelTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 26, -1, -1));

        campoTurma.setToolTipText("Entre o Nome da Turma");
        campoTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTurmaKeyTyped(evt);
            }
        });
        newClassPanel.add(campoTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 21, 110, -1));

        labelAnoLetivo.setText("Ano Letivo");
        newClassPanel.add(labelAnoLetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 26, -1, -1));

        campoAnoLetivo.setToolTipText("Entre com o Ano Letivo");
        campoAnoLetivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoAnoLetivoKeyTyped(evt);
            }
        });
        newClassPanel.add(campoAnoLetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 21, 110, -1));

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setToolTipText("Cadastra uma Nova Turma");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        newClassPanel.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 437, -1, -1));
        newClassPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 825, 10));

        availableStudentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        availableStudentList.setToolTipText("Alunos sem Turma");
        jScrollPane1.setViewportView(availableStudentList);

        newClassPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 121, 220, 345));

        studentInClassList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentInClassList.setToolTipText("Alunos a serem Adicionados na turma");
        jScrollPane3.setViewportView(studentInClassList);

        newClassPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 121, 220, 345));

        addToClassButton.setText("Adicionar");
        addToClassButton.setToolTipText("Adiciona um Aluno na Turma a ser criada");
        addToClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToClassButtonActionPerformed(evt);
            }
        });
        newClassPanel.add(addToClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 221, 90, -1));

        removeStudentFromClassButton.setText("Remover");
        removeStudentFromClassButton.setToolTipText("Remover um Aluno a ser criada");
        removeStudentFromClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentFromClassButtonActionPerformed(evt);
            }
        });
        newClassPanel.add(removeStudentFromClassButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 268, 90, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alunos");
        newClassPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 86, 220, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alunos na Turma");
        newClassPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 86, 220, -1));

        classTabbedPane.addTab("Cadastrar Turma", newClassPanel);

        editClassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTurmaEditarTurma.setText("Turma");
        editClassPanel.add(labelTurmaEditarTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 26, -1, -1));

        comboTurmaEditarTurma.setToolTipText("Selecione uma Turma");
        comboTurmaEditarTurma.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTurmaEditarTurmaPopupMenuWillBecomeVisible(evt);
            }
        });
        comboTurmaEditarTurma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTurmaEditarTurmaItemStateChanged(evt);
            }
        });
        editClassPanel.add(comboTurmaEditarTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 21, 110, -1));

        labelAnoLetivoEditarTurma.setText("Ano Letivo");
        editClassPanel.add(labelAnoLetivoEditarTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 26, -1, -1));

        campoAnoLetivoEditarTurma.setEditable(false);
        campoAnoLetivoEditarTurma.setToolTipText("Ano Letivo da turma Selecionada");
        editClassPanel.add(campoAnoLetivoEditarTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 21, 110, -1));

        botaoSalvar.setText("Salvar");
        botaoSalvar.setToolTipText("Salva as Alterações Realizadas na Turma");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        editClassPanel.add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 437, 85, -1));

        availableStudentList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        availableStudentList2.setToolTipText("Alunos sem Turma");
        jScrollPane6.setViewportView(availableStudentList2);

        editClassPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 121, 220, 345));

        studentInClassList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        studentInClassList2.setToolTipText("Alunos atualmente na Turma Selecionada");
        jScrollPane7.setViewportView(studentInClassList2);

        editClassPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 121, 220, 345));

        addToClassButton2.setText("Adicionar");
        addToClassButton2.setToolTipText("Adiciona o Aluno sem Turma selecionado na Turma");
        addToClassButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToClassButton2ActionPerformed(evt);
            }
        });
        editClassPanel.add(addToClassButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 221, 90, -1));

        removeStudentFromClassButton2.setText("Remover");
        removeStudentFromClassButton2.setToolTipText("Remover um Aluno da Turma");
        removeStudentFromClassButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentFromClassButton2ActionPerformed(evt);
            }
        });
        editClassPanel.add(removeStudentFromClassButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 268, 90, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Alunos");
        editClassPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 86, 220, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alunos na Turma");
        editClassPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 86, 220, -1));
        editClassPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 10));

        classTabbedPane.addTab("Editar Turma", editClassPanel);

        listClassesPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                listClassesPanelComponentShown(evt);
            }
        });
        listClassesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alunosListaTurmaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Aluno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(alunosListaTurmaTable);
        alunosListaTurmaTable.getColumnModel().getColumn(0).setResizable(false);

        listClassesPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 250, -1));

        ListSelectionModel listSelectionModel = turmaAlunosTable.getSelectionModel();
        listSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
        turmaAlunosTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Turma", "Nº Alunos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        turmaAlunosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                turmaAlunosTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(turmaAlunosTable);
        turmaAlunosTable.getColumnModel().getColumn(0).setResizable(false);
        turmaAlunosTable.getColumnModel().getColumn(1).setResizable(false);

        listClassesPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, -1));

        classTabbedPane.addTab("Lista de Turmas", listClassesPanel);

        deleteClassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTurmaRemoverTurma.setText("Turma");
        deleteClassPanel.add(labelTurmaRemoverTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 27, -1, -1));

        comboTurmaRemoverTurma.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTurmaRemoverTurmaPopupMenuWillBecomeVisible(evt);
            }
        });
        deleteClassPanel.add(comboTurmaRemoverTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 22, 500, -1));

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });
        deleteClassPanel.add(botaoRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 67, 86, -1));

        classTabbedPane.addTab("Remover Turma", deleteClassPanel);

        add(classTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 833, 515));
    }// </editor-fold>//GEN-END:initComponents

   private void campoAnoLetivoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_campoAnoLetivoKeyTyped
   {//GEN-HEADEREND:event_campoAnoLetivoKeyTyped
       if (!Character.isDigit(evt.getKeyChar())) {
           evt.setKeyChar('\0');
       } else {
           String textoCampo = campoAnoLetivo.getText();
           if (textoCampo.length() > 3) {
               evt.setKeyChar('\0');
           }
       }
   }//GEN-LAST:event_campoAnoLetivoKeyTyped

   private void listClassesPanelComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_listClassesPanelComponentShown
   {//GEN-HEADEREND:event_listClassesPanelComponentShown
       clearJTable(turmaAlunosTable, 2);
       clearJTable(alunosListaTurmaTable, 1);
       Professor tmpProf = Escola.getInstance().getLogado();
       
        int rowsTotalSize = tmpProf.getTurmas().size();
        if(rowsTotalSize > turmaAlunosTable.getRowCount()){
            DefaultTableModel model = (DefaultTableModel) turmaAlunosTable.getModel();
            model.setRowCount(rowsTotalSize);
        }
       
       int linha = 0;
       for (Turma turma : tmpProf.getTurmas()) {
           if (!turma.getId().equals("Sem Turma")) {
               turmaAlunosTable.setValueAt(turma, linha, 0);
               turmaAlunosTable.setValueAt(turma.getAlunosSize(), linha, 1);
               linha++;
           }
       }

   }//GEN-LAST:event_listClassesPanelComponentShown

   private void comboTurmaEditarTurmaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_comboTurmaEditarTurmaPopupMenuWillBecomeVisible
   {//GEN-HEADEREND:event_comboTurmaEditarTurmaPopupMenuWillBecomeVisible
       comboTurmaEditarTurma.removeAllItems();
       Professor tmpProf = Escola.getInstance().getLogado();
       //for (int i = 1; i < tmpProf.getTurmas().size(); i++) {
       for (Turma turma : tmpProf.getTurmas()) {
           if (!turma.getId().equals("Sem Turma")) {
               comboTurmaEditarTurma.addItem(turma);
           }
       }
   }//GEN-LAST:event_comboTurmaEditarTurmaPopupMenuWillBecomeVisible

   private void comboTurmaEditarTurmaItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_comboTurmaEditarTurmaItemStateChanged
   {//GEN-HEADEREND:event_comboTurmaEditarTurmaItemStateChanged
       Turma tmpTurma = (Turma) this.comboTurmaEditarTurma.getSelectedItem();

       if (tmpTurma == null) {
           limpaCamposEditarTurma();
           return;
       }

       campoAnoLetivoEditarTurma.setText(tmpTurma.getAno());
       ArrayList<Aluno> students = tmpTurma.buscaTodosAlunos();
       listaAlunosMatriculadosEdi.removeAllElements();
       for (int i = 0; i < students.size(); i++) {
           listaAlunosMatriculadosEdi.addElement(students.get(i));
       }

       listaAlunosSemTurma.removeAllElements();
       Professor tmpProf = Escola.getInstance().getLogado();
       //ArrayList<Turma> turmas = tmpProf.getTurmas();
       tmpTurma = tmpProf.getTurmaDefault();
       students = tmpTurma.buscaTodosAlunos();
       for (int i = 0; i < students.size(); i++) {
           listaAlunosSemTurma.addElement(students.get(i));
       }
   }//GEN-LAST:event_comboTurmaEditarTurmaItemStateChanged

   private void comboTurmaRemoverTurmaPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt)//GEN-FIRST:event_comboTurmaRemoverTurmaPopupMenuWillBecomeVisible
   {//GEN-HEADEREND:event_comboTurmaRemoverTurmaPopupMenuWillBecomeVisible
       comboTurmaRemoverTurma.removeAllItems();
       Professor tmpProf = Escola.getInstance().getLogado();

       for (Turma turma : tmpProf.getTurmas()) {
           if (!turma.getId().equals("Sem Turma")) {
               comboTurmaRemoverTurma.addItem(turma);
           }
       }

   }//GEN-LAST:event_comboTurmaRemoverTurmaPopupMenuWillBecomeVisible

    private void campoTurmaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTurmaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTurmaKeyTyped

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Professor tmpProf = Escola.getInstance().getLogado();
        erroslist = tmpProf.cadastrarTurma(getCampoTurma(), getCampoAnoLetivo());

        int error;
        if (erroslist.get(0).equals(0)) {
            labelTurma.setForeground(Color.black);
            labelAnoLetivo.setForeground(Color.black);
            Aluno tmpAluno;
            ArrayList<Turma> turmas = tmpProf.getTurmas();
            Turma semTurma = tmpProf.getTurmaDefault();
            Turma tmpTurma = turmas.get(turmas.size() - 1);
            for (int i = 0; i < listaAlunosMatriculadosCad.size(); i++) {
                tmpAluno = (Aluno) listaAlunosMatriculadosCad.get(i);
                if (tmpTurma.buscaAluno(tmpAluno) < 0) {
                    try {
                        semTurma.removeAluno(tmpAluno);
                        tmpTurma.inserirAluno(tmpAluno);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            /*for (int i = 0;i < listaAlunosSemTurmaCad.size(); i++) {
             tmpAluno = (Aluno) listaAlunosSemTurmaCad.get(i);
             if(semTurma.buscaAluno(tmpAluno) < 0){
             try {
             semTurma.inserirAluno(tmpAluno);
             } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
             }
             }
             }*/
            this.superPanel.getStudentPanel().clearEditStudent();
            limpaCamposCadastrarTurma();
            this.campoTurma.requestFocus();
            return;
        } else {
            for (int i = 0; i < erroslist.size(); i++) {
                error = erroslist.get(i);
                switch (error) {
                    case (1):
                        //erro cpf
                        labelTurma.setForeground(Color.red);
                        break;
                    case (2):
                        // error nome
                        labelTurma.setForeground(Color.red);
                        break;
                    case (3):
                        //error endereço
                        labelAnoLetivo.setForeground(Color.red);
                        break;
                }
            }
        }
        //JOptionPane.showMessageDialog(null, "Turma cadastrada com Sucesso", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    //quando fecha o programa aparece a turma que foi deletada denovo
    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        try {
            Turma turma = (Turma) this.comboTurmaRemoverTurma.getSelectedItem();
            Professor tmpProf = Escola.getInstance().getLogado();

            tmpProf.removeTurma(turma);

            clearAll();
            //JOptionPane.showMessageDialog(null, "Turma removida com Sucesso", "", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover turma", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void addToClassButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToClassButton2ActionPerformed
        try {
            Aluno tmpAluno = (Aluno) availableStudentList2.getSelectedValue();

            if (tmpAluno != null) {
                listaAlunosMatriculadosEdi.addElement(tmpAluno);
                listaAlunosSemTurma.removeElement(tmpAluno);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar aluno na turma", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addToClassButton2ActionPerformed

    private void removeStudentFromClassButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentFromClassButton2ActionPerformed
        try {
            Aluno tmpAluno = (Aluno) studentInClassList2.getSelectedValue();

            if (tmpAluno != null) {
                listaAlunosMatriculadosEdi.removeElement(tmpAluno);
                listaAlunosSemTurma.addElement(tmpAluno);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover aluno na turma", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeStudentFromClassButton2ActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Aluno tmpAluno;
        Turma tmpTurma = (Turma) comboTurmaEditarTurma.getSelectedItem();
        Professor tmpProf = Escola.getInstance().getLogado();
        ArrayList<Turma> turmas = tmpProf.getTurmas();
        Turma semTurma = tmpProf.getTurmaDefault();
        for (int i = 0; i < listaAlunosMatriculadosEdi.size(); i++) {
            tmpAluno = (Aluno) listaAlunosMatriculadosEdi.get(i);
            if (tmpTurma.buscaAluno(tmpAluno) < 0) {
                try {
                    semTurma.removeAluno(tmpAluno);
                    tmpTurma.inserirAluno(tmpAluno);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        for (int i = 0; i < listaAlunosSemTurma.size(); i++) {
            tmpAluno = (Aluno) listaAlunosSemTurma.get(i);
            if (semTurma.buscaAluno(tmpAluno) < 0) {
                try {
                    tmpTurma.removeAluno(tmpAluno);
                    semTurma.inserirAluno(tmpAluno);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        limpaCamposEditarTurma();
        superPanel.getStudentPanel().clearEditStudent();
        //JOptionPane.showMessageDialog(null, "Turma salva com Sucesso", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void addToClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToClassButtonActionPerformed
        try {
            Aluno tmpAluno = (Aluno) availableStudentList.getSelectedValue();

            if (tmpAluno != null) {
                listaAlunosMatriculadosCad.addElement(tmpAluno);
                listaAlunosSemTurmaCad.removeElement(tmpAluno);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar aluno na turma", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addToClassButtonActionPerformed

    private void removeStudentFromClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentFromClassButtonActionPerformed
        try {
            Aluno tmpAluno = (Aluno) studentInClassList.getSelectedValue();

            if (tmpAluno != null) {
                listaAlunosMatriculadosCad.removeElement(tmpAluno);
                listaAlunosSemTurmaCad.addElement(tmpAluno);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover aluno na turma", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeStudentFromClassButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        attListaAlunosCad();
        if(Escola.getInstance().getLogado() != null){
            this.campoTurma.requestFocus();
        }
    }//GEN-LAST:event_formComponentShown

    private void newClassPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newClassPanelComponentShown
        attListaAlunosCad();
        if(Escola.getInstance().getLogado() != null){
            this.campoTurma.requestFocus();
        }
    }//GEN-LAST:event_newClassPanelComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        classTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_formComponentHidden

    private void turmaAlunosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_turmaAlunosTableMouseClicked
        listaAlunos();
    }//GEN-LAST:event_turmaAlunosTableMouseClicked


    public void listaAlunos() {
        int secLinha = turmaAlunosTable.getSelectedRow();
        Turma selecTurma = (Turma) turmaAlunosTable.getValueAt(secLinha, 0);
        



        if (selecTurma != null) {
            
        int rowsTotalSize = selecTurma.getAlunosSize();
        if(rowsTotalSize > alunosListaTurmaTable.getRowCount()){
            DefaultTableModel model = (DefaultTableModel) alunosListaTurmaTable.getModel();
            model.setRowCount(rowsTotalSize);
        }
            
            clearJTable(alunosListaTurmaTable, 1);
            int linha = 0;
            for (Aluno aluno : selecTurma.buscaTodosAlunos()) {
                alunosListaTurmaTable.setValueAt(aluno, linha, 0);
                linha++;
            }
        }
    }

    private void attListaAlunosCad() {
        listaAlunosSemTurmaCad.removeAllElements();
        listaAlunosMatriculadosCad.removeAllElements();
        Professor tmpProf = Escola.getInstance().getLogado();
        if (tmpProf != null) {

            Turma tmpTurma = tmpProf.getTurmaDefault();

            ArrayList<Aluno> students = tmpTurma.buscaTodosAlunos();
            if (students != null) {
                for (int i = 0; i < students.size(); i++) {
                    listaAlunosSemTurmaCad.addElement(students.get(i));
                }
            }
        }
    }

    private void clearJTable(JTable jtable, int campos) {

        int i = 0;
        while (true) {
            if (jtable.getValueAt(i, 0) != null) {
                for (int j = 0; j < campos; j++) {
                    jtable.setValueAt(null, i, j);
                }
            } else {
                break;
            }
            i++;
        }
    }
    private ArrayList<Integer> erroslist;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToClassButton;
    private javax.swing.JButton addToClassButton2;
    private javax.swing.JTable alunosListaTurmaTable;
    private javax.swing.JList availableStudentList;
    private javax.swing.JList availableStudentList2;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JTextField campoAnoLetivo;
    private javax.swing.JTextField campoAnoLetivoEditarTurma;
    private javax.swing.JTextField campoTurma;
    private javax.swing.JTabbedPane classTabbedPane;
    private javax.swing.JComboBox comboTurmaEditarTurma;
    private javax.swing.JComboBox comboTurmaRemoverTurma;
    private javax.swing.JPanel deleteClassPanel;
    private javax.swing.JPanel editClassPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private static javax.swing.JLabel labelAnoLetivo;
    private javax.swing.JLabel labelAnoLetivoEditarTurma;
    private static javax.swing.JLabel labelTurma;
    private javax.swing.JLabel labelTurmaEditarTurma;
    private javax.swing.JLabel labelTurmaRemoverTurma;
    private javax.swing.JPanel listClassesPanel;
    private javax.swing.JPanel newClassPanel;
    private javax.swing.JButton removeStudentFromClassButton;
    private javax.swing.JButton removeStudentFromClassButton2;
    private javax.swing.JList studentInClassList;
    private javax.swing.JList studentInClassList2;
    private javax.swing.JTable turmaAlunosTable;
    // End of variables declaration//GEN-END:variables
    private static DefaultListModel listaAlunosMatriculadosCad;
    private static DefaultListModel listaAlunosSemTurma;
    private static DefaultListModel listaAlunosMatriculadosEdi;
    private static DefaultListModel listaListaDeTurmas;
    private static DefaultListModel listaAlunosSemTurmaCad;
    private static boolean alunoAdicionadoComboAluno;
    private static boolean alunoAdicionadoComboNomeDoAluno;
    private static boolean alunoAdicionadoComboAdicionarAluno;
    private static boolean turmaAdicionada;
    private static boolean turmaAdicionadaComboTurmaEditarTurmas;
    private static boolean turmaAdicionadaComboTurma;
    private static int numeroDeTurmasAdicionadasComboTurma = 0;
    private static int numeroDeTurmasAdicionadasComboTurmaEditarTurmas = 0;
    private static int numeroDeTurmasAdicionadas = 0;
    private static int numeroDeAlunosAdicionadosComboAluno = 0;
    private static int numeroDeAlunosAdicionadosComboNomeDoAluno = 0;
    private static int numeroDeAlunosAdicionadosComboAdicionarAluno = 0;

    public static boolean isTurmaAdicionadaComboTurma() {
        return turmaAdicionadaComboTurma;
    }

    public static void setTurmaAdicionadaComboTurma(boolean turmaAdicionadaComboTurma) {
        ClassPanel.turmaAdicionadaComboTurma = turmaAdicionadaComboTurma;
    }

    public static int getNumeroDeTurmasAdicionadasComboTurma() {
        return numeroDeTurmasAdicionadasComboTurma;
    }

    public static void setNumeroDeTurmasAdicionadasComboTurma(int numeroDeTurmasAdicionadasComboTurma) {
        ClassPanel.numeroDeTurmasAdicionadasComboTurma = numeroDeTurmasAdicionadasComboTurma;
    }

    public static boolean isTurmaAdicionadaComboTurmaEditarTurmas() {
        return turmaAdicionadaComboTurmaEditarTurmas;
    }

    public static void setTurmaAdicionadaComboTurmaEditarTurmas(boolean turmaAdicionadaEditarTurmas) {
        ClassPanel.turmaAdicionadaComboTurmaEditarTurmas = turmaAdicionadaEditarTurmas;
    }

    public static int getNumeroDeTurmasAdicionadasComboTurmaEditarTurmas() {
        return numeroDeTurmasAdicionadasComboTurmaEditarTurmas;
    }

    public static void setNumeroDeTurmasAdicionadasComboTurmaEditarTurmas(int numeroDeTurmasAdicionadasEditarTurmas) {
        ClassPanel.numeroDeTurmasAdicionadasComboTurmaEditarTurmas = numeroDeTurmasAdicionadasEditarTurmas;
    }

    public static boolean isTurmaAdicionada() {
        return turmaAdicionada;
    }

    public static void setTurmaAdicionada(boolean turmaAdicionada) {
        ClassPanel.turmaAdicionada = turmaAdicionada;
    }

    public static int getNumeroDeTurmasAdicionadas() {
        return numeroDeTurmasAdicionadas;
    }

    public static void setNumeroDeTurmasAdicionadas(int numeroDeTurmasAdicionadas) {
        ClassPanel.numeroDeTurmasAdicionadas = numeroDeTurmasAdicionadas;
    }

    public static int getNumeroDeAlunosAdicionadosComboAluno() {
        return numeroDeAlunosAdicionadosComboAluno;
    }

    public static void setNumeroDeAlunosAdicionadosComboAluno(int numeroDeAlunosAdicionadosComboStudent) {
        ClassPanel.numeroDeAlunosAdicionadosComboAluno = numeroDeAlunosAdicionadosComboStudent;
    }

    public static int getNumeroDeAlunosAdicionadosComboNomeDoAluno() {
        return numeroDeAlunosAdicionadosComboNomeDoAluno;
    }

    public static void setNumeroDeAlunosAdicionadosComboNomeDoAluno(int numeroDeAlunosAdicionadosComboStudentName) {
        ClassPanel.numeroDeAlunosAdicionadosComboNomeDoAluno = numeroDeAlunosAdicionadosComboStudentName;
    }

    public static int getNumeroDeAlunosAdicionadosComboAdicionarAluno() {
        return numeroDeAlunosAdicionadosComboAdicionarAluno;
    }

    public static void setNumeroDeAlunosAdicionadosComboAdicionarAluno(int numeroDeAlunosAdicionadosComboAddStudent) {
        ClassPanel.numeroDeAlunosAdicionadosComboAdicionarAluno = numeroDeAlunosAdicionadosComboAddStudent;
    }

    public static boolean isStudentAddedComboAluno() {
        return alunoAdicionadoComboAluno;
    }

    public static boolean isStudentAddedComboNomeDoAluno() {
        return alunoAdicionadoComboNomeDoAluno;
    }

    public static boolean isStudentAddedComboAdicionarAluno() {
        return alunoAdicionadoComboAdicionarAluno;
    }

    public static void setStudentAddedCombonomeDoAluno(boolean studentAddedComboStudentName) {
        ClassPanel.alunoAdicionadoComboNomeDoAluno = studentAddedComboStudentName;
    }

    public static void setStudentAddedComboAdicionarAluno(boolean studentAddedComboAddStudent) {
        ClassPanel.alunoAdicionadoComboAdicionarAluno = studentAddedComboAddStudent;
    }

    public static void setStudentAddedComboAluno(boolean studentAdded) {
        ClassPanel.alunoAdicionadoComboAluno = studentAdded;
    }

    public String getCampoTurma() {
        return campoTurma.getText();
    }

    public static String getCampoAnoLetivo() {
        return campoAnoLetivo.getText();
    }

    public void limpaCamposEditarTurma() {
        campoAnoLetivoEditarTurma.setText("");
        comboTurmaEditarTurma.removeAllItems();
        listaAlunosMatriculadosEdi.removeAllElements();
        listaAlunosSemTurma.removeAllElements();
    }

    public void limpaCamposCadastrarTurma() {
        campoTurma.setText("");
        campoAnoLetivo.setText("");
        listaAlunosMatriculadosCad.removeAllElements();
        listaAlunosSemTurma.removeAllElements();
    }

    public void limpaCamposListaTurma() {
        listaListaDeTurmas.clear();
    }

    public void limpaCamposRemoverTurma() {
        comboTurmaRemoverTurma.removeAllItems();
    }

    public void clearAll() {
        this.limpaCamposCadastrarTurma();
        this.limpaCamposEditarTurma();
        //11this.limpaCamposListaTurma();
        this.limpaCamposRemoverTurma();
        this.classTabbedPane.setSelectedIndex(0);
    }

    
    /* Metodo para fazer a troca de informações no Jtable
     * quando trocado utilizando direcionais do teclado.
     */
    class SharedListSelectionHandler implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            listaAlunos();
        }
    }
}
