/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import gestaopecas.Fornecedor;
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
public class FornecedorDAO {
    private Connection con;
    ResultSet rs;
    PreparedStatement pstm;
    
    public FornecedorDAO(){
         this.con = new ConexaoBanco().getConexao();
    }
    
    public void cadastrarForn(Fornecedor fornecedor){
         String sql = "insert into fornecedor(nome,cnpj_cpf,telefone,email, endereco)values(?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1,fornecedor.getNome());
            ps.setInt(2,fornecedor.getCnpj_cpf());
            ps.setInt(3,fornecedor.getTelefone());
            ps.setString(4,fornecedor.getEmail());
            ps.setString(5,fornecedor.getEndereco());
            
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

        try (Connection connection = new ConexaoBanco().getConexao();
                PreparedStatement ps = connection.prepareStatement(SQL)) {
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
}
