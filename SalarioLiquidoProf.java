import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquidoProf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //limita quantas casas decimais usarei nos cálculos.
        DecimalFormat decimal = new DecimalFormat("0.00");

        /*useLocale é usado para PADRONIZAR. Os valores digitados nos campos solicitados deverão ser com ".", a fim de evitar o erro de
         * "Exception in thread "main" java.util.InputMismatchException" */
        input.useLocale(Locale.US);


        System.out.println("Digite o valor da hora trabalhada que deseja incluir no cálculo: ");
        double valorHoraTrabalhada = input.nextDouble();

        //verifica se os valores inputados estão corretos
        if(valorHoraTrabalhada <= 0){
            System.out.println("NÃO É POSSÍVEL O VALOR DA HORA TRABALHADA SER NEGATIVO OU 0, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO.");
            System.exit(0);
        }

        System.out.println("Digite quantas horas trabalhadas deseja incluir no cálculo: ");
        int horasTrabalhadas = input.nextInt();

        //verifica se os valores inputados estão corretos
        if(horasTrabalhadas < 0){
            System.out.println("IMPOSSÍVEL TRABALHAR HORAS NEGATIVAS, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO!");
            System.exit(0);
        }

        System.out.println("Digite o percentual do INSS, SEM o sinal de %: ");
      double percentualInss = input.nextDouble();


        //verifica se os valores inputados estão corretos
        if(percentualInss <= 0){
            System.out.println("É IMPOSSÍVEL O VALOR DO PERCENTUAL DO INSS SER NEGATIVO OU IGUAL A 0, TENTE NOVAMENTE E DIGITE UM VALOR VÁLIDO.");
            System.exit(0);
        }

       double salarioBruto = (valorHoraTrabalhada * horasTrabalhadas);
        double descontoInss = (percentualInss / 100) * salarioBruto;
        double salarioLiquido = (salarioBruto - descontoInss);

        System.out.printf("O salário líquido é: %.2f %n", salarioLiquido);
    }
}
