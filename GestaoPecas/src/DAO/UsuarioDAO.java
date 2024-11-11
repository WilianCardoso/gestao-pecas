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
    
    public Usuario logar(String nome, String senha, String perfil) {
        Usuario usuario = null;
        String sql = "select * from usuario where nome = ? and senha = ? and perfil = ?";

        try (Connection connection = new ConexaoBanco().getConexao(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            stmt.setString(4, perfil);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuario = new Usuario();
                    usuario.setNome(rs.getString("nome"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setSenha(rs.getString("perfil"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }
}
