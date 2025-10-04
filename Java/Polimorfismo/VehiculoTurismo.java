package Java.Polimorfismo;

public class VehiculoTurismo extends Vehiculo{
    private int NPuertas;

    public VehiculoTurismo(int NPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.NPuertas = NPuertas;
    }

    public int getNPuertas() {
        return NPuertas;
    }

    @Override
    public String MostrarDatos(){
        return "Matricula: " + matricula +
                "\nMarca: " + marca + 
                "\nModelo: " + modelo +
                "\nNumero de Puertas: " + NPuertas;
    }
}
