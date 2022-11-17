package Ejercicio2;

public class PreciIva {
    public static void main(String[] args) {

        System.out.println(PrecioFinal(48));

    }
    static double PrecioFinal(int Precio){
        double precioIva = Precio * 1.21; //1.21 es el incrementod el I.V.A.
        return precioIva;
    }
}
