package br.com.programaçãodecomputadores;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculoTerreno {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        /*useLocale é usado para PADRONIZAR. OS valores digitados nos campos largura e comprimento deverão ser com ".", a fim de evitar o erro de
        * "Exception in thread "main" java.util.InputMismatchException" */
        input.useLocale(Locale.US);

        System.out.println("Digite a largura do terreno: ");
        float largura = input.nextFloat();

        if(largura <= 0){
            System.out.println("IMPOSSÍVEL UM TERRENO TER TAMANHO MENOR OU IGUAL A 0, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO.");
            System.exit(0);//faz a verificação do valor largura, se for <= a 0, encerra o programa.
        }

        System.out.println("Digite o comprimento do terreno: ");
        float comprimento = input.nextFloat();

        if(comprimento <= 0){
            System.out.println("IMPOSSÍVEL UM TERRENO TER TAMANHO MENOR OU IGUAL A 0, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO.");
            System.exit(0);  //faz a verificação do valor comprimento, se for <= a 0, encerra o programa.
        }


        System.out.println("O terreno é um retângulo? Digite S para SIM ou N para NÃO");
        char verificarRetangulo = input.next().charAt(0);

        if (verificarRetangulo == 'S') {
            System.out.println("Ótimo, é um retângulo!, abaixo estão informações sobre o terreno informado: ");
            System.out.println("A largura é: " + largura);
            System.out.println("O comprimento é: " + comprimento);
            System.out.println("A área do terreno é " + (largura * comprimento) + "m²");
            System.out.println("O perímetro do terreno é " + 2 * (largura + comprimento) + "m²");

        } else {
            System.out.println("Não é um retângulo, abaixo estão informações sobre largura e comprimento: ");
            System.out.println("O comprimento é: " + comprimento + "m²");
            System.out.println("A largura é: " + largura + "m²");
        }
    }
}
