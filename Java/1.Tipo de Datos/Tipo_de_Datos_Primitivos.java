public class Tipo_de_Datos_Primitivos {
    public static void main(String[] args) {
        /*Los tipos de datos primitivos en Java que van desde 
            byte
            short
            int
            long 
        que son utilizados para guardar en memoria numeros enteros*/

        byte entero = 123;
        short entero2 = 13434;
        int entero3 = 1092982;
        long entero4 = 1974388389;

        System.out.println("Numero entero en byte es: " + entero);
        System.out.println("NUmmero entero en short es: " + entero2);
        System.out.println("NUmero entero en int es: " + entero3);
        System.out.println("Nummero entero en long es: " + entero4);

        /*Ahora vemos que para guardar datos de punto decimal 
        no se gurdan con los tipos de datos anteriores si no que se ocupan unos nuevos
        tales como:
            float
            double
        que como los anteriores guardan en memoria dotos pero ahora con punto decimal*/

        float decimal = 2.44f; //Para los float tenemos que especificarle que son float con una "f" al final
        double decimal2 = 44.32;

        System.out.println("El numero decimal en float es: " + decimal);
        System.out.println("El numero en decimal en double es: " + decimal2);

        /*Ahora veremos un nuevo tipo que son los char o caracteres que no hacen mas que
        almacenar carateres en la memoria
         */

        char letra = 'k';

        System.out.println("La letra en chart es: " + letra);

        /*Por ultimo son los Boolean que no son mas que para indicar 2 opciones
         * verdero o falso, sirven mucho para las condicionales y ciclos para mas adelante
         */

        boolean decision = true;

        System.out.println("La decision del Boolean es: " + decision);
    }
}
