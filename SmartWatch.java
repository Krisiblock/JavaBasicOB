package Ejercicio4;

public class SmartWatch extends SmartDevice{

    String colorCorrea;
    String forma;
    int numBotones;


    public SmartWatch(){}

    public SmartWatch(String marca, String modelo, int year, String sistemaOperativo, int capacidadMb, boolean escalaColores, double pulgadas, int duracionBateria, String colorCorrea, String forma, int numBotones) {
        super(marca, modelo, year, sistemaOperativo, capacidadMb, escalaColores, pulgadas, duracionBateria);
        this.colorCorrea = colorCorrea;
        this.forma = forma;
        this.numBotones = numBotones;
    }
}
