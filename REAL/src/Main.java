import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor: ");
        Scanner valor = new Scanner(System.in);
        double valor1 = valor.nextDouble();
        var dobro = valor1 * 2;
        var terceiro = valor1 / 3;

        System.out.println("O dobro de " + valor1 + " é: " + dobro + " e a terça parte é: " + terceiro);
        }
    }
