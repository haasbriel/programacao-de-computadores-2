import java.util.Locale;
import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*useLocale é usado para PADRONIZAR. Os valores digitados nos campos solicitados deverão ser com ".", a fim de evitar o erro de
         * "Exception in thread "main" java.util.InputMismatchException" */
        input.useLocale(Locale.US);

        System.out.println("Digite a nota do trabalho de laboratório: ");
        float notaDoLaboratorio = input.nextFloat();

        //verifica os valores digitados
        if (notaDoLaboratorio < 0){
            System.out.println("IMPOSSIVEL UMA NOTA SER MENOR QUE 0, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO.");
            System.exit(0);
        }

        System.out.println("Agora digite a nota da avaliação semestral:");
        float notaDaAvaliacaoSemestral = input.nextFloat();

        //verifica os valores digitados
        if (notaDaAvaliacaoSemestral < 0){
            System.out.println("IMPOSSIVEL UMA NOTA SER MENOR QUE 0, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO.");
            System.exit(0);
        }

        System.out.println("Por fim, digite a nota do exame final");
        float notaDoExameFinal = input.nextFloat();

        //verifica os valores digitados
        if (notaDoExameFinal< 0){
            System.out.println("IMPOSSIVEL UMA NOTA SER MENOR QUE 0, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO.");
            System.exit(0);
        }

        float calcularMediaPonderada = ((notaDoLaboratorio * 2) + (notaDaAvaliacaoSemestral * 3) +(notaDoExameFinal * 5)) / (2 + 3 + 5);
        System.out.println(calcularMediaPonderada);

        if(calcularMediaPonderada >= 0 && calcularMediaPonderada <5){
            System.out.println("A média final é " + calcularMediaPonderada + " e o conceito é E");
        } else if (calcularMediaPonderada >= 5 && calcularMediaPonderada < 6) {
            System.out.println("A média final é " + calcularMediaPonderada + " e o conceito é D");
            
        } else if (calcularMediaPonderada >= 6 && calcularMediaPonderada < 7) {
            System.out.println("A média final é " + calcularMediaPonderada + " e o conceito é C");
            
        } else if (calcularMediaPonderada >= 7 && calcularMediaPonderada < 8) {
            System.out.println("A média final é " + calcularMediaPonderada + " e o conceito é B");
            
        } else if (calcularMediaPonderada >=8 && calcularMediaPonderada <= 10) {
            System.out.println("A média final é " + calcularMediaPonderada + " e o conceito é A");

        }

    }
}
