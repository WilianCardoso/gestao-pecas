/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaopecas;

/**
 *
 * @author wilian_g_cardoso
 */
public class Peca {

    private String cod;
    private String nome;
    private int qntdEstoque;
    private double preco;

    public Peca(String cod, String nome, int qntdEstoque, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.qntdEstoque = qntdEstoque;
        this.preco = preco;
    }

    public Peca() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(int qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
