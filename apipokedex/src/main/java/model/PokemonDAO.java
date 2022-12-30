/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.apipokedex.Pokemon;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Danie
 */
public class PokemonDAO {
    
    public void adicionarPokemon(Pokemon pokemon){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("INSERT INTO ");
            prepared.execute();
            System.out.println("Pokémon Inserida!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
    
    public void alterarPokemon(Pokemon pokemon){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("UPDATE  SET  WHERE id = ");
            prepared.execute();
            System.out.println("Pokémon Alterado!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
    
    public void deletarAtaque(int id){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("DELETE FROM  WHERE id = "+id);
            prepared.execute();
            System.out.println("Pokémon deletado!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
}
