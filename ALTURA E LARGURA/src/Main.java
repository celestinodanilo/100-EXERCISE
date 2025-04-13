import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Qual a largura da parede que deseja pintar? ");
        Scanner largura = new Scanner(System.in);
        double largura1 = largura.nextDouble();
        System.out.println("Qual a altura da parede que deseja pintar? ");
        double altura1 = largura.nextDouble();

        var area = largura1 * altura1;
        var tinta = area / 2;

        System.out.println("A area de sua parede é de: " + area + " para pintar sua parede inteira precisara de: " + tinta +" litros de tinta");
    }
}

//