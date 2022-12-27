package model;

import com.mycompany.apipokedex.Ataque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Danie
 */
public class AtaqueDAO {
    
    public List<Ataque> retornarAtaques(){
        return null;
    }
    
    public List<Ataque> buscarAtaque(int id, String nome){
        return null;
    }
    
    public void adicionarAtaque(Ataque ataque){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("INSERT INTO ataque (id, tm, nome, tipo, efeito, dano, pp, precisao) VALUES ()");
            prepared.execute();
            System.out.println("Ataque Inserida!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
    
    public void alterarAtaque(Ataque ataque){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("");
            prepared.execute();
            System.out.println("Ataque Inserida!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
    
    public void deletarAtaque(Ataque ataque){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("");
            prepared.execute();
            System.out.println("Ataque Inserida!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
}
