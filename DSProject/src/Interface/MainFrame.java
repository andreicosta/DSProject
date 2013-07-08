package Interface;

import dsproject.Escola;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        try {
            initComponents();
            Escola escola = Escola.getInstance();
            escola.carregar();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        loginJPanel1 = new Interface.LoginJPanel(mainPanel,this);
        mainPanel1 = new Interface.MainPanel(mainPanel);
        newTeacherPanel1 = new Interface.NewTeacherPanel(mainPanel);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ProDown");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(loginJPanel1, "cardLogin");
        mainPanel.add(mainPanel1, "cardMain");
        mainPanel.add(newTeacherPanel1, "cardNewTeacher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
   {//GEN-HEADEREND:event_formWindowClosing
       if (evt.getID() == 201) {
           int x;
           x = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que quer fechar o programa? ");
           if (x == 0) {
               Escola escola = Escola.getInstance();
               try {
                   escola.salvarContadores();
               } catch (IOException ex) {
                   System.err.println(ex);
               }
               System.exit(x);
               /*File arquivoAlunos = new File("alunos.txt");
                File arquivoTurmas = new File("turmas.txt");
                FileInputStream arquivoDasTurmas;
                ObjectInputStream inTurmas;
                ObjectOutputStream outTurmas;
                FileInputStream arquivoDosAlunos;
                ObjectInputStream inAlunos;
                ObjectOutputStream outAlunos;
            
                if(arquivoTurmas.exists())
                {
                if(!arquivoTurmas.canWrite())
                arquivoTurmas.setWritable(true);
                try
                {
                arquivoDasTurmas = new FileInputStream(arquivoTurmas);
                inTurmas = new ObjectInputStream(arquivoDasTurmas);
                outTurmas = new ObjectOutputStream(new FileOutputStream("turmas.txt"));
                outTurmas.writeObject(MainPanel.turmasLidas);
                outTurmas.close();
                  
                //arquivo pode ser lido
                arquivoTurmas.setReadable(true);
                if(arquivoTurmas.canWrite())
                {
                //arquivo nao pode ser escrito por ninguém nem pelo seu próprio dono
                arquivoTurmas.setWritable(false, false);
                }
                }
                catch (IOException ex)
                {
                System.err.println(ex);
                }
                }
                else
                {
                try
                {
                outTurmas = new ObjectOutputStream(new FileOutputStream("turmas.txt"));
                outTurmas.writeObject(MainPanel.turmasLidas);                  
                outTurmas.close();
                }
                catch (IOException ex)
                {
                System.err.println(ex);
                }
                //arquivo pode ser lido
                arquivoTurmas.setReadable(true);
                if(arquivoTurmas.canWrite())
                {
                //arquivo nao pode ser escrito por ninguém nem pelo seu próprio dono
                arquivoTurmas.setWritable(false, false);
                }
                }
            
                if(arquivoAlunos.exists())
                {
                if(!arquivoAlunos.canWrite())
                arquivoAlunos.setWritable(true);
                try
                {
                arquivoDosAlunos = new FileInputStream(arquivoAlunos);
                inAlunos = new ObjectInputStream(arquivoDosAlunos);
                outAlunos = new ObjectOutputStream(new FileOutputStream("alunos.txt"));
                outAlunos.writeObject(MainPanel.alunosLidos);
                outAlunos.close();
                //arquivo pode ser lido
                arquivoAlunos.setReadable(true);
                if(arquivoAlunos.canWrite())
                {
                //arquivo nao pode ser escrito por ninguém nem pelo seu próprio dono
                arquivoAlunos.setWritable(false, false);
                }
                }
                catch (IOException ex)
                {
                System.err.println(ex);
                }
                }
                else
                {
                try
                {
                outAlunos = new ObjectOutputStream(new FileOutputStream("alunos.txt"));
                outAlunos.writeObject(MainPanel.alunosLidos);
                outAlunos.close();
                }
                catch (IOException ex)
                {
                System.err.println(ex);
                }
                //arquivo pode ser lido
                arquivoAlunos.setReadable(true);
                if(arquivoAlunos.canWrite())
                {
                //arquivo nao pode ser escrito por ninguém nem pelo seu próprio dono
                arquivoAlunos.setWritable(false, false);
                }
                }*/
           }
       }
   }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Interface.LoginJPanel loginJPanel1;
    private javax.swing.JPanel mainPanel;
    private Interface.MainPanel mainPanel1;
    private Interface.NewTeacherPanel newTeacherPanel1;
    // End of variables declaration//GEN-END:variables

    public MainPanel getMainPanel1() {
        return this.mainPanel1;
    }
    
    public NewTeacherPanel getNewTeacherPanel1() {
        return this.newTeacherPanel1;
    }
    
}
