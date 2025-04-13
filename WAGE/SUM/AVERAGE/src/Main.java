import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter de value: ");
        Scanner valores = new Scanner(System.in);
        double value1 = valores.nextDouble();
        double value2 = valores.nextDouble();

        var averagetotal = (value1 + value2)/2;
        System.out.println("The sum between " + value1 + " and " + value2 + " is " + averagetotal);

    }
}