/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import gestaopecas.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            JOptionPane.showMessageDialog(null, "Peça Fornecedor Cadastrado!");
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar peça!");
        }
    }
}
