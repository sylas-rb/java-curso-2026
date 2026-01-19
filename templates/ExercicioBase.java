/**
*CURSO: Java 2026
ALUNO: Sylas Rangel
DATA 2026-18-01
EXERCÍCIO: fundamentos de java
OBJETIVO: Aprender fundamentos do Java, como tipo primitivo, escrita das classes básicas.
*/
public class DiagnosticoInicial{                                                                  
    public static void main(String[] args){                                                      
            //String para texto humano                                                                 
            //String é uma classe, então podemos fazer algumas operações nos textos                   
            String nome;
            //Utilizano inteiro por ser um tipo primitivo, também podemos usar o short e byte para capturar numeros, mas eles são menores que o int para guarda os números
            int idade;
            //Utilizando o double para guarda números decimais maiores que o float pode não suportar                                                                                        
            double salarioInicial;                                                                     int anoTerminoFaculdade;
            String cargo = "indefinido";                                                               
            //Utilizando de if - else para uma lógica simples de cargo sobre o usuário                 
            //Utilizando println para que o próximo texto seja mostrado em baixo                      
            if (salarioInicial < 0) {
                System.out.println("Salario não pode ser negativo");
            }else if (salarioInicial >= 1600 && salarioInicial < 2000) {                                      
                System.out.println("O usuário que ser um estágiario");                                     
                cargo = "Estágiario";                                                             
           }else if (salarioInicial > 2000) {                                                                 
               System.out.println("O usuario que ser algo além de estágiario");
                   cargo = "Júnior";
           }else {
                   System.out.println("O salário maior que o tempo de experiência na área não pode    .");
            }
            System.out.println("=== MOSTRANDO OS DADOS ===");
            System.out.println("Nome = "+nome);
            System.out.println("Idade = "+idade);
            //Utilizando printf, pois ele parece com o linguagem C, então podemos modificar os     números para melhor formato
            System.out.printf("Salario = %.2f%n",salarioInicial);
            System.out.println("Cargo que quer ocupar = "+cargo);
            System.out.println("Idade para o término da faculdade = "+anoTerminoFaculdade+" ano    s");
            System.out.println();
        }
    }
