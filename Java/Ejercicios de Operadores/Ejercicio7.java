import java.util.Scanner;

/* Construir uun programa que calcule y muestre por pantalla 
 * las raices de la ecuacion de segundo grado de coeficientes 
 * reales
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double a,b,c,raiz1,raiz2;

        System.out.println("Digite el numero de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el numero de b: ");
        b = entrada.nextDouble();
        System.out.println("Digite el numero de c: ");
        c = entrada.nextDouble();

        raiz1 = -b + Math.sqrt((b*b) - (a*c*4)) / 2*a;
        raiz2 = -b - Math.sqrt((b*b) - (a*c*4)) / 2*a;

        System.out.println("Las raices son:");
        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);

        entrada.close();
    }
}
