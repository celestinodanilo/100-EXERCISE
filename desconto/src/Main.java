import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o valor de seu produto: ");
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        double promoção = valor * 0.05;
        var valorfinal = valor - promoção;

        System.out.println("Valor final: " + valorfinal);
        }
    }
