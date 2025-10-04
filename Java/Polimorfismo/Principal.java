package Java.Polimorfismo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

// Clase Principal para la demostración
public class Principal {

    // Método estático para solicitar datos comunes a todos los vehículos
    public static String[] pedirDatosComunes() {
        String matricula = JOptionPane.showInputDialog(null, "Ingrese la matrícula:", "Datos Comunes", JOptionPane.QUESTION_MESSAGE);
        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca:", "Datos Comunes", JOptionPane.QUESTION_MESSAGE);
        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo:", "Datos Comunes", JOptionPane.QUESTION_MESSAGE);
        
        // Se devuelve un array con los tres valores
        return new String[]{matricula, marca, modelo};
    }

    public static void main(String[] args) {
        
        // Creamos una lista polimórfica: la referencia es Vehiculo, pero contendrá objetos de las clases hijas.
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // 1. CREAR VEHICULO TURISMO
        JOptionPane.showMessageDialog(null, "A continuación, ingrese los datos para el VEHÍCULO TURISMO.", "Vehículo Turismo", JOptionPane.INFORMATION_MESSAGE);
        String[] datosTurismo = pedirDatosComunes();
        String sNpuertas = JOptionPane.showInputDialog(null, "Ingrese el número de puertas:", "Vehículo Turismo", JOptionPane.QUESTION_MESSAGE);
        
        try {
            int nPuertas = Integer.parseInt(sNpuertas);
            // Creamos el objeto e_INSTANCIAMOS_como_clase_hija, pero la referencia se guarda en el ArrayList de clase padre (Polimorfismo).
            vehiculos.add(new VehiculoTurismo(nPuertas, datosTurismo[0], datosTurismo[1], datosTurismo[2]));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El número de puertas debe ser un número entero. Se omitirá este vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // 2. CREAR VEHICULO DEPORTIVO
        JOptionPane.showMessageDialog(null, "A continuación, ingrese los datos para el VEHÍCULO DEPORTIVO.", "Vehículo Deportivo", JOptionPane.INFORMATION_MESSAGE);
        String[] datosDeportivo = pedirDatosComunes();
        String sCilindrada = JOptionPane.showInputDialog(null, "Ingrese la cilindrada (cc):", "Vehículo Deportivo", JOptionPane.QUESTION_MESSAGE);

        try {
            int cilindrada = Integer.parseInt(sCilindrada);
            vehiculos.add(new VehiculoDeportivo(cilindrada, datosDeportivo[0], datosDeportivo[1], datosDeportivo[2]));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La cilindrada debe ser un número entero. Se omitirá este vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // 3. CREAR VEHICULO FURGONETA
        JOptionPane.showMessageDialog(null, "A continuación, ingrese los datos para la FURGONETA.", "Vehículo Furgoneta", JOptionPane.INFORMATION_MESSAGE);
        String[] datosFurgoneta = pedirDatosComunes();
        String sCarga = JOptionPane.showInputDialog(null, "Ingrese la capacidad de carga (kg):", "Vehículo Furgoneta", JOptionPane.QUESTION_MESSAGE);

        try {
            int carga = Integer.parseInt(sCarga);
            vehiculos.add(new VehiculoFurgoneta(carga, datosFurgoneta[0], datosFurgoneta[1], datosFurgoneta[2]));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: La capacidad de carga debe ser un número entero. Se omitirá este vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // ---------------------------------------------------------------------
        // Mostrar Datos (Demostración de Polimorfismo)
        // ---------------------------------------------------------------------
        
        StringBuilder reporte = new StringBuilder("--- REPORTE DE VEHÍCULOS ---\n\n");
        
        // Iteramos sobre la lista de objetos de tipo 'Vehiculo'.
        // Al llamar a 'MostrarDatos()', Java determina automáticamente qué versión del método
        // usar (si la de Turismo, Deportivo o Furgoneta) basándose en la clase real del objeto.
        for (Vehiculo v : vehiculos) {
            // El polimorfismo permite llamar al método 'MostrarDatos' sin saber el tipo exacto
            // del objeto, y se ejecuta la versión sobrescrita correcta.
            reporte.append(v.MostrarDatos()).append("\n--------------------------\n");
        }

        // Imprimir todos los datos recopilados
        JOptionPane.showMessageDialog(null, reporte.toString(), "Resultados del Polimorfismo", JOptionPane.PLAIN_MESSAGE);
    }
}