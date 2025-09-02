package Java.Operadores;

import java.util.Scanner;

public class Operadores_logicos {
    public static void main(String[] args) {
    
    /* Los operadores logicos no son mas que 
     * las operaciones que vamoas a realizar ya sea
     * sumas, restas, multiplicacion, division y resto o residuo
    */

    Scanner entrada = new Scanner(System.in);

    float num1,num2,suma,resta,multiplicacion,division,resto;

    System.out.print("Digite el primer numero: ");
    num1 = entrada.nextFloat();
    System.out.print("Digite el segundo numero: ");
    num2 = entrada.nextFloat();
    
    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = num1 / num2;
    resto = num1 % num2;

    System.out.println("El resultado de cada operacion es: ");
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Multiplicacion: " + multiplicacion);
    System.out.println("Division: " + division);
    System.out.println("Resto o residuo: " + resto);

    entrada.close();
    }
    
}
