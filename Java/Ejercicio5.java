package Java;
/* Hacer un programa que calcule el 
 * cuadrado de una suma 
 * (a+b)^2 = a^2 + b^2 + 2ab
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float a,b,resultado;
        
        System.out.println("Digite el primer numero: ");
        a = entrada.nextFloat();
        System.out.println("Digite el segundo numero: ");
        b = entrada.nextFloat();

        resultado = a*a + b*b + (a*b)*2;

        System.out.println("El resultado es: " + resultado);
        entrada.close();
    }
}
