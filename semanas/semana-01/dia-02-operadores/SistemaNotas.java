import java.util.Scanner;
/**
*CURSO: Java 2026
*ALUNO: SYLAS RANGEL
*DATA: 2026-01-24
EXERCÍCIO: SISTEMA DE NOTAS ESCOLARES
OBJETIVO: Dominar if-else aninhados, operadores lógicos e validação de entrada.
*/

public class SistemaNotas{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
           double notas = capturarNotas(sc);
           String classificacao = tabelaClassificacao(notas);
           imprimirNotas(notas, classificacao);
        }
    }
    public static double capturarNotas(Scanner sc){
        while (true) {
            double notasDouble = 0; 
            System.out.println("Adicione a nota de 0 a 10:");
            String notasStr = sc.nextLine().trim();
            if (notasStr.equals("")) {
                System.out.println("Entrada não pode ser vazia, por favor verifique a entrada e digite novemante.");
                continue;
            }
            if (notasStr.contains(",")) {
                notasStr = notasStr.replace(",",".");
            }
            try{
                notasDouble = Double.parseDouble(notasStr);
                if (notasDouble < 0 || notasDouble > 10) {
                    throw new IllegalArgumentException();
                }
                return notasDouble;
            }catch (NumberFormatException e) {
                System.out.println("Entrada inválida, por favor digite somente números.");
            }catch (IllegalArgumentException e){
                System.out.println("Notas fora do intervalo permitido, por favor digite a nota que estaja entre 0 à 10.");
            }catch (Exception e) {
                System.out.println("ERRO: não foi possível capturar a entrada, vefirique novamente.");
            }
        }
    }
    public static String tabelaClassificacao(double notas){
        String conceito = "";
        String mencoesEspeciais = "";
        if (notas >= 0.0 && notas <= 3.9) {
            conceito = "D - Insuficiente";
            if (notas ==  0) {
                mencoesEspeciais = "Precisa de ajuda urgente!";
            }
        }else if (notas >= 4.0 && notas <= 4.9) {
            conceito = "D - Insuficiente";
            mencoesEspeciais = "Recuperação possível";
        }else if (notas >= 5.0 && notas <= 6.9) {
            conceito = "C - Regular";
        }else if (notas >= 7.0 && notas <= 8.9) {
            conceito = "B - Bom";
        }else if (notas >= 9.0 && notas <= 10.0) {
            conceito = "A - Excelente";
            if (notas == 10.0) {
                mencoesEspeciais = "Perfeito!";
            }
        }


        if (mencoesEspeciais.equals("")) {
            return "Conceito: " + conceito;
        }else{
            return "Conceito: " + conceito +", Menções Especiais: "+ mencoesEspeciais;
        }
    }
    public static void imprimirNotas(double notas, String classificacao){
        System.out.println("=== SISTEMA DE NOTAS ===");
        System.out.println("Nota: " + notas);
        System.out.println(classificacao);
        System.out.println("------------------------");
    }
}
