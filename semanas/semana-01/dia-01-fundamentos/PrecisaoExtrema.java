/**
*CURSO: Java 2026
ALUNO: Sylas Rangel
DATA 2026-18-01
EXERCÍCIO: Precisão Extrema
OBJETIVO: Aprender a ser preciso com Java
*/
public class PrecisaoExtrema {
        public static void main(String[] args) {
                System.out.println("=== EXERCÍCIO DE PRECISÃO ===");
                
                //1. VARIÁVEIS
                String nome = "Sylas";
                int idade = 26;
                double altura = 1.79;
                boolean estudante = true;
                char inicial = 's';
                
                //2.IMPRIMIR VARIÁVEIS
                System.out.println("Nome: "+ nome);
                System.out.println("Idade: "+ idade + " anos");
                System.out.println("Altura: "+ altura + "m");
                System.out.println("È estudante: "+ estudante);
                System.out.println("Inicial: "+ inicial);
                
                //3.CONDICIONAIS SIMPLES
                if (idade >= 18) {
                    System.out.println("MAIOR de idade");
                } else {
                    System.out.println("MENOR de idade");
                }
                
                //4.CONDICIONAL COM ELSE IF
                if (altura < 1.60) {
                    System.out.println("Abaixo da média");
                } else if (altura >= 1.60 && altura <= 1.80) {
                    System.out.println("Altura média");
                } else {
                    System.out.println("Acima da média");
                }
                
                //5.CÁLCULO SIMPLES
                double pesoIdeal = (altura * 100 - 100) * 0.9;
                System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);

                System.out.println("=== FIM DO EXERCÍCIO ===");
            }
    }
