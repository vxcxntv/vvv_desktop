import dao.ConnectionMVC;

public class TestDatabase {
    public static void main(String[] args) {
        // Testar a conexão
        System.out.println("Testando a conexão com o banco de dados...");
        ConnectionMVC.testConnection();
    }
}
