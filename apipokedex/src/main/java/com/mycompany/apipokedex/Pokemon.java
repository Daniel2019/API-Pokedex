package com.mycompany.apipokedex;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Danie
 */
public class Pokemon {
    
    private int id;
    private String numero;
    private String nome;
    private String descricao;
    private String sexo;
    private String tipo1;
    private String tipo2;
    private Habilidade habilidade;
    private Habilidade habilidadeHidden;
    private Status status;
    private List<Ataque> ataques = new ArrayList<>();
    private List<Evolucao> formas = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    public Habilidade getHabilidadeHidden() {
        return habilidadeHidden;
    }

    public void setHabilidadeHidden(Habilidade habilidadeHidden) {
        this.habilidadeHidden = habilidadeHidden;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(Ataque ataque) {
        this.ataques.add(ataque);
    }

    public List<Evolucao> getFormas() {
        return formas;
    }

    public void setFormas(Evolucao evolucao) {
        this.formas.add(evolucao);
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", numero=" + numero + ", nome=" + nome + ", descricao=" + descricao + ", sexo=" + sexo + ", tipo1=" + tipo1 + ", tipo2=" + tipo2 + ", habilidade=" + habilidade + ", habilidadeHidden=" + habilidadeHidden + ", status=" + status + ", ataques=" + ataques + '}';
    }
    
}
