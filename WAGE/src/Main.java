import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner empresa = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = empresa.nextLine();
        System.out.println("What is your salary?");
        Double salary = empresa.nextDouble();

        System.out.println("employee name: " + name);
        System.out.println("employee salary: " + salary);
    }
}