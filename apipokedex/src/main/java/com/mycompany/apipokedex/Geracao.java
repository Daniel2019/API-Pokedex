package com.mycompany.apipokedex;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Danie
 */
public class Geracao {
    
    private int id;
    private int geracao;
    private List<Jogo> jogos = new ArrayList<>();
    private List<Pokemon> pokemons = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGeracao() {
        return geracao;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(Jogo jogo) {
        this.jogos.add(jogo);
    }
    
    public List<Pokemon> getPokemon(){
        return pokemons;
    }
    
    public void setPokemons(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }
}
