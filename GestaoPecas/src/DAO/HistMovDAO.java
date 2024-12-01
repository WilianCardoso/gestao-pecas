/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import gestaopecas.HistMov;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cardo
 */
public class HistMovDAO {

    private java.sql.Connection con;
    ResultSet rs;

    public HistMovDAO() {
        this.con = new ConexaoBanco().getConexao();
    }

    public void registrarMovimentacao(String tipoMovimentacao, int quantidade, int pecaId, Integer fornecedorId, Integer usuarioId) {
        String sql = "INSERT INTO hist_mov (tipo_movimentacao, qtd, data_hora, peca_id, fornecedor_id, usuario_id) VALUES (?, ?, NOW(), ?, ?,?)";

        try (java.sql.Connection connection = new ConexaoBanco().getConexao(); 
                PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, tipoMovimentacao);
            ps.setInt(2, quantidade);
            ps.setInt(3, pecaId);
            if (fornecedorId != null) {
                ps.setInt(4, fornecedorId);
            } else {
                ps.setNull(4, java.sql.Types.INTEGER);
            }
            if (usuarioId != null) {
                ps.setInt(5, usuarioId);
            } else {
                ps.setNull(5, java.sql.Types.INTEGER);
            }

            ps.executeUpdate();
            System.out.println("Movimentação registrada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao registrar movimentação: " + e.getMessage(), e);
        }

    }

    public List<HistMov> listarMovimentacoes() {
        String sql = "SELECT * FROM hist_mov";
        List<HistMov> movimentacoes = new ArrayList<>();

        try (java.sql.Connection connection = new ConexaoBanco().getConexao(); 
                PreparedStatement ps = connection.prepareStatement(sql)) {

            while (rs.next()) {
                HistMov mov = new HistMov();
                mov.setTipoMovimentacao(rs.getString("tipo_movimentacao"));
                mov.setId(rs.getInt("id"));
                mov.setQuantidade(rs.getInt("qtd"));
                mov.setDataHora(rs.getTimestamp("data_hora").toLocalDateTime());
                mov.setPecaId(rs.getInt("peca_id"));
                mov.setFornecedorId(rs.getInt("fornecedor_id"));
                mov.setUsuarioId(rs.getInt("usuario_id"));

                movimentacoes.add(mov);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar movimentações: " + e.getMessage(), e);
        }

        return movimentacoes;
    }
}
