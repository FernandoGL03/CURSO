public class Incremento_Decremento {
    public static void main(String[] args) {
        /* El incremento es cuando a un valor en memoria le aumentamos en 1 a ese valor
         * y el decremento es cuando le restas 1 a ese valor
         */
        int valor1 = 3;
        int valor2 = 2;
        int suma;

        //Aqui le incrementamos el valor en 1, osea pasa de ser 3 a 4 y en valor2 paso de 2 a 3
        valor1 ++; 
        valor2 ++;

        suma = valor1 + valor2;
        System.out.println("La suma con incremento es: " + suma);
        
        suma --;//Aqui a suma le restamos 1 con el operador de decremento
        System.out.println("La resta es: " + suma);
    }
}
