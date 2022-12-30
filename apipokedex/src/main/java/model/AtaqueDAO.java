package model;

import com.mycompany.apipokedex.Ataque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danie
 */
public class AtaqueDAO {
    
    public List<Ataque> retornarAtaques(){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("SELECT * FROM ataque;");
            ResultSet resultados = prepared.executeQuery();
            List ataques = new ArrayList();
            if(resultados.next()){
                do{
                   Ataque ataqueTemporario = new Ataque();
                   ataqueTemporario.setId(resultados.getInt("id"));
                   ataqueTemporario.setTm(resultados.getInt("tm"));
                   ataqueTemporario.setNome(resultados.getString("nome"));
                   ataqueTemporario.setTipo(resultados.getString("tipo"));
                   ataqueTemporario.setEfeito(resultados.getString("efeito"));
                   ataqueTemporario.setDano(resultados.getInt("dano"));
                   ataqueTemporario.setPp(resultados.getInt("pp"));
                   ataqueTemporario.setPrecisao(resultados.getInt("precisao"));
                   ataqueTemporario.setCategoria(resultados.getString("categoria"));
                   ataques.add(ataqueTemporario);
                }while(resultados.next());
            }
            System.out.println("Ataques recuperados: " + ataques.size());
            con.close();
            return ataques;
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
        return null;
    }
    
    public List<Ataque> buscarAtaque(int id, String nome){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared;
            
            if(id != 0){        
                prepared = con.prepareStatement("SELECT * FROM ataque WHERE id LIKE "+id+";");
            }else{
                prepared = con.prepareStatement("SELECT * FROM ataque WHERE nome LIKE '%"+nome+"%';");
            }
            
            ResultSet resultados = prepared.executeQuery();
            List ataques = new ArrayList();
            if(resultados.next()){
                do{
                   Ataque ataqueTemporario = new Ataque();
                   ataqueTemporario.setId(resultados.getInt("id"));
                   ataqueTemporario.setTm(resultados.getInt("tm"));
                   ataqueTemporario.setNome(resultados.getString("nome"));
                   ataqueTemporario.setTipo(resultados.getString("tipo"));
                   ataqueTemporario.setEfeito(resultados.getString("efeito"));
                   ataqueTemporario.setDano(resultados.getInt("dano"));
                   ataqueTemporario.setPp(resultados.getInt("pp"));
                   ataqueTemporario.setPrecisao(resultados.getInt("precisao"));
                   ataqueTemporario.setCategoria(resultados.getString("categoria"));
                   ataques.add(ataqueTemporario);
                }while(resultados.next());
            }
            System.out.println("Ataques recuperados: " + ataques.size());
            con.close();
            return ataques;
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
        return null;
    }
    
    public void adicionarAtaque(Ataque ataque){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("INSERT INTO ataque (tm, nome, tipo, efeito, dano, pp, precisao) VALUES ("+ataque.getTm()+", '"+ataque.getNome()+"', '"+ataque.getTipo()+"', '"+ataque.getEfeito()+"', "+ataque.getDano()+", "+ataque.getPp()+", "+ataque.getPrecisao()+")");
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
            PreparedStatement prepared = con.prepareStatement("UPDATE ataque SET tm = "+ataque.getTm()+", nome = '"+ataque.getNome()+"', tipo = '"+ataque.getTipo()+"', efeito = '"+ataque.getEfeito()+"', dano = "+ataque.getDano()+", pp = "+ataque.getPp()+", precisao = "+ataque.getPrecisao()+", categoria = '"+ataque.getCategoria()+"' WHERE id = "+ataque.getTm());
            prepared.execute();
            System.out.println("Ataque Alterado!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
    
    public void deletarAtaque(int id){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("DELETE FROM ataque WHERE id = "+id);
            prepared.execute();
            System.out.println("Ataque deletado!");
            con.close();
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
    }
}
