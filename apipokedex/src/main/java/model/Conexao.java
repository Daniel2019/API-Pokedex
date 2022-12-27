package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Danie
 */
public class Conexao {
    
    private String host = "localhost";
    private String port = "";
    private String user = "root";
    private String password = "";
    
    public Connection conectar() throws Exception{
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://"+ host +"/api_pokedex", user, password
            );
        return con;
    }
}
