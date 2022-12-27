/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.apipokedex.Habilidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danie
 */
public class HabilidadeDAO {
    
    public List<Habilidade> retornarHablilidades(){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("SELECT * FROM habilidade;");
            ResultSet resultados = prepared.executeQuery();
            List habilidades = new ArrayList();
            if(resultados.next()){
                do{
                    Habilidade habilidadeTemporario = new Habilidade();
                    habilidadeTemporario.setId(resultados.getInt("id"));
                    habilidadeTemporario.setNome(resultados.getString("nome"));
                    habilidadeTemporario.setDescricao(resultados.getString("descricao"));
                    habilidades.add(habilidadeTemporario);
                }while(resultados.next());
            }
            System.out.println("Habilidades recuperados: " + habilidades.size());
            con.close();
            return habilidades;
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
        return null;
    }
    
    public List<Habilidade> buscarHabilidade(int id, String nome, String descricao){
        if(id != 0){
            try{
                Connection con = new Conexao().conectar();
                PreparedStatement prepared = con.prepareStatement("SELECT * FROM habilidade WHERE id = "+id);
                ResultSet resultados = prepared.executeQuery();
                List habilidades = new ArrayList();
                if(resultados.next()){
                    do{
                        Habilidade habilidadeTemporario = new Habilidade();
                        habilidadeTemporario.setId(resultados.getInt("id"));
                        habilidadeTemporario.setNome(resultados.getString("nome"));
                        habilidadeTemporario.setDescricao(resultados.getString("descricao"));
                        habilidades.add(habilidadeTemporario);
                    }while(resultados.next());
                }
                System.out.println("Habilidades recuperados: " + habilidades.size());
                con.close();
                return habilidades;
            }catch(Exception error){
                System.out.println("Falham na conexao");
                System.out.println(error.getMessage());
            }
            return null;
        }
        
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared;
            if(nome != "" && descricao == ""){
                prepared = con.prepareStatement("SELECT * FROM habilidade WHERE nome LIKE '%"+nome+"'");
            }else if(nome == "" && descricao != ""){
                prepared = con.prepareStatement("SELECT * FROM habilidade WHERE descricao LIKE '%"+descricao+"%'");
            }else{
                prepared = con.prepareStatement("SELECT * FROM habilidade WHERE nome LIKE '%"+nome+"%' OR descricao LIKE '%"+descricao+"%'");
            }
            ResultSet resultados = prepared.executeQuery();
            List habilidades = new ArrayList();
            if(resultados.next()){
                do{
                    Habilidade habilidadeTemporario = new Habilidade();
                    habilidadeTemporario.setId(resultados.getInt("id"));
                    habilidadeTemporario.setNome(resultados.getString("nome"));
                    habilidadeTemporario.setDescricao(resultados.getString("descricao"));
                    habilidades.add(habilidadeTemporario);
                }while(resultados.next());
            }
            System.out.println("Habilidades recuperados: " + habilidades.size());
            con.close();
            return habilidades;
        }catch(Exception error){
            System.out.println("Falham na conexao");
            System.out.println(error.getMessage());
        }
        return null;
    }
    
    public void adicionarHabilidade(Habilidade habilidade){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("INSERT INTO habilidade (nome, descricao) VALUES ('"+habilidade.getNome()+"', '"+habilidade.getDescricao()+"');");
            prepared.execute();
            System.out.println("Habilidade Inserida!");
            con.close();
        }catch(Exception error){
            System.out.println("Falha ao conectar.");
            System.out.println(error.getMessage());
        }
        
    }
    
    public void alterarHabilidade(Habilidade habilidade){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("UPDATE habilidade SET nome = '"+habilidade.getNome()+"', descricao = '"+habilidade.getDescricao()+"' WHERE id = "+habilidade.getId());
            prepared.execute();
            System.out.println("Habilidade atualizada");
            con.close();
        }catch(Exception error){
            System.out.println("Falha ao conectar");
            System.out.println(error.getMessage());
        }
    }
    
    public void excluirHabilidade(Habilidade habilidade){
        try{
            Connection con = new Conexao().conectar();
            PreparedStatement prepared = con.prepareStatement("DELETE FROM habilidade WHERE id = "+habilidade.getId());
            prepared.execute();
            System.out.println("Habilidade Deletada!");
            con.close();
        }catch(Exception error){
            System.out.println("Falha ao conectar.");
            System.out.println(error.getMessage());
        }
    }
}
