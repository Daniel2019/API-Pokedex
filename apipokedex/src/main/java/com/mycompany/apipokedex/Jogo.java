package com.mycompany.apipokedex;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Danie
 */
public class Jogo {
    
    private int id;
    private String nomeJogo;
    private List<Pokemon> pokemonsExclusivos = new ArrayList<>();
    private List<Habilidade> habilidades = new ArrayList<>();
    private List<Ataque> tm = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public List<Pokemon> getPokemons() {
        return pokemonsExclusivos;
    }

    public void setPokemons(Pokemon pokemon) {
        this.pokemonsExclusivos.add(pokemon);
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidade habilidade) {
        this.habilidades.add(habilidade);
    }

    public List<Ataque> getTm() {
        return tm;
    }

    public void setTm(Ataque tm) {
        this.tm.add(tm);
    }
    
    
}
