package Ejercicio5;

public class Coche{

    String Marca;
    String Modelo;
    int caballos;

    public Coche(){}
    public Coche(String Marca){
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", caballos=" + caballos +
                '}';
    }
}
