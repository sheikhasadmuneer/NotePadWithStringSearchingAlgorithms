/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package All_Gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import javax.imageio.IIOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Sheikh Asad
 */
public class NotePad extends javax.swing.JFrame {

    String getSelectedText = ""; // Sves the selected text from MainTextField //
    // ---- Creates new form NotePad -- //
     
    public NotePad() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        mainTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewFileDiag = new javax.swing.JMenuItem();
        OpenDiag = new javax.swing.JMenuItem();
        SaveDiag = new javax.swing.JMenuItem();
        SaveAsDiag = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ExitDiag = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CutDiag = new javax.swing.JMenuItem();
        CopyDiag = new javax.swing.JMenuItem();
        PasteDiag = new javax.swing.JMenuItem();
        DelDiag = new javax.swing.JMenuItem();
        SelAllDiag = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        FindDiag = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        modeDiag = new javax.swing.JCheckBoxMenuItem();
        LineDiag = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotePad [ ReLoaded ]");
        setFocusable(false);

        mainTextArea.setColumns(20);
        mainTextArea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        mainTextArea.setLineWrap(true);
        mainTextArea.setRows(5);
        jScrollPane1.setViewportView(mainTextArea);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        NewFileDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewFileDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        NewFileDiag.setText("New");
        NewFileDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewFileDiagActionPerformed(evt);
            }
        });
        jMenu1.add(NewFileDiag);

        OpenDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        OpenDiag.setText("Open");
        OpenDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenDiagActionPerformed(evt);
            }
        });
        jMenu1.add(OpenDiag);

        SaveDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        SaveDiag.setText("Save");
        jMenu1.add(SaveDiag);

        SaveAsDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        SaveAsDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        SaveAsDiag.setText("Save As...");
        SaveAsDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsDiagActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAsDiag);
        jMenu1.add(jSeparator2);

        ExitDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ExitDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        ExitDiag.setText("Exit");
        ExitDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitDiagActionPerformed(evt);
            }
        });
        jMenu1.add(ExitDiag);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        CutDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        CutDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        CutDiag.setText("Cut");
        CutDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutDiagActionPerformed(evt);
            }
        });
        jMenu2.add(CutDiag);

        CopyDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        CopyDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        CopyDiag.setText("Copy");
        CopyDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyDiagActionPerformed(evt);
            }
        });
        jMenu2.add(CopyDiag);

        PasteDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        PasteDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        PasteDiag.setText("Paste");
        PasteDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteDiagActionPerformed(evt);
            }
        });
        jMenu2.add(PasteDiag);

        DelDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        DelDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        DelDiag.setText("Delete");
        DelDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelDiagActionPerformed(evt);
            }
        });
        jMenu2.add(DelDiag);

        SelAllDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        SelAllDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        SelAllDiag.setText("Select All");
        SelAllDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelAllDiagActionPerformed(evt);
            }
        });
        jMenu2.add(SelAllDiag);
        jMenu2.add(jSeparator3);

        FindDiag.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        FindDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        FindDiag.setText("Search");
        jMenu2.add(FindDiag);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("View");

        modeDiag.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        modeDiag.setText("Night Mode");
        modeDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeDiagActionPerformed(evt);
            }
        });
        jMenu4.add(modeDiag);

        LineDiag.setSelected(true);
        LineDiag.setText("Line Numbers");
        LineDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineDiagActionPerformed(evt);
            }
        });
        jMenu4.add(LineDiag);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Info");

        jMenuItem12.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        jMenuItem12.setText("Document ");
        jMenu3.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        jMenuItem13.setText("Developer");
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CutDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutDiagActionPerformed
        //when user clicks CutDiag //
        // cut = copy to clipboard and delete //
        // class that implements to transfer data using cut/copy/paste operations. //
        getSelectedText = mainTextArea.getSelectedText(); // Saves SelecTedText into A String //
        StringSelection strSelect = new StringSelection(getSelectedText );
        Clipboard  cp = Toolkit.getDefaultToolkit().getSystemClipboard();
        // now setting contents //
        cp.setContents(strSelect, null);
        // deletes the highlighest text  //
        // Setting null makes it del // 
        mainTextArea.replaceSelection(null);
        
       
        
        
    }//GEN-LAST:event_CutDiagActionPerformed

    private void CopyDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyDiagActionPerformed
         // --------- Copies Selected Text Into getSelectedText //
           //when user clicks CopyDiag //
        // cut = copy to clipboard and delete //
        // class that implements to transfer data using cut/copy/paste operations. //
        getSelectedText = mainTextArea.getSelectedText(); // Saves SelecTedText into A String //
        StringSelection strSelect = new StringSelection(getSelectedText );
        Clipboard  cp = Toolkit.getDefaultToolkit().getSystemClipboard();
        // now setting contents //
        cp.setContents(strSelect, null);
         
        // --- End -- //
        
        
    }//GEN-LAST:event_CopyDiagActionPerformed

    private void PasteDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteDiagActionPerformed
         
        // .apends function paste the selected String // i.e saved into GetSelectedText//
        mainTextArea.append(getSelectedText);
    }//GEN-LAST:event_PasteDiagActionPerformed

    private void DelDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelDiagActionPerformed
        
        
        mainTextArea.replaceSelection("");
        
        
    }//GEN-LAST:event_DelDiagActionPerformed

    private void SelAllDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelAllDiagActionPerformed
         
       mainTextArea.selectAll();
        
    }//GEN-LAST:event_SelAllDiagActionPerformed

    private void ExitDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitDiagActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitDiagActionPerformed

    private void OpenDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenDiagActionPerformed
        
        JFileChooser Jopen = new JFileChooser();
        // enables file chooser to open just .txt files //
        FileNameExtensionFilter fileListing = new FileNameExtensionFilter("Text File", "txt","cpp","java","css","html");
        Jopen.setFileFilter(fileListing);
        // --- when file is opened it returns a value //
        int retVal =    Jopen.showOpenDialog(null);
        
        // --- saveSelectedFile = file the user selects in our JfieChooser //
        File fileIChoose  = Jopen.getSelectedFile();
        
        try {
            
            
           //  APPROVE_OPTION = open Button in The Dialog Box  //
            if (retVal == JFileChooser.APPROVE_OPTION)
            {
               // BufferedReader Parameters Takes =  fileReader And what file to read //
                // fileIChoose = contain data what i want to open //
                BufferedReader buff = new BufferedReader( new FileReader(fileIChoose));
                //--- when new files open clear previous text //
                mainTextArea.setText("");
                
                
                String temp  ;
                // copies text line by line //
                // till end of file //
                // temp = line by line stores a strig //
                while ( (temp=buff.readLine()) !=null )
                {
                    
                    
                    // displays the text // 
                    // till it finds eof //
                    mainTextArea.append(temp+ "\n");
                   
                    
                    
                }
                 buff.close();
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Opening File ");
        }
        
        
    }//GEN-LAST:event_OpenDiagActionPerformed

    private void SaveAsDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsDiagActionPerformed
        JFileChooser Jopen = new JFileChooser();
        // enables file chooser to open just .txt files //
        FileNameExtensionFilter fileListing = new FileNameExtensionFilter("Text File", "txt","cpp","java","css","html");
        Jopen.setFileFilter(fileListing);
        // --- when file is opened it returns a value //
        int retVal = Jopen.showSaveDialog(null);
        
        try {
            
            if( retVal == JFileChooser.APPROVE_OPTION)
                // APPROVE_OPTION button to save //
                
            
            {
                
                
                File Directory = Jopen.getCurrentDirectory();
                
                
                // ----- Saves The Path To Save In  A path Variable // 
                String path = Directory.getAbsolutePath();
                // stores the text of saving file name //
                String fileName = Jopen.getSelectedFile().getName();
                    
                // ---- If user has written .txt during saving do nothing //
                // else mai .txt appends karo //
                if(fileName.contains(".txt"))
                {
                    // ---- Do Nothing //
                }
                else
                {
                        
                    fileName = fileName+".txt";
                }
                
                // ---- buffwriter = writes data into a file //
                
      
                BufferedWriter buffWrit = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(path+"\\"+ fileName) ));
                
                // write whatever is in our mainTextField //
                buffWrit.write( mainTextArea.getText() );
                buffWrit.close();
                
                
            }
                
            
                    
            
        } catch (IOException e) {
        
        JOptionPane.showMessageDialog(null, "Error Saving File ");
        }
        
    }//GEN-LAST:event_SaveAsDiagActionPerformed

    private void NewFileDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFileDiagActionPerformed
        NotePad obj = new NotePad();
        obj.setVisible(true);
    }//GEN-LAST:event_NewFileDiagActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void modeDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeDiagActionPerformed
            
            if(modeDiag.isSelected()==true)
                
            {
                mainTextArea.setBackground(Color.black);
                mainTextArea.setForeground(Color.white);
            
            }
                
            else if (modeDiag.isSelected()==false){
            
                mainTextArea.setBackground(Color.white);
                mainTextArea.setForeground(Color.black);
            }
        
        
        
    }//GEN-LAST:event_modeDiagActionPerformed

    private void LineDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineDiagActionPerformed
   
        if (LineDiag.isSelected()==true)
        {
            
        }
        
        else if (LineDiag.isSelected()==false)
        {
        
        
        }
            
        
    }//GEN-LAST:event_LineDiagActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new NotePad().setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CopyDiag;
    private javax.swing.JMenuItem CutDiag;
    private javax.swing.JMenuItem DelDiag;
    private javax.swing.JMenuItem ExitDiag;
    private javax.swing.JMenuItem FindDiag;
    private javax.swing.JCheckBoxMenuItem LineDiag;
    private javax.swing.JMenuItem NewFileDiag;
    private javax.swing.JMenuItem OpenDiag;
    private javax.swing.JMenuItem PasteDiag;
    private javax.swing.JMenuItem SaveAsDiag;
    private javax.swing.JMenuItem SaveDiag;
    private javax.swing.JMenuItem SelAllDiag;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea mainTextArea;
    private javax.swing.JCheckBoxMenuItem modeDiag;
    // End of variables declaration//GEN-END:variables
}
