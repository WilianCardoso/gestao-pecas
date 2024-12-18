/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import gestaopecas.Peca;
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

    public PecaDAO() {
        this.con = new ConexaoBanco().getConexao();
    }

    public void cadastrarPeca(Peca peca) {
        String sql = "insert into peca(codigo,nome,qtd_estoque,preco)values(?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(2, peca.getCod());
            ps.setString(3, peca.getNome());
            ps.setInt(4, peca.getQntdEstoque());
            ps.setDouble(5, peca.getPreco());

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
                    peca.setId(rs.getInt("id"));
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

    public void alterarPeca(String nome, int qtd_estoque) {
        String sql = "UPDATE peca SET nome = ?, qtd_estoque = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setInt(2, qtd_estoque);
            ps.execute();
            ps.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao alterar o fornecedor: " + e.getMessage(), e);
        }
    }

    public void excluirPeca(int id) {
        String sql = "DELETE FROM peca WHERE id = ?";

        // Usando try-with-resources para garantir o fechamento da conexão e do statement
        try (Connection connection = new ConexaoBanco().getConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

            // Define o parâmetro (ID da peça que será excluída)
            ps.setInt(1, id);

            // Executa a exclusão
            int rowsAffected = ps.executeUpdate();

            // Verifica se a exclusão foi bem-sucedida
            if (rowsAffected > 0) {
                System.out.println("Peça excluída com sucesso!");
            } else {
                System.out.println("Nenhuma peça encontrada com o ID fornecido.");
            }

        } catch (SQLException e) {
            // Exibe a mensagem de erro caso ocorra uma exceção
            throw new RuntimeException("Erro ao excluir a peça: " + e.getMessage(), e);
        }
    }
}
