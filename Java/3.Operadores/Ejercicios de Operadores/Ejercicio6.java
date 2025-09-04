/* Construir un programa que dado un numero total de horas
 * devuelve el numero de semanas, dias y horas equivalentes.
 * Por ejemplo, dado un total de 1000 horas debe mostra 5 semanas, 6 dias y 16 horas.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Htotales, semanas,dias,horas;

        System.out.println("Digite el numero totales de horas: ");
        Htotales = entrada.nextInt();

        semanas = Htotales / 168;
        dias = Htotales%168 / 24;
        horas = Htotales%24;

        System.out.println("El quivalente es:");
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);

        entrada.close();
    }
}
