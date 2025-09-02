import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float participacion,primerExamen,segundoExamen, Examenfinal, total;

        System.out.println("Digite su nota de participacionn: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite su nota de su Primer Examen: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite su nota de su segundo examen: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite su nota de su examen final: ");
        Examenfinal = entrada.nextFloat();

        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        Examenfinal *= 0.40f;
        
        total = participacion + primerExamen + segundoExamen + Examenfinal;

        System.out.println("La nota final es: " + total);

        entrada.close();
    }
}
