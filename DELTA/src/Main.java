import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Valor A ");
        Scanner sc = new Scanner(System.in);
        double valorA = sc.nextDouble();
        System.out.println("Valor B ");
        double valorB = sc.nextDouble();
        System.out.println("Valor C ");
        double valorC = sc.nextDouble();
        var elevado = Math.pow(valorB, 2);

        var delta = (elevado) - 4 * (valorA * valorC);

        System.out.println("Delta: " + delta);
        }
    }
