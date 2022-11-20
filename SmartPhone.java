package Ejercicio4;

public class SmartPhone extends SmartDevice{

    boolean camaraFrontal;
    boolean camaraTrasera;
    int mpCamaraTrasera;


    public SmartPhone (){}

    public SmartPhone(String marca, String modelo, int year, String sistemaOperativo, int capacidadMb, boolean escalaColores, double pulgadas, int duracionBateria, boolean camaraFrontal, boolean camaraTrasera, int mpCamaraTrasera) {
        super(marca, modelo, year, sistemaOperativo, capacidadMb, escalaColores, pulgadas, duracionBateria);
        this.camaraFrontal = camaraFrontal;
        this.camaraTrasera = camaraTrasera;
        this.mpCamaraTrasera = mpCamaraTrasera;
    }
}
