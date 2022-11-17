package Ejercicio3;

public class Concatenar {
    public static void main(String[] args) {

        String [] nombres = {"Lucia", "Anabel", "Jose", "Adrián"};

        String concat = "";
        for (String nombre : nombres){

            concat += nombre + " ";

        }
        System.out.println(concat);
    }
}
