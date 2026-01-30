import java.util.Scanner;

/**
*CURSO: Java 2026
*ALUNO: SYLAS RANGEL
*DATA: 2026/01/28
EXERCÍCIO: SWITCH-CASE E MANIPULAÇÃO DE STRINGS
OBJETIVO: ESTRUTURA DE DECISÃO AVANÇADAS E MANIPULAÇÃO DE TEXTO
*/

public class ConversorConceitos {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            char letra;
            char simbolo;
            double resultado;
            double variacao;


            String letraSimbolo = entradaUsuario(sc);
            if (letraSimbolo.length() >  1){
                letra = letraSimbolo.toUpperCase().charAt(0);
                simbolo = letraSimbolo.charAt(1);
                resultado = conversorTabela(letra);
                imprimirValores(resultado, simbolo);
            } else {
                letra = letraSimbolo.toUpperCase().charAt(0);
            }
            resultado = conversorTabela(letra);
            imprimirValores(resultado, '');
        }
        
    }

    public static String entradaUsuario(Scanner sc) {
        while(true) {
            System.out.println("Informe a letra que o usuário tirou (A a D): ");
            
            String entrada = sc.nextLine().trim();


            if (entrada.isEmpty()) {
                System.out.println("A entrada não pode ser vazia, por favor informe a letra.");
                continue;
            }
            if (entrada.length() > 2) {
                System.out.println("A entrada so pode ser uma letra e/ou um simbolo de mais ou menos, por favor digite novamente a letra.");
                continue;
            }
            if (!entrada.matches("[a-dA-d][-+]?")) {
                System.out.println("A letra está fora do parâmetro pedido, por favor digite entre A a D.");
                continue;
            }
            return entrada;
        }
    }
    public static double conversorTabela(char letra){
        double pontos = 0;

        switch (letra) {
            case 'A':
                pontos = 4.0;
                break;
            case 'B':
                pontos = 3.0;
                break;
            case 'C':
                pontos = 2.0;
                break;
            case 'D':
                pontos = 1.0;
                break;
            default:
                System.out.println("ERRO: conceito inválido. Use A, B, C ou D.");
        }
        return pontos;
    }
    public static void imprimirValores(double resultado, char simbolo){

        if (simbolo == '+') {}
        }
    }
}
