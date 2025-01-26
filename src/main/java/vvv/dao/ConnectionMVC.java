package main.java.vvv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC{

    public Connection getConnection(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vvv_projeto?useSSL=false", "root", "cefetmg092022");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void testConnection() {
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Conexão com o banco de dados foi bem-sucedida!");
            } else {
                System.out.println("Conexão com o banco de dados falhou.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao testar a conexão: " + e.getMessage());
        }
    }
    
}
