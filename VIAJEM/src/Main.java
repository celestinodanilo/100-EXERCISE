import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Quantos Km você deseja percorrer?");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();

        double preço;
            if (km < 200) {
                preço =  km * 0.50;}

            else {
                preço = km * 0.45;}

            System.out.println("O preço total de sua viajem ficara: R$" + preço);


    }
}