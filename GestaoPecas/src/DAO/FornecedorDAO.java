/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import gestaopecas.Fornecedor;
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
public class FornecedorDAO {

    private Connection con;
    ResultSet rs;
    PreparedStatement pstm;

    public FornecedorDAO() {
        this.con = new ConexaoBanco().getConexao();
    }

    public void cadastrarForn(Fornecedor fornecedor) {
        String sql = "insert into fornecedor(nome,cnpj_cpf,telefone,email, endereco)values(?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, fornecedor.getNome());
            ps.setInt(2, fornecedor.getCnpj_cpf());
            ps.setInt(3, fornecedor.getTelefone());
            ps.setString(4, fornecedor.getEmail());
            ps.setString(5, fornecedor.getEndereco());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar fornecedor!");
        }
    }

    public ArrayList<Fornecedor> getFornecedores() {
        String SQL = "SELECT * FROM fornecedor";
        ArrayList<Fornecedor> fornecedores = null;

        try (Connection connection = new ConexaoBanco().getConexao(); PreparedStatement ps = connection.prepareStatement(SQL)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    if (fornecedores == null) {
                        fornecedores = new ArrayList<>();
                    }
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor.setId(rs.getInt("id"));
                    fornecedor.setNome(rs.getString("nome"));
                    fornecedor.setCnpj_cpf(rs.getInt("cnpj_cpf"));
                    fornecedor.setTelefone(rs.getInt("telefone"));
                    fornecedor.setEmail(rs.getString("email"));
                    fornecedor.setEndereco(rs.getString("endereco"));
                    fornecedores.add(fornecedor);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter lista de fornecedores: " + e.getMessage(), e);
        }
        return fornecedores;
    }

    public void alterarFornecedor(String nome, String telefone, String email, String endereco) {
        String sql = "UPDATE fornecedor SET nome = ?, telefone = ?, email = ?, endereco = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, telefone);
            ps.setString(3, email);
            ps.setString(4, endereco);
            ps.execute();
            ps.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao alterar o fornecedor: " + e.getMessage(), e);
        }
    }

    public void excluirFornecedor(int id) {
        String sql = "DELETE FROM fornecedor WHERE id = ?";

        // Usando try-with-resources para garantir o fechamento da conexão e do statement
        try (Connection connection = new ConexaoBanco().getConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

            // Define o parâmetro (ID do fornecedor que será excluído)
            ps.setInt(1, id);

            // Executa a exclusão
            int rowsAffected = ps.executeUpdate();

            // Verifica se a exclusão foi bem-sucedida
            if (rowsAffected > 0) {
                System.out.println("Fornecedor excluído com sucesso!");
            } else {
                System.out.println("Nenhum fornecedor encontrado com o ID fornecido.");
            }

        } catch (SQLException e) {
            // Exibe a mensagem de erro caso ocorra uma exceção
            throw new RuntimeException("Erro ao excluir o fornecedor: " + e.getMessage(), e);
        }
    }
}
