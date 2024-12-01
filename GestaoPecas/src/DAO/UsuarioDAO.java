/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import gestaopecas.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author wilian_g_cardoso
 */
public class UsuarioDAO {

    private Connection con;
    ResultSet rs;
    PreparedStatement pstm;

    public UsuarioDAO() {
        this.con = new ConexaoBanco().getConexao();
    }

    public Usuario logar(String nome, String senha) {
        Usuario usuario = null;
        String sql = "select * from usuario where nome = ? and senha = ?";
        
        try (Connection connection = new ConexaoBanco().getConexao(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuario = new Usuario();
                    usuario.setNome(rs.getString("nome"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setTipo_usuario(rs.getBoolean("tipo_usuario"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }

    public void cadastrarUsu(Usuario usuario) {
        String sql = "insert into usuario(nome,senha,tipo_usuario)values(?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setBoolean(3, usuario.isTipo_usuario());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar usuario!");
        }
    }
    
    public ArrayList<Usuario> getUsuarios() {
        String SQL = "SELECT * FROM usuario";
        ArrayList<Usuario> usuarios = null;

        try (Connection connection = new ConexaoBanco().getConexao(); PreparedStatement ps = connection.prepareStatement(SQL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (usuarios == null) {
                        usuarios = new ArrayList<>();
                    }
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setTipo_usuario(rs.getBoolean("tipo_usuario"));
                    usuarios.add(usuario);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter lista de usuários: " + e.getMessage(), e);
        }
        return usuarios;
    }
}
