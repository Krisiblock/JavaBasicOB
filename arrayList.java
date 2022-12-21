package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> nombresOficinaA = new ArrayList<>();

        nombresOficinaA.add("Pepe");
        nombresOficinaA.add("Juan");
        nombresOficinaA.add("Elisa");
        nombresOficinaA.add("Maria");

        System.out.println(nombresOficinaA);


        LinkedList<String> listaEnlazada = new LinkedList<>(nombresOficinaA);

        listaEnlazada.removeFirst();
        listaEnlazada.set(2, "Antonio");

        System.out.println(listaEnlazada);


    }
}
