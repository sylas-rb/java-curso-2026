import java.util.Scanner;

public class ClassificadorHeroi{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int vitorias = 0;
            int derrotas = 0;
            boolean ouro = false;
            boolean ascendente = false;
            boolean imortal = false;

            while (true) {
                System.out.println("Adicione as vitórias (0 a 120)");
                try{
                    vitorias = Integer.parseInt(sc.nextLine());
                    if (vitorias < 0){
                        System.out.println("Vitorias não pode ser negativos");
                        continue;
                    }
                    break;
                }catch (Exception e){
                    System.out.println("ERRO: "+ e.getMessage());
                }
            }
            while (true) {
                System.out.println("Adicione as derrotas (0 a 120)");
                try{
                    derrotas = Integer.parseInt(sc.nextLine());
                    if (derrotas < 0) {
                        System.out.println("Derrotas não pode ser negativos.");
                        continue;
                    }
                    break;
                }catch (Exception e) {
                    System.out.println("ERROR: "+ e.getMessage());
                }
            } 
            
            if ((vitorias >= 3 && derrotas ==0) && vitorias <= 10) {
                System.out.println("+3 três vitórias consecutivas");
                ouro = true;
            } else if ((vitorias >= 10 && derrotas == 0) && vitorias <= 20) {
                System.out.println("Saldo positivo há 10 jogos");
                ascendente = true;
            } else if (vitorias >= 20 && derrotas == 0) {
                System.out.println("Invicto últimas 20");
                imortal = true;
            }

            int saldo = vitorias - derrotas;
            double  taxaVitoria = (vitorias * 100.0) / (vitorias + derrotas);
            String nivel = null;

            if (saldo <=  0) {
                nivel = "Ferro";
            } else if ((saldo >= 1 && saldo <= 20) && vitorias > 1) {
                nivel = "Bronze";
            } else if ((saldo >= 21 && saldo <= 50) && taxaVitoria  > 50) {
                nivel = "Prata";
            } else if ((saldo >= 51 && saldo <= 80) && ouro) {
                nivel = "Ouro";
            } else if ((saldo >= 81 && saldo <= 90) && derrotas < 5) {
                nivel = "Platina";
            } else if ((saldo >= 91 && saldo <= 99) && ascendente) {
                nivel = "Ascedente";
            } else if (saldo == 100 && imortal) {
                nivel = "Imortal";
            } else {
                System.out.println("Impossivel definir nível.");
            }
            

            System.out.println("=== CLASSIFICADOR DE HERÓI ===");
            System.out.println("Vitórias: "+vitorias);
            System.out.println("Derrotas: "+derrotas);
            System.out.println("Saldo: "+saldo);
            System.out.println("Nível: "+nivel);
            System.out.printf("Taxa de vitória: %.2f%%%n",taxaVitoria);
            System.out.println("-----------------------------");
        }
    }
}
