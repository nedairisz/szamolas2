package szamolas2;

import java.awt.HeadlessException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Szamolas2 extends javax.swing.JFrame {

    int osszeg;
    
    public Szamolas2() {
        initComponents();
        
        osszeg=0;
        
        //lblOsszesen.setText(osszeg + "Ft");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOsszesen = new javax.swing.JPanel();
        lblOsszesen = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlOsszetevok = new javax.swing.JPanel();
        chbSajt = new javax.swing.JCheckBox();
        chbHagyma = new javax.swing.JCheckBox();
        chbAnanasz = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProgram = new javax.swing.JMenu();
        mnuProgramMegnyitas = new javax.swing.JMenuItem();
        mnuProgramMentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuProgramKilepes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Számolás2");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlOsszesen.setBorder(javax.swing.BorderFactory.createTitledBorder("Összesen"));

        javax.swing.GroupLayout pnlOsszesenLayout = new javax.swing.GroupLayout(pnlOsszesen);
        pnlOsszesen.setLayout(pnlOsszesenLayout);
        pnlOsszesenLayout.setHorizontalGroup(
            pnlOsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszesenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOsszesen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlOsszesenLayout.setVerticalGroup(
            pnlOsszesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszesenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOsszesen, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlOsszetevok.setBorder(javax.swing.BorderFactory.createTitledBorder("Összetevők"));

        chbSajt.setText("sajt");
        chbSajt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStateChanged(evt);
            }
        });

        chbHagyma.setText("hagyma");
        chbHagyma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStateChanged(evt);
            }
        });

        chbAnanasz.setText("ananasz");
        chbAnanasz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OsszetevokItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlOsszetevokLayout = new javax.swing.GroupLayout(pnlOsszetevok);
        pnlOsszetevok.setLayout(pnlOsszetevokLayout);
        pnlOsszetevokLayout.setHorizontalGroup(
            pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbSajt)
                    .addComponent(chbHagyma)
                    .addComponent(chbAnanasz))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlOsszetevokLayout.setVerticalGroup(
            pnlOsszetevokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOsszetevokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chbSajt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbHagyma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbAnanasz)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Beállítások", pnlOsszetevok);

        jLabel1.setText("Kiválasztva:");

        jTextArea1.setColumns(12);
        jTextArea1.setRows(3);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Statisztika", jPanel1);

        mnuProgram.setText("Program");

        mnuProgramMegnyitas.setText("Megnyitás...");
        mnuProgram.add(mnuProgramMegnyitas);

        mnuProgramMentes.setText("Mentés...");
        mnuProgram.add(mnuProgramMentes);
        mnuProgram.add(jSeparator1);

        mnuProgramKilepes.setText("Kilépés...");
        mnuProgramKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProgramKilepesActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuProgramKilepes);

        jMenuBar1.add(mnuProgram);

        jMenu2.setText("Lehetőségek");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(pnlOsszesen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlOsszesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        osszegetKiir();
    }//GEN-LAST:event_formWindowOpened

    
// Az összes CheckBox kezelője:
    private void OsszetevokItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OsszetevokItemStateChanged
        int ar = 200;
        
        JCheckBox chb = (JCheckBox) evt.getSource();
        
        if (chb.isSelected()) {
            osszeg += ar;
        } else {
            osszeg -=ar;
        }
        
        osszegetKiir();
    }//GEN-LAST:event_OsszetevokItemStateChanged

    private void mnuProgramKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProgramKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuProgramKilepesActionPerformed

    private void kilepes() {
        String kerdes = "Biztos kilép?";
        String cim = "Kilépés";
        int gombokTipusa = JOptionPane.OK_CANCEL_OPTION;
        
        int gomb = JOptionPane.showConfirmDialog(rootPane, kerdes, cim, gombokTipusa);
        //int gomb = JOptionPane.showConfirmDialog(rootPane, "Biztos kilép?");
        //System.out.println("gomb = " + gomb);
        
        if (gomb == 0){
            System.exit(0);
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       kilepes();
    }//GEN-LAST:event_formWindowClosing
    
    private void osszegetKiir() {
        lblOsszesen.setText("A fizetendő összeg: " + osszeg + " Ft");
    }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Szamolas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szamolas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szamolas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szamolas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szamolas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbAnanasz;
    private javax.swing.JCheckBox chbHagyma;
    private javax.swing.JCheckBox chbSajt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblOsszesen;
    private javax.swing.JMenu mnuProgram;
    private javax.swing.JMenuItem mnuProgramKilepes;
    private javax.swing.JMenuItem mnuProgramMegnyitas;
    private javax.swing.JMenuItem mnuProgramMentes;
    private javax.swing.JPanel pnlOsszesen;
    private javax.swing.JPanel pnlOsszetevok;
    // End of variables declaration//GEN-END:variables
}
