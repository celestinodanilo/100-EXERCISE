import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("Digite um numero: ");
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Seu numero é par");
            }
            else {
                System.out.println("Seu numero é impar");
            }
    }
}