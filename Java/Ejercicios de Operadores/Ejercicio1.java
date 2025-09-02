/*Hacer un programa que calalcule la e imprima 
la suma de tres calificaciones*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float calf1, calf2, calf3, suma;

        System.out.println("Escriba sus tres calficaciones: ");
        calf1 = entrada.nextFloat();
        calf2 = entrada.nextFloat();
        calf3 = entrada.nextFloat();

        suma = calf1 + calf2 + calf3;

        System.out.println("La suma de los tres promedios es: " + suma);

        entrada.close();
    }
}
