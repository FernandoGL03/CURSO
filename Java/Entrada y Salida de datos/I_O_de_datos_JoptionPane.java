import javax.swing.JOptionPane;

public class I_O_de_datos_JoptionPane {
    public static void main(String[] args) {
        
        String cadena;
        int entero;
        double decimal;
        char caracter;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("DIgite un decimal: "));

        JOptionPane.showMessageDialog(null,"La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null," El entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+ caracter);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        
    }
}
