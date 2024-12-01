/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import gestaopecas.Peca;
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
public class PecaDAO {

    private Connection con;
    ResultSet rs;
    PreparedStatement pstm;

    public PecaDAO() {
        this.con = new ConexaoBanco().getConexao();
    }

    public void cadastrarPeca(Peca peca) {
        String sql = "insert into peca(codigo,nome,qtd_estoque,preco)values(?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, peca.getCod());
            ps.setString(2, peca.getNome());
            ps.setInt(3, peca.getQntdEstoque());
            ps.setDouble(4, peca.getPreco());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Peça Cadastrada!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar peça!");
        }
    }

    public ArrayList<Peca> getPecas() {
        String SQL = "SELECT * FROM peca";
        ArrayList<Peca> pecas = null;

        try (Connection connection = new ConexaoBanco().getConexao(); PreparedStatement ps = connection.prepareStatement(SQL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (pecas == null) {
                        pecas = new ArrayList<>();
                    }
                    Peca peca = new Peca();
                    peca.setCod(rs.getString("codigo"));
                    peca.setNome(rs.getString("nome"));
                    peca.setQntdEstoque(rs.getInt("qtd_estoque"));
                    peca.setPreco(rs.getDouble("preco"));
                    pecas.add(peca);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter lista de peças: " + e.getMessage(), e);
        }
        return pecas;
    }
}
