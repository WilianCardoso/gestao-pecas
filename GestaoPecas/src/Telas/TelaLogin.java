/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.UsuarioDAO;
import gestaopecas.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author wilian_g_cardoso
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfUsu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtLogin = new javax.swing.JButton();
        jpfSenha = new javax.swing.JPasswordField();
        jbtCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jtfUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Gestão de Peças");

        jbtLogin.setBackground(new java.awt.Color(153, 102, 255));
        jbtLogin.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jbtLogin.setText("Login");
        jbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLoginActionPerformed(evt);
            }
        });

        jbtCad.setBackground(new java.awt.Color(153, 102, 255));
        jbtCad.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jbtCad.setText("Cadastrar");
        jbtCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 99, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbtCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jtfUsu))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCad)
                    .addComponent(jbtLogin))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuActionPerformed

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String nome = jtfUsu.getText().trim();
        String senha = new String(jpfSenha.getPassword());

        if (nome.isEmpty() || senha.isEmpty()) {
            // Se algum campo estiver vazio, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return; // Impede que o login prossiga
        }

        // Validar o usuário
        Usuario usuario = usuarioDAO.logar(nome, senha);

        if (usuario != null) {
            // Verificar o perfil com base no atributo booleano
            boolean isAdmin = usuario.isTipo_usuario();

            JOptionPane.showMessageDialog(null, "Usuário " + usuario.getNome() + " logado com sucesso!");
            dispose(); // Fecha a tela de login

            TelaPrincipal tela = new TelaPrincipal(); // Cria a tela principal

            if (isAdmin) { // Admin
                JOptionPane.showMessageDialog(null, "Bem-vindo, Administrador!");
                tela.habilitarModoAdministrador(); // Ativa funcionalidades de administrador
            } else { // Funcionário
                JOptionPane.showMessageDialog(null, "Bem-vindo, Funcionário!");
                tela.habilitarModoFuncionario(); // Ativa funcionalidades de funcionário
            }

            tela.setVisible(true); // Exibe a tela principal
        } else {
            // Usuário ou senha inválidos
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            jtfUsu.setText(""); // Limpa o campo de usuário
            jpfSenha.setText(""); // Limpa o campo de senha
        }

    }//GEN-LAST:event_jbtLoginActionPerformed

    private void jbtCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadActionPerformed
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String nome = jtfUsu.getText().trim();
        String senha = new String(jpfSenha.getPassword());

        if (nome.isEmpty() || senha.isEmpty()) {
            // Se algum campo estiver vazio, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return; // Impede que prossiga
        }

        // Obter o usuário logado
        Usuario usuario = usuarioDAO.logar(nome, senha);

        if (usuario != null) {
            // Verificar o tipo de usuário (boolean)
            boolean isAdmin = usuario.isTipo_usuario();

            if (!isAdmin) { // Se não for administrador
                // Mensagem separada para o caso de não ser admin
                JOptionPane.showMessageDialog(this, "Funcionário não tem acesso ao cadastro de usuários.");
            } else { // Se for administrador
                // Mensagem separada para o caso de ser admin
                JOptionPane.showMessageDialog(this, "Bem-vindo, Administrador! Redirecionando para cadastro...");
                dispose(); // Fecha a tela atual
                TelaCadLogin tela = new TelaCadLogin("TelaLogin"); // Abre a tela de cadastro
                tela.setVisible(true);
            }
        } else {
            // Mensagem separada para o caso de usuário inválido
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos. Por favor, tente novamente.");
            dispose(); // Fecha a tela atual
            TelaLogin2 tela = new TelaLogin2(); // Redireciona para outra tela de login
            tela.setVisible(true);
        }
    }//GEN-LAST:event_jbtCadActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtCad;
    private javax.swing.JButton jbtLogin;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsu;
    // End of variables declaration//GEN-END:variables
}
