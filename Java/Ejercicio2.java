package Java;
/* Hacer un programa que calcule e imprima el salario semanal 
 * de un empleado apartir de sus horas semanales trabajadas y 
 * de su salario por hora
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float Hsemales,Shora,Ssemanal;

        System.out.println("Cuanto gana por hora: ");
        Shora = entrada.nextFloat();

        System.out.println("Cuantas horas trabajo en la semana: ");
        Hsemales = entrada.nextFloat();

        Ssemanal = Hsemales * Shora;

        System.out.println("Su salario semanal es: " + Ssemanal);

        entrada.close();
    }
}
