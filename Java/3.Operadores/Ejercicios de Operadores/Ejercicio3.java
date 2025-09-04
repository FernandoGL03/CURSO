/* Guillermo tiene N dolares. Luis tiene la mitad de
 * lo que posse Guillermo. Juan tiene la mitad de lo que possen Luis y Guillermo
 * juntos. Hacer un programa que calcule e imprima la cantidad de dinero que 
 * tienen entre los tres.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float Guillermo, Juan, Luis, total;

        System.out.println("Cuanto dinero tiene Guillermo: ");
        Guillermo = entrada.nextFloat();
        Luis = Guillermo/2;
        Juan = (Guillermo + Luis) / 2;
        total = Guillermo + Luis + Juan;

        System.out.println("El dinero entre los tres es: " + total);

        entrada.close();
    }
}
