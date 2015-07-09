package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Barromeu
 */
public class ConexaoPostgres {
    
   public static Connection getConnection(){
    
    Connection conn = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/luanadecor","postgres","loja");
            
            JOptionPane.showMessageDialog(null, " Conexão Estabelecida Com Sucesso: ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Não foi Possivél Conectar com o Banco de Dados: " + ex.getMessage());
        }
        return conn;
    }

}


