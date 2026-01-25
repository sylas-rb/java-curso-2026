import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            double numero1;
            double numero2;
            try{
                System.out.println("Digite o primeiro número: ");
                numero1 = Double.parseDouble(sc.nextLine());

                System.out.println("Digite o segundo núemro diferente de zero: ");
                numero2 = Double.parseDouble(sc.nextLine());

                double soma = numero1 + numero2;

                double subtracao = numero1 - numero2;

                double multiplicacao = numero1 * numero2;
                
                double divisao;
                double resto;
                boolean divisaoRestoValida = true;

                if (numero2 != 0) {
                    divisao = numero1 / numero2;
                    resto = numero1 % numero2;
                } else {
                    divisaoRestoValida = false;
                    divisao = 0;
                    resto = 0;
                }
            
                System.out.println("=== RESULTADO ===");
                System.out.printf("Soma: %.2f%n", soma);
                System.out.printf("Subtração: %.2f%n", subtracao);
                System.out.printf("Multiplicação: %.2f%n", multiplicacao);
                if (divisaoRestoValida) {
                    System.out.printf("Divisão: %.2f%n", divisao);
                    System.out.printf("Resto: %.2f%n", resto);
                } else {
                    System.out.println("Não é possível divisor ou resto com número 0(ZERO).");
                }
            }catch (NumberFormatException e) {
                System.out.println("ERROR: A entrada só pode ser números, erro: "+e.getMessage());
            }catch (Exception e) {
                System.out.println("ERROR: erro inesperado - "+e.getMessage());
            }
        }
    }
}
