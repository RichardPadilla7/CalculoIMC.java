//Richard Padilla
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        double peso;
        double altura;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su peso (en kilogramos): ");
        peso = input.nextDouble();
        System.out.print("Ingrese su altura (en metros): ");
        altura = input.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.print("Su IMC es: " + IMC + ". Su rango de IMC es: ");

        if (IMC < 18.5) {
            System.out.print("Bajo peso");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.print("Peso normal");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.print("Sobrepeso");
        } else if (IMC >= 30) {
            System.out.print("Obesidad");
        }












    }
}
