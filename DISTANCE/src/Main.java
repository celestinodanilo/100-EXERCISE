import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite uma distancia em metros: ");
        Scanner distancia = new Scanner(System.in);
        double distancia1 = distancia.nextDouble();

        var km = (distancia1 / 1000);
        var hm = (km * 10);
        var dam = (hm * 10);
        var dm = (dam * 100);
        var cm = (dm * 10);
        var mm = (cm * 10);




        System.out.println("A distancia de " +distancia1+ "m corresponde a:" + "km"+ km+ " hm"+hm+ " dam"+dam+ " dm"+dm+ " cm"+cm+ " mm"+mm);




    }
}