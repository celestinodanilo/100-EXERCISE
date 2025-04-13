import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.print("Quando dias no mês você trabalha? ");

            Scanner mes = new Scanner(System.in);
            int quantidade = mes.nextInt();

            var valor = quantidade * 200;

            System.out.println("Valor final: " + valor);
    }
    }
