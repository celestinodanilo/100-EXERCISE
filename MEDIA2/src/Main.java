import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.print("Digite sua primeira nota: ");
            Scanner sc = new Scanner(System.in);
            int nota = sc.nextInt();
            System.out.print("Digite sua segunda nota: ");
            int nota2 = sc.nextInt();

            var media = (nota + nota2) / 2;

            System.out.print("Sua media é de: " + media);

                if (media >= 7) {
                    System.out.println(" Você teve um bom aproveitamento!");
                }
                else {
                    System.out.println(" Você não teve um bom aproveitamento!");
                }
    }
}