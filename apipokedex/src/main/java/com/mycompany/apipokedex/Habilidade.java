package com.mycompany.apipokedex;

/**
 *
 * @author Danie
 */
public class Habilidade {
    
    private int id;
    private String nome;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Habilidade{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + '}';
    }
    
}
