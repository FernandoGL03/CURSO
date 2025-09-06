import java.util.Scanner;//La libreria de la que necesita SCANNER

public class I_O_de_datos_por_consola {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);//El metodo que nos aceptara la entrada de datos por teclado

        int numero;
        float decimal;
        String cadena;
        char caracter;

        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();//Aqui indicamos que tipo de dato vamos a ingrsar en este caso de tipo int
        System.out.println("El numero es: " + numero);

        System.out.print("Digite un numero decimal: ");
        decimal = entrada.nextFloat();//Aqui un nummero Flotante
        System.out.println("El numero es: " + decimal);

        System.out.print("Escriba una cadena: ");
        cadena = entrada.next();//Aqui se guardar una cadena hasta que encuentre un espacio
        System.out.println("La cadena es: " + cadena);

        System.out.print("Escriba una letra: ");
        caracter = entrada.next().charAt(0);//Aqui se guardar una Letra
        System.out.println("La cadena es: " + caracter);

        entrada.close();
    }
}