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
        String sql = "insert into peca(codigo,nome,qtdEstoque,preco)values(?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(2,peca.getCod());
            ps.setString(2, peca.getNome());
            ps.setInt(3, peca.getQntdEstoque());
            ps.setDouble(4, peca.getPreco());

            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Peça Cadastrada!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar peça!");
        }
    }
}
