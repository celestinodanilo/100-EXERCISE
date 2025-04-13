import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome? ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println("Qual seu sexo? ");
        String sexo = sc.nextLine();

        System.out.println("Quanto deu sua compra? ");
        double compra = sc.nextDouble();

        var desconto2 = compra * 0.05;
        var preçohomem = compra - desconto2;
        var desconto1 = compra * 0.13;
        var preçomulher = compra - desconto1;

        if (sexo.equalsIgnoreCase("feminino")){
            System.out.println("Sua compra com o deconto deu um total de: "+preçomulher);
        }
        if (sexo.equalsIgnoreCase("masculino")){
            System.out.println("Sua compra com o deconto deu um total de: "+preçohomem);
        }

    }
}