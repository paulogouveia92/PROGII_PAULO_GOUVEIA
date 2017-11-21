/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Gouveia
 */
public class Conexao {

    private static final String URL_DB = "jdbc:postgresql://localhost:5432/trab_prog_ii";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";
    private  String status = "não conectado";

    

    public Connection criarConexao() {

        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(URL_DB, USUARIO, SENHA);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (conexao != null) 
            status = "CONECTADO!";
           
         else 
            status = "NÃO CONECTADO";
            
        
        return conexao;
    }

    public String getStatus() {
        return status;

    }
    
    
}
