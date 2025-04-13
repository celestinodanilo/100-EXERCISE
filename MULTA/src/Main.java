import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Qual a velocidade em que você passou com o carro? ");

        Scanner sc = new Scanner(System.in);
        int velocidade = sc.nextInt();
        if (velocidade > 80) {
            var excesso = velocidade - 80;
            var multa = excesso * 5;
            System.out.println("Você foi multado por excesso de velocidade, com um total de: " + multa);
        }
        else System.out.println("Você esta dentro da velocidade, boa viajem");
    }
}