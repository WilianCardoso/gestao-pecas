/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaopecas;

/**
 *
 * @author wilian_g_cardoso
 */
public class Usuario {

    private String id;
    private String nome;
    private String senha;
    private String perfil;

    public Usuario() {

    }

    public Usuario(String nome, String senha, String perfil) {
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }
    
    public Usuario(String id, String nome, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
