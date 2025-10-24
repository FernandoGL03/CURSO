package Java.Matrices;

import javax.swing.JOptionPane;

public class Prueba1 {
    public static void main(String[] args) {

        //int [][] MatrizA = {{10,66},{1,8}};

        int [][] MatrizA = new int[2][2];
        int [][] MatrizB = new int[2][2];
        int [][] MatrizRes = new int[2][2];

        /*MatrizA[0][0] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        MatrizA[0][1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        MatrizA[1][0] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        MatrizA[1][1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        JOptionPane.showMessageDialog(null,"{"+MatrizA[0][0]+" "+MatrizA[0][1]+"\n"+MatrizA[1][0]+" "+MatrizA[1][1]+"}");*/

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA.length; j++)
                MatrizA[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los datos de la matrizA")); 
            }
        for (int i = 0; i < MatrizA.length; i++) {
            for(int j = 0; j < MatrizA.length; j++)
                JOptionPane.showMessageDialog(null, MatrizA[i][j]);
            }
        for (int i = 0; i < MatrizB.length; i++) {
            for (int j = 0; j < MatrizB.length; j++)
                MatrizB[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los datos de la matrizB")); 
            }
        for (int i = 0; i < MatrizB.length; i++) {
            for(int j = 0; j < MatrizB.length; j++)
                JOptionPane.showMessageDialog(null, MatrizB[i][j]);
            }

        for (int i = 0; i < MatrizRes.length; i++) {
            for (int j = 0; j < MatrizRes.length; j++)
                    MatrizRes[i][j]=MatrizA[i][j]+MatrizB[i][j];           
            }
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma de la matrizA y matrizB es: ");

        for (int i = 0; i < MatrizRes.length; i++) {
            for (int j = 0; j < MatrizRes.length; j++) {
                JOptionPane.showMessageDialog(null, MatrizRes[i][j]);  
            }
        }
    }
}