package Ejercicio4;

public class SmartDevice {

    String marca;
    String modelo;
    int year;
    String sistemaOperativo;
    int capacidadMb;
    boolean escalaColores;
    double pulgadas;
    int duracionBateria;


    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, int year, String sistemaOperativo, int capacidadMb, boolean escalaColores, double pulgadas, int duracionBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadMb = capacidadMb;
        this.escalaColores = escalaColores;
        this.pulgadas = pulgadas;
        this.duracionBateria = duracionBateria;
    }
}
