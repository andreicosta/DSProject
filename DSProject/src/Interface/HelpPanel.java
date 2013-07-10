package Interface;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class HelpPanel extends javax.swing.JPanel {

    private int figuraAluno = 1;
    private int figuraTurma = 1;
    private int figuraAval = 1;
    private int figuraImpExp = 1;
    
    private String pathAluno;
    private String pathTurma;
    private String pathAval;
    private String pathImpExp;
    
    private String[] defAluno = {"<html><center><b>Cadastrar Aluno</b><br>Esta parte do programa é responsável pelo cadastro de novos alunos.<br></center></html>",
                                 "<html><center><b>Nome Completo</b><br>Insira o nome completo do aluno.<br> Este campo é obrigatório.</center></html>",
                                 "<html><center><b>Selecionar Turma</b><br> É possível selecionar a opção <i>Sem Turma</i>, caso a turma do aluno ainda não tenha sido cadastrada. É possivel adicionar a turma ao aluno após o cadastro, editando as informações do mesmo. Caso a turma do aluno já esteja criada, basta selecionar a turma para que o aluno seja adicionado à mesma. Este campo é obrigatório.</center></html>",
                                 "<html><center><b>Data de Nascimento</b><br> É possível cadastrar somente alunos com idade entre 10 e 20 anos.<br> Este campo é obrigatório.<html><center>",
                                 "<html><center><b>Gênero</b><br>Selecione o gênero do aluno.<br>Este campo é obrigatório.</center></html>",
                                 "<html><center><b>Endereço</b><br>Insira o endereço do aluno. Utilize o padrão <i>Rua</i> ou <i>Avenida</i><br> seguido pelo <i>Nome Completo da Rua</i> por extenso, <i>Numero</i>,<i> Bairro</i>.<br> Este campo é obrigatório.</center></html>",
                                 "<html><center><b>Cidade/Estado</b<br>Insira a cidade e o estado onde mora o aluno.<br>Este campo é obrigatório.</center></html>",
                                 "<html><center><b>Nome Completo da Mae</b><br>Insira o nome completo da mãe do aluno.<br>Este campo é obrigatório.</center></html>",
                                 "<html><center><b>Nome Completo do Pai</b><br>Insira o nome completo do pai.<br> Este campo é opcional.</center></html>",
                                 "<html><center><b>Telefone, Celular e E-mail</b><br>Insira o telefone e/ou o celular do aluno, <br>separando os quatro primeiros números dos demais com um traço (-).<br> Insira o e-mail do aluno.<br> Estes campos são opcionais.</center></html>",
                                 "<html><center><b>Efetivar o Cadastro</b><br>Clique no botão <i>Cadastrar</i> para finalizar o cadastro do aluno.</center></html>",
                                 "<html><center><b>Editar Cadastro do Aluno</b><br>Esta parte do programa permite a modificação de algumas informações do aluno.</center></html>",
                                 "<html><center><b>Selecionar Aluno</b><br>Selecione o aluno do qual deseja modificar alguma informação.</center></html>",
                                 "<html><center><b>Campos para Edição</b><br>Após selecionar o aluno, suas informações aparecerão automaticamente nos campos em branco.</center></html>",
                                 "<html><center><b>Salvar Modificações</b><br>Após concluir as alterações desejadas, <br>clique no botão <i>Salvar</i> para armazenar as novas informações.</center></html>",                              
                                 "<html><center><b>Excluir Cadastro do Aluno</b><br>Para ocasiões em que alguma informação que não pode ser editada esta errada, ou no termino da participação do aluno nas atividades, <br> é possivel remover o cadastro do mesmo.</center></html>",
                                 "<html><center><b>Selecionar Aluno</b><br>Selecione o aluno que deseja remover. Todas as informações referentes aquele aluno serão apagadas.</center></html>",
                                 "<html><center><b>Excluir</b><br>Clique no botão <i>Excluir</i> para executar a remoção do aluno e suas informações.</center></html>"
    };
    private String[] defTurma = {"<html><center><b>Cadastrar Turma</b><br>Nesta parte do sistema são cadastradas as turmas. As turmas são importantes para a organização dos relatorios de atividade e controle do progresso dos alunos.</center></html>",
                                 "<html><center><b>Turma</b><br>Entre com a identificação da turma.</center></html>",
                                 "<html><center><b>Ano Letivo</b><br>Entre com o ano letivo corrente.</center></html>",
                                 "<html><center><b>Listas</b><br>Existem duas lista na parte de <i>Turmas</i>, a dos <i>Alunos</i> e a de <i>Alunos na Turma</i>.<br> A primeira contem os alunos cadastrados que ainda não possuem uma turma.<br> A segunda lista possui os alunos já cadastrados na turma em questão.</center></html>",
                                 "<html><center><b>Adicionar Aluno</b><br>Selecione um aluno da primeira lista. <br>Após isso, clique no botão <i>Adicionar</i> para cadastrar o aluno na turma em questão</center></html>",
                                 "<html><center><b>Remover Aluno</b><br>Selecione um aluno da segunda lista. <br>Após isso, clique no botão <i>Remover</i> para remover o cadastro do aluno da turma em questão</center></html>",
                                 "<html><center><b>Concluir o Cadastro</b><br>Após todos os alunos da turma estarem devidamente cadastrados,<br> clique no botão <i>Cadastrar</i> para criar a turma.</center></html>",
                                 "<html><center><b>Lista de Turmas</b><br>Esta parte do programa exibe duas tabelas.<br> A primeira tabela contem todas as turmas cadastradas no nome do professor utilizando o programa e o numero de alunos em cada turma.<br> A segunda exibe, após selecionar uma das turmas, os alunos cadastrados na mesma.</center></html>",
                                 "<html><center><b>Selecionar Turma</b><br>Clique em uma das turmas para ter acesso a lista de alunos cadastrados na mesma.</center></html>",
                                 "<html><center><b>Editar Turma</b><br>É possivel editar os alunos de uma turma, podendo assim adicionar ou remover alunos. Não é possivel alterar o nome ou o ano letivo da turma.</center></html>",
                                 "<html><center><b>Adicionar/Remover Alunos</b><br>Funcões de adicionar e remover aluno na mesma forma da parte de cadastro. Após as mudanças, clique no botão <i>Salvar</i>.</center></html>",
                                 "<html><center><b>Selecionar Turma para Remoção</b><br>É possivel remover turmas da sua lista de turmas.</center></html>",
                                 "<html><center><b>Removendo uma Turma</b><br>Com a turma selecionada, clique no botão <i>Remover</i> para retirar a turma de sua lista.</center></html>"
    };
    private String[] defAval = {"<html><center><b>Nova avaliação/Editar Avaliação</b><br>Nesta parte do programa são criadas e editadas as avaliações dos alunos. Basta selecionar uma turma, selecionar individualmente os alunos e preencher o formulario. Caso o aluno não tenho realizado algum teste, deixe o campo em branco.<br> Caso o aluno não tenha realizado nenhuma atividade, podesse criar uma avaliação totalmente em branco ou não criar a avaliação.</center></html>",
                                "<html><center><b>Selecionar Turma</b><br>Selecione a turma para criar avaliações para os alunos matriculados na mesma.</center></html>",
                                "<html><center><b>Selecionar Aluno</b><br>Selecione um dos alunos para criar sua respectiva avaliação.</center></html>",
                                "<html><center><b>Data da Avaliação</b><br>Selecione a data em que a avaliação foi realizada</center></html>",
                                "<html><center><b>Horário da Avaliação</b><br>Entre com o horario em que a avaliação teve inicio</center></html>",
                                "<html><center><b>Temperadura na hora da Avaliação</b><br>Entre com a temperatura referente a hora da avaliação.</center></html>",
                                "<html><center><b>Massa Corporal</b><br>Entre com o peso do aluno</center></html>",
                                "<html><center><b>Estatura e IMC</b><br>Entre com a altura do aluno.<br> Após preencher estes dois campos (massa e estatura) o campo IMC será automaticamente preenchido.</center></html>",
                                "<html><center><b>Envergadura</b><br>Entre com a envergadura (distância da ponta de uma das mãos até a outra com os braços esticados horizontalmente) do aluno</center></html>",
                                "<html><center><b>Abdominal</b><br>Entre com o numero de abdominais realizadas pelo aluno.</center></html>",
                                "<html><center><b>Sentar e Alcançar</b><br>Entre com a distância alcançada pelo aluno. Marque também se o teste foi realizado com ou sem o uso de banco.</center></html>",
                                "<html><center><b>Corrida</b><br>Entre com a distância percorrida pelo aluno. Marque também a duração da corrida <br>(6 ou 9 minutos)</center></html>",
                                "<html><center><b>Desempenho Motor</b><br>Entre com as informações referentes ao desempenho motor do aluno.</center></html>",
                                "<html><center><b>Salvar Avaliação</b><br>Clique no botão <i>Salvar</i> para salvar formularios de avaliação incompletos. As avaliações podem ser retomadas a qualquer momento (enquanto em aberto), sendo necessario apenas a seleção da turma e do aluno.</center></html>",
                                "<html><center><b>Avaliação Finalizada</b><br>Quando o formulario estiver completamente preenchido, marque a opção <i>Avaliação Finalizada</i> e clique no botão <i>Salvar</i>. Com isso, a avaliação será adicionada ao <i>Controle de Avaliações</i>. A avaliação ainda pode ser editada.</center></html>",
                                "<html><center><b>Controle de Avaliações</b><br>Tabela contendo as avaliações salvas como finalizadas. São informados a turma, data da avaliação, e quantas avaliações ja foram marcadas como <i>Finalizadas</i></center></html>",
                                "<html><center><b>Gerar Arquivo para Envio</b><br>Após salvar todas as avaliações realizadas pela turma em um determinado dia, é preciso gerar um arquivo que será enviado para o bando de dados central atraves do portal do PRODOWN. Só sera permitido começar uma nova avaliação quando todas as anteriores estiverem prontas para enviar. Após gerado o arquivo, as avaliações não podem mais ser acessadas ou editadas.</center></html>"
    };
    private String[] defImpExp = {"<html><center><b>Importar</b><br>Clique no botão <i>Importar</i> para abrir a janela de seleção de arquivo.</center></html>",
                                  "<html><center><b>Abrir arquivo</b><br>Selecione o arquivo EPD e clique no botão <i>Abrir</i> para carregar o arquivo. Arquivos EPD são gerados previamente a partir da parte de exportação deste programa. <br> Os dados atuais serão apagados e substituidos pelos dados do arquivo importado.</center></html>",
                                  "<html><center><b>Exportar</b><br>Clique no botão <i>Exportar</i> para gerar um arquivo contendo uma copia de todos os dados atuais (turmas, alunos e avaliações).<br> Esses dados podem ser carregados em outro computador que também possua este programa.</center></html>"
    };
            
    public HelpPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        helpStudentPanel = new javax.swing.JPanel();
        try{
            BufferedImage ajudaUm = ImageIO.read(new File("images/ajuda/aluno/aluno1.png"));
            labelAluno = new javax.swing.JLabel(new ImageIcon(ajudaUm));
            definicaoAluno = new javax.swing.JLabel();
            anteriorAluno = new javax.swing.JButton();
            proximoAluno = new javax.swing.JButton();
            contAluno = new javax.swing.JLabel();
            helpClassPanel = new javax.swing.JPanel();
            try{
                BufferedImage ajudaQuinta = ImageIO.read(new File("images/ajuda/turma/turma1.png"));
                labelTurma = new javax.swing.JLabel(new ImageIcon(ajudaQuinta));
                anteriorTurma = new javax.swing.JButton();
                definicaoTurma = new javax.swing.JLabel();
                proximoTurma = new javax.swing.JButton();
                contTurma = new javax.swing.JLabel();
                helpTestPanel = new javax.swing.JPanel();
                try{
                    BufferedImage ajudaDois = ImageIO.read(new File("images/ajuda/avaliacoes/aval1.png"));
                    labelAval = new javax.swing.JLabel(new ImageIcon(ajudaDois));
                    anteriorAval = new javax.swing.JButton();
                    definicaoAval = new javax.swing.JLabel();
                    proximoAval = new javax.swing.JButton();
                    contAval = new javax.swing.JLabel();
                    helpImpExpPanel = new javax.swing.JPanel();
                    try{
                        BufferedImage ajudaQuatro = ImageIO.read(new File("images/ajuda/importarExportar/impexp1.png"));
                        labelImpExp = new javax.swing.JLabel(new ImageIcon(ajudaQuatro));
                        anteriorImpExp = new javax.swing.JButton();
                        definicaoImpExp = new javax.swing.JLabel();
                        proximoImpExp = new javax.swing.JButton();
                        contImpExp = new javax.swing.JLabel();
                        helpSendPanel = new javax.swing.JPanel();
                        try{
                            BufferedImage ajudaTres = ImageIO.read(new File("images/ajuda/enviar/enviar1.png"));
                            labelEnviar = new javax.swing.JLabel(new ImageIcon(ajudaTres));
                            definicaoEnviar = new javax.swing.JLabel();

                            setMinimumSize(new java.awt.Dimension(833, 515));

                            helpStudentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            /*
                            */
                        }catch(Exception e){
                            labelAluno.setText("");
                        }
                        helpStudentPanel.add(labelAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 370));

                        definicaoAluno.setBackground(new java.awt.Color(204, 204, 255));
                        definicaoAluno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                        definicaoAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        definicaoAluno.setText("<html><center><b>Cadastrar Aluno</b><br>Esta parte do programa é responsável pelo cadastro de novos alunos.<br></center></html>");
                        helpStudentPanel.add(definicaoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 520, 90));

                        anteriorAluno.setText("Passo Anterior");
                        anteriorAluno.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                anteriorAlunoActionPerformed(evt);
                            }
                        });
                        helpStudentPanel.add(anteriorAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 433, -1, 30));

                        proximoAluno.setText("Proximo Passo");
                        proximoAluno.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                proximoAlunoActionPerformed(evt);
                            }
                        });
                        helpStudentPanel.add(proximoAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 433, -1, 30));

                        contAluno.setText("1 / 18");
                        helpStudentPanel.add(contAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

                        jTabbedPane1.addTab("Aluno", helpStudentPanel);

                        helpClassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        /*
                        */
                    }catch(Exception e){
                        labelAluno.setText("");
                    }
                    helpClassPanel.add(labelTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 370));

                    anteriorTurma.setText("Passo Anterior");
                    anteriorTurma.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            anteriorTurmaActionPerformed(evt);
                        }
                    });
                    helpClassPanel.add(anteriorTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 433, -1, 30));

                    definicaoTurma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                    definicaoTurma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    definicaoTurma.setText("<html><center><b>Cadastrar Turma</b><br>Nesta parte do sistem são cadastradas as turmas. As turmas são importantes para a organização dos relatorios de atividade e controle do progresso dos alunos.</center></html>");
                    definicaoTurma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    helpClassPanel.add(definicaoTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 520, 90));

                    proximoTurma.setText("Proximo Passo");
                    proximoTurma.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            proximoTurmaActionPerformed(evt);
                        }
                    });
                    helpClassPanel.add(proximoTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 433, -1, 30));

                    contTurma.setText("1 / 13");
                    helpClassPanel.add(contTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

                    jTabbedPane1.addTab("Turma", helpClassPanel);

                    helpTestPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    /*
                    */
                }catch(Exception e){
                    labelAluno.setText("");
                }
                helpTestPanel.add(labelAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 370));

                anteriorAval.setText("Passo Anterior");
                anteriorAval.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        anteriorAvalActionPerformed(evt);
                    }
                });
                helpTestPanel.add(anteriorAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 433, -1, 30));

                definicaoAval.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                definicaoAval.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                definicaoAval.setText("<html><center><b>Nova avaliação/Editar Avaliação</b><br>Nesta parte do programa são criadas e editas as avaliações dos alunos. Basta selecionar uma turma, selecionar individualmente os alunos e preencher o formulario. Caso o aluno não tenho realizado algum teste, deixe o campo em branco.<br> Caso o aluno não tenha realizado nenhuma atividade, podesse criar uma avaliação totalmente em branco ou não criar a avaliação.</center></html>");
                definicaoAval.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                helpTestPanel.add(definicaoAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 520, 90));

                proximoAval.setText("Proximo Passo");
                proximoAval.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        proximoAvalActionPerformed(evt);
                    }
                });
                helpTestPanel.add(proximoAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 433, -1, 30));

                contAval.setText("1 / 17");
                helpTestPanel.add(contAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

                jTabbedPane1.addTab("Avaliações", helpTestPanel);

                helpImpExpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                /*
                */
            }catch(Exception e){
                labelAluno.setText("");
            }
            helpImpExpPanel.add(labelImpExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 370));

            anteriorImpExp.setText("Passo Anterior");
            anteriorImpExp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    anteriorImpExpActionPerformed(evt);
                }
            });
            helpImpExpPanel.add(anteriorImpExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 433, -1, 30));

            definicaoImpExp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            definicaoImpExp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            definicaoImpExp.setText("<html><center><b>Importar</b><br>Clique no botão <i>Importar</i> para abrir a janela de seleção de arquivo.</center></html>");
            definicaoImpExp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            helpImpExpPanel.add(definicaoImpExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 520, 90));

            proximoImpExp.setText("Proximo Passo");
            proximoImpExp.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    proximoImpExpActionPerformed(evt);
                }
            });
            helpImpExpPanel.add(proximoImpExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 433, -1, 30));

            contImpExp.setText("1 / 3");
            helpImpExpPanel.add(contImpExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

            jTabbedPane1.addTab("Importar/Exportar", helpImpExpPanel);

            helpSendPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            /*
            */
        }catch(Exception e){
            labelAluno.setText("");
        }
        helpSendPanel.add(labelEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 370));

        definicaoEnviar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        definicaoEnviar.setText("<html><center><b>Enviar</b><br>Clique no botão <i>Enviar</i> para ser redirecionado diretamente ao site do projeto Prodown para enviar as avaliações realizadas. <br> Esta função irá facilitar e agilizar a continuidade do processo.</center></html>");
        definicaoEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        helpSendPanel.add(definicaoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 520, 90));

        jTabbedPane1.addTab("Enviar", helpSendPanel);

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

    private void anteriorAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorAlunoActionPerformed
        
        if(figuraAluno > 1 && figuraAluno <= 18){
            figuraAluno--;
            contAluno.setText(figuraAluno + " / 18");
            definicaoAluno.setText(defAluno[figuraAluno - 1]);
            pathAluno = "aluno" + figuraAluno + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/aluno/" + pathAluno));
                labelAluno.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_anteriorAlunoActionPerformed
        
    private void proximoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoAlunoActionPerformed
        
        if(figuraAluno >= 1 && figuraAluno < 18){
            figuraAluno++;
            contAluno.setText(figuraAluno + " / 18");
            definicaoAluno.setText(defAluno[figuraAluno - 1]);
            pathAluno = "aluno" + figuraAluno + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/aluno/" + pathAluno));
                labelAluno.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_proximoAlunoActionPerformed

    private void anteriorAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorAvalActionPerformed
        
        if(figuraAval > 1 && figuraAval <= 17){
            figuraAval--;
            contAval.setText(figuraAval + " / 17");
            definicaoAval.setText(defAval[figuraAval - 1]);
            pathAval = "aval" + figuraAval + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/avaliacoes/" + pathAval));
                labelAval.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_anteriorAvalActionPerformed

    private void proximoAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoAvalActionPerformed
        
        if(figuraAval >= 1 && figuraAval < 17){
            figuraAval++;
            contAval.setText(figuraAval + " / 17");
            definicaoAval.setText(defAval[figuraAval - 1]);
            pathAval = "aval" + figuraAval + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/avaliacoes/" + pathAval));
                labelAval.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_proximoAvalActionPerformed

    private void anteriorImpExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorImpExpActionPerformed
        
        if(figuraImpExp > 1 && figuraImpExp <= 3){
            figuraImpExp--;
            contImpExp.setText(figuraImpExp + " / 3");
            definicaoImpExp.setText(defImpExp[figuraImpExp - 1]);
            pathImpExp = "impexp" + figuraImpExp + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/importarExportar/" + pathImpExp));
                labelImpExp.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_anteriorImpExpActionPerformed

    private void proximoImpExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoImpExpActionPerformed
       
        if(figuraImpExp >= 1 && figuraImpExp < 3){
            figuraImpExp++;
            contImpExp.setText(figuraImpExp + " / 3");
            definicaoImpExp.setText(defImpExp[figuraImpExp - 1]);
            pathImpExp = "impexp" + figuraImpExp + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/importarExportar/" + pathImpExp));
                labelImpExp.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_proximoImpExpActionPerformed

    private void anteriorTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorTurmaActionPerformed
        
        if(figuraTurma > 1 && figuraTurma <= 13){
            figuraTurma--;
            contTurma.setText(figuraTurma + " / 13");
            definicaoTurma.setText(defTurma[figuraTurma - 1]);
            pathTurma = "turma" + figuraTurma + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/turma/" + pathTurma));
                labelTurma.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_anteriorTurmaActionPerformed

    private void proximoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoTurmaActionPerformed
        
        if(figuraTurma >= 1 && figuraTurma < 13){
            figuraTurma++;
            contTurma.setText(figuraTurma + " / 13");
            definicaoTurma.setText(defTurma[figuraTurma - 1]);
            pathTurma = "turma" + figuraTurma + ".png";
            try {
                BufferedImage importImg = ImageIO.read(new File("images/ajuda/turma/" + pathTurma));
                labelTurma.setIcon(new ImageIcon(importImg));
            } catch (IOException ex) {
                Logger.getLogger(ImportPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_proximoTurmaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorAluno;
    private javax.swing.JButton anteriorAval;
    private javax.swing.JButton anteriorImpExp;
    private javax.swing.JButton anteriorTurma;
    private javax.swing.JLabel contAluno;
    private javax.swing.JLabel contAval;
    private javax.swing.JLabel contImpExp;
    private javax.swing.JLabel contTurma;
    private javax.swing.JLabel definicaoAluno;
    private javax.swing.JLabel definicaoAval;
    private javax.swing.JLabel definicaoEnviar;
    private javax.swing.JLabel definicaoImpExp;
    private javax.swing.JLabel definicaoTurma;
    private javax.swing.JPanel helpClassPanel;
    private javax.swing.JPanel helpImpExpPanel;
    private javax.swing.JPanel helpSendPanel;
    private javax.swing.JPanel helpStudentPanel;
    private javax.swing.JPanel helpTestPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelAluno;
    private javax.swing.JLabel labelAval;
    private javax.swing.JLabel labelEnviar;
    private javax.swing.JLabel labelImpExp;
    private javax.swing.JLabel labelTurma;
    private javax.swing.JButton proximoAluno;
    private javax.swing.JButton proximoAval;
    private javax.swing.JButton proximoImpExp;
    private javax.swing.JButton proximoTurma;
    // End of variables declaration//GEN-END:variables
}
