package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        SmartPhone GalaxyS15 = new SmartPhone();
        GalaxyS15.marca = "Samsung";
        GalaxyS15.modelo = "Galaxy";
        GalaxyS15.capacidadMb = 1024;
        GalaxyS15.duracionBateria = 48;

        SmartPhone Iphone14Plus = new SmartPhone("Apple", "Iphone", 2022, "iOS", 1024, true, 6.9, 36, true, true, 24);

        SmartWatch Vivoactive4 = new SmartWatch("Garmin", "Vivoactiv", 2020, "Windows", 3, false, 1.3, 364, "Verde", "Cuadrado", 3);

        System.out.println(GalaxyS15.capacidadMb);
        System.out.println(Iphone14Plus.duracionBateria);
        System.out.println(Vivoactive4.pulgadas);
    }
}
