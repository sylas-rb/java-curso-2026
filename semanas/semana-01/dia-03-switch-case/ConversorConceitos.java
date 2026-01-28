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
            char letra = entradaUsuario(sc);
        }
        
    }

    public static char entradaUsuario(Scanner sc) {
        while(true) {
            System.out.println("Informe a letra que o usuário tirou: ");
            
            string entrada = sc.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println("A entrada não pode ser vazia, por favor informe a letra.");
                continue;
            }
            if (entrada.length() > 2) {
                System.out.println("A entrada so pode ser um caracter, por favor digite novamente a letra.");
                continue;
            }
        }
    }
}
