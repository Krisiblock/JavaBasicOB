package vector;

import java.lang.Integer;
import java.util.Vector;

public class vectorPractica {
    public static void main(String[] args) {

        Vector<Integer> vectorEnteros = new Vector();
        vectorEnteros.add(1);
        vectorEnteros.add(4);
        vectorEnteros.add(10);
        vectorEnteros.add(13);
        vectorEnteros.add(17);

        System.out.println(vectorEnteros);
        vectorEnteros.remove(3);
        vectorEnteros.remove(2);

        System.out.println(vectorEnteros);


        //Se utiliza la funcion .get para obtener el elemento de una posicion del vector.

        System.out.println(vectorEnteros.get(1));

        /*El problema de añadir 1000 elementos con la capacidad por defecto, 10, es que cada
        a la capacidad maxima, tendrá que duplicar todos los elementos para poder crear otro
        subarray. Es por ello, que se utiliza mucha memoria y podria ir mas lenta la app.
         */

        System.out.println("Tamaño: " + vectorEnteros.size() + " Capacidad: " + vectorEnteros.capacity());
        /*
        Tener en cuenta la capacidad del vector. Se puede añadir una capacidad inicial y un incremento
        de capacidad en la inicializacion del vector.
         */

        vectorEnteros.trimToSize();

        /*
        Se utiliza el "trimToSize()", para ajustar la capacidad del vector a su tamaño. Solo
        hacerlo cuando estemos seguros de que será la capacidad maxima
         */
    }
}
