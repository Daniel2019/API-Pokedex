package com.mycompany.apipokedex;

import java.sql.Connection;
import java.util.List;
import model.AtaqueDAO;
import model.Conexao;
import model.HabilidadeDAO;

/**
 *
 * @author Daniel
 */
public class Apipokedex {

    public static void main(String[] args) {
        System.out.println("Hello World! Welcome a API Pokédex!");
        
//        try{;
//            Connection conexao = new Conexao().conectar();
//            System.out.println("Conectou");
//            conexao.close();
//        }catch(Exception erro){
//            System.out.println(erro);
//        }
//        
//        Habilidade sandVeil = new Habilidade();
//        sandVeil.setId(2);
//        sandVeil.setNome("Sand Veil");
//        sandVeil.setDescricao("Aumenta a evasão do Pokémon em uma tempestade de areia.");
//        
//        Ataque tm001= new Ataque();
//        tm001.setId(1);
//        tm001.setTm(1);
//        tm001.setNome("Mega Punch");
//        tm001.setTipo("Normal");
//        tm001.setEfeito("Mega Punch causa dano sem efeito adicional");
//        tm001.setCategoria("Physical");
//        tm001.setDano(80);
//        tm001.setPp(20);
//        tm001.setPrecisao(85);
        
        AtaqueDAO dao = new AtaqueDAO();
        
        for(Ataque ataque: dao.buscarAtaque(0, "q")){
            System.out.println(ataque.toString());
        }
//        dao.adicionarAtaque(tm001);
//        
//        Status status001 = new Status();
//        status001.setHp(45);
//        status001.setAttack(49);
//        status001.setDefense(49);
//        status001.setSpAttack(65);
//        status001.setSpDefense(0);
//        status001.setSpeed(45);
//        
//        
//        Pokemon bulbasaur = new Pokemon();
//        bulbasaur.setNome("Bulbasaur");
//        bulbasaur.setNumero("0001");
//        bulbasaur.setTipo1("Grass");
//        bulbasaur.setTipo2("Poison");
//        bulbasaur.setDescricao("Há uma semente de planta em suas costas desde o dia em que este Pokémon nasceu. A semente cresce lentamente.");
//        bulbasaur.setStatus(status001);
//        bulbasaur.setHabilidade(sturdy);
//        bulbasaur.setAtaques(tm001);
//        System.out.println(bulbasaur.toString());
//        
//        Status status002 = new Status();
//        status002.setHp(60);
//        status002.setAttack(62);
//        status002.setDefense(63);
//        status002.setSpAttack(80);
//        status002.setSpDefense(0);
//        status002.setSpeed(60);
//        
//        Pokemon ivysaur = new Pokemon();
//        ivysaur.setNome("Ivysaur");
//        ivysaur.setNumero("0002");
//        ivysaur.setTipo1("Grass");
//        ivysaur.setTipo2("Poison");
//        ivysaur.setDescricao("Quando o bulbo nas costas cresce, parece perder a capacidade de ficar de pé nas patas traseiras.");
//        ivysaur.setStatus(status001);
//        ivysaur.setHabilidade(sturdy);
//        ivysaur.setAtaques(tm001);
//        System.out.println(ivysaur.toString());
//        
//        Jogo pokemonRed = new Jogo();
//        pokemonRed.setNomeJogo("Pokémon Red");
//        
//        Jogo pokemonBlue = new Jogo();
//        pokemonBlue.setNomeJogo("Pokémon Blue");
//        
//        Jogo pokemonGreen = new Jogo();
//        pokemonGreen.setNomeJogo("Pokémon Green");
//        
//        Jogo pokemonYellow = new Jogo();
//        pokemonYellow.setNomeJogo("Pokémon Yellow");
//        
//        Geracao gen1 = new Geracao();
//        gen1.setJogos(pokemonRed);
//        gen1.setJogos(pokemonBlue);
//        gen1.setJogos(pokemonGreen);
//        gen1.setJogos(pokemonYellow);
//        
//        System.out.println("Jogos da 1 Geração de Pokémon:");
//        for(Jogo jogos: gen1.getJogos()){
//            System.out.println(jogos.getNomeJogo());
//        }
    
    }
}
