package Interface;

import dsproject.Escola;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImportPanel extends javax.swing.JPanel {

    public ImportPanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        importPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        try{
            BufferedImage importImg = ImageIO.read(new File("images/exportaEimportar.png"));
            jLabel3 = new javax.swing.JLabel(new ImageIcon(importImg));
            exportPanel = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();
            try{
                BufferedImage exportImg = ImageIO.read(new File("images/exportaEimportar.png"));
                jLabel4 = new javax.swing.JLabel(new ImageIcon(exportImg));

                setMinimumSize(new java.awt.Dimension(833, 515));
                setPreferredSize(new java.awt.Dimension(833, 515));

                importPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setText("<html>A parte de importação, recebe um arquivo previamente exportado, apaga os dados atuais e carrega os dados salvos neste arquivo. </html>");
                importPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 807, 54));

                jButton1.setText("Importar");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
                importPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

                /*
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText(null);
                */
            }catch(Exception e){
                jLabel1.setText("");
            }
            importPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 995, 240));

            jTabbedPane1.addTab("Importar ", importPanel);

            exportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel2.setText("<html>A parte de exportação,  gera um arquivo com uma copia de todos os dados atuais (turmas, alunos e avaliações). </html>");
            exportPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 807, 54));

            jButton2.setText("Exportar");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
            exportPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

            /*
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText(null);
            */
        }catch(Exception e){
            jLabel1.setText("");
        }
        exportPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 995, 240));

        jTabbedPane1.addTab("Exportar", exportPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UIManager.put("FileChooser.openButtonText", "Abrir"); 
        
        File file;
        JFileChooser arquivo = new JFileChooser();    
        
        arquivo.setDialogTitle("Selecione um arquivo para importar");    
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);    
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDO Files", new String[]{"pdo"});    
        arquivo.setFileFilter(filter);          
        arquivo.setAcceptAllFileFilterUsed(false);  
        arquivo.setMultiSelectionEnabled(false); 
        arquivo.setPreferredSize( new Dimension(600, 400) );
        int option = arquivo.showOpenDialog(this); 
        
        if(option == JFileChooser.APPROVE_OPTION) {  
              file = arquivo.getSelectedFile();  
              String nomeArquivo = file.getName();  
              int e = nomeArquivo.lastIndexOf(".");  
              String extensao = nomeArquivo.substring(e);  
                
              if(extensao.equals(".pdo")){
                  Escola.getInstance().importar(file.getAbsolutePath());
              }  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UIManager.put("FileChooser.openButtonText", "Salvar"); 
        
        File file;
        JFileChooser arquivo = new JFileChooser();
        
        arquivo.setDialogTitle("Selecione o local para exportar o arquivo");    
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);    
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDO Files", new String[]{"pdo"});    
        arquivo.setFileFilter(filter);          
        arquivo.setAcceptAllFileFilterUsed(false);  
        arquivo.setMultiSelectionEnabled(false); 
        arquivo.setPreferredSize( new Dimension(600, 400) );
        
        int option = arquivo.showOpenDialog(this);
        
        if(option == JFileChooser.APPROVE_OPTION) {  
              file = arquivo.getSelectedFile();  
              String nomeArquivo = file.getName();
              int e = nomeArquivo.lastIndexOf(".");  
              String extensao = nomeArquivo.substring(e);  
                
              if(extensao.equals(".pdo")){
                  Escola.getInstance().exportar(file.getAbsolutePath());
              }  
      }   
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exportPanel;
    private javax.swing.JPanel importPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

