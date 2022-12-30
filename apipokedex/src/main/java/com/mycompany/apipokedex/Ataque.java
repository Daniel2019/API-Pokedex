package com.mycompany.apipokedex;

/**
 *
 * @author Danie
 */
public class Ataque {
    
    private int id;
    private int tm;
    private String nome;
    private String tipo;
    private String efeito;
    private String categoria;
    private int dano;
    private int pp;
    private int precisao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTm() {
        return tm;
    }

    public void setTm(int tm) {
        this.tm = tm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    @Override
    public String toString() {
        return "Ataque{" + "id=" + id + ", tm=" + tm + ", nome=" + nome + ", tipo=" + tipo + ", efeito=" + efeito + ", categoria=" + categoria + ", dano=" + dano + ", pp=" + pp + ", precisao=" + precisao + '}';
    }
    
}
