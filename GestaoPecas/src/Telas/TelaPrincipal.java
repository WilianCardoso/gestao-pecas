/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author wilian_g_cardoso
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmSair = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmCad = new javax.swing.JMenu();
        jmiCadPeca = new javax.swing.JMenuItem();
        jmiCadForn = new javax.swing.JMenuItem();
        jmiCadUsu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jmSair.setText("Sair");

        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmSair.add(jmiSair);

        jMenuBar1.add(jmSair);

        jmCad.setText("Cadastrar");

        jmiCadPeca.setText("Cadastrar Peça");
        jmiCadPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadPecaActionPerformed(evt);
            }
        });
        jmCad.add(jmiCadPeca);

        jmiCadForn.setText("Cadastrar Fornecedor");
        jmiCadForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadFornActionPerformed(evt);
            }
        });
        jmCad.add(jmiCadForn);

        jmiCadUsu.setText("Cadastrar Usuário");
        jmiCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadUsuActionPerformed(evt);
            }
        });
        jmCad.add(jmiCadUsu);

        jMenuBar1.add(jmCad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiCadPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadPecaActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaCadPeca tela = new TelaCadPeca();
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCadPecaActionPerformed

    private void jmiCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadUsuActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaCadLogin tela = new TelaCadLogin();
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCadUsuActionPerformed

    private void jmiCadFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadFornActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaCadForn tela = new TelaCadForn();
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCadFornActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    public void habilitarModoAdministrador() {
        //  menuAdmin.setEnabled(true);  // Habilitar funcionalidades de administrador

    }
    
    public void habilitarModoFuncionario() {
        jmiCadUsu.setEnabled(false); // Restringir funcionalidades de administrador
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmCad;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiCadForn;
    private javax.swing.JMenuItem jmiCadPeca;
    private javax.swing.JMenuItem jmiCadUsu;
    private javax.swing.JMenuItem jmiSair;
    // End of variables declaration//GEN-END:variables
}
