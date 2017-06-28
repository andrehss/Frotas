package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexao {
    
     public Connection con;
     
    public Conexao() {

    try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.print("Erro"+ ex.getMessage());
        }
     String url="jdbc:mysql://localhost/frotas";
     String user="root";
     String password="12345";

        try {
            con = DriverManager.getConnection(url, user, password);
           

        } catch (SQLException ex) {
            System.out.print("Erro"+ ex.getMessage());
        }
}
    
    
    
}