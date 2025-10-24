package Java.Matrices;

import javax.swing.JOptionPane;

public class Prueba1 {
    public static void main(String[] args) {
        //int [][] Numeros = {{10,66},{1,8}};

        int [][] Numeros = new int[2][2];
        
        Numeros[0][0] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        Numeros[0][1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        Numeros[1][0] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        Numeros[1][1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));

        JOptionPane.showMessageDialog(null, Numeros[0][0]);

    }
}