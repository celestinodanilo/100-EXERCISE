import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.print("Quando dias você ficou com o carro? ");
            Scanner sc = new Scanner(System.in);
            int dias = sc.nextInt();

            System.out.print("Quantos km você andou? ");
            double km = sc.nextDouble();

            var diaspreco = dias * 90;
            var kmpreco = km * 0.20;
            var valorfinal = diaspreco + kmpreco;

            System.out.println("Valor final: R$" + valorfinal);

        }
    }
