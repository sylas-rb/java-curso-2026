import java.util.Date;

public class TesteConfiguracao {
    public static void main(String[] args) {
        System.out.println("=== AMBIENTE CONFIGURADO ===");
        System.out.println("Data: " + new Date());
        System.out.println("Java: " + System.getProperty("java.version"));
        System.out.println("=============================");
    }
}