import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner valor = new Scanner(System.in);
        int valor1 = valor.nextInt();

        int antecessor = valor1 - 1;
        int sucessor = valor1 + 1;

        System.out.println("the predecessor of " + antecessor + " is " + sucessor);
    }
}