import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa dos números enteros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        try {
            int resultado = dividir(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}