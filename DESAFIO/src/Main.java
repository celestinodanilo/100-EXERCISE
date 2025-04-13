import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Quantos cigarros por dias você fumar? ");
        Scanner sc = new Scanner(System.in);
        int cigarros = sc.nextInt();
        System.out.print("Há quantos anos você fuma? ");
        int anos = sc.nextInt();

        var minutos = cigarros * 10;
        var diasanos = anos * 365;
        var total = diasanos * minutos;
        var valorfinal = total / 1440;

        System.out.println("Você perdeu " + valorfinal+ "dias da sua vida.");



        }
    }
