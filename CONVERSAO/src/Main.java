import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Quanto R$ você tem? ");
        Scanner sc = new Scanner(System.in);
        double valor1 = sc.nextInt();

        var conversao = (valor1 / 3.45);

        System.out.println("Você pode comprar: US$" + conversao+ " de dolares");
    }
}