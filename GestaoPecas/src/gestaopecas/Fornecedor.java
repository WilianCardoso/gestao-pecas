/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaopecas;

/**
 *
 * @author wilian_g_cardoso
 */
public class Fornecedor {
    private String id;
    private String nome;
    private int cnpj_cpf;
    private int telefone;
    private String email;
    private String endereco;

    public Fornecedor(String id, String nome, int cnpj_cpf, int telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cnpj_cpf = cnpj_cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    public int getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(int cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Fornecedor() {        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
        
}
