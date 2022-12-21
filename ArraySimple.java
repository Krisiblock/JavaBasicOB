package ArraySimple;

public class ArraySimple {
    public static void main(String[] args) {
        String nombres[] = new String [5];
        nombres[0] = "Maria";
        nombres[1] = "Juan";
        nombres[2] = "Pepe";
        nombres[3] = "Lucia";
        nombres[4] = "Pedro";

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
