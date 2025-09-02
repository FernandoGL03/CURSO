public class Tipo_de_datos_No_Primitivos_y_Consatntes {
    public static void main(String[] args) {
        /*Los datos No primitivos no son muy deferentes a los anteriores
         * sin embargo estos nos dejan almacenar algo que mas importente se vera 
         * los nulls o null utiles para POO ademas de que a estos tipos de datos podemos
         * ocupar metodos para hacer muchas cosas.
         */

        final Integer entero = 12;//Una constante es un tipo de dato al que le asignamos un valor que no va a cambiar nunca
        Integer valor = null;
        String palabra = "Esto es una cadena";

        System.out.println("Integer almacenando un valor Constante: " + entero);
        System.out.println("Integer almacenando un: " + valor);//Si a un int le asignamos un null nos dara un error
        System.out.println(palabra);
        
    }
}
