package arrayList;

import java.util.ArrayList;

public class arrayListInt {
    public static void main(String[] args) {

        ArrayList<Integer> enteros = new ArrayList<>();


        enteros.add(1);

        for (int i = 0; i < enteros.size(); i++ ){
            enteros.add(i + 2);
            if (i == 9){
                break;
            }
            System.out.println(enteros);
        }
        System.out.println("Aqui se quitan los pares");

        for (int i = 0; i < enteros.size(); i++) {
            if (i % 2 == 0) {
                enteros.remove(i);
            }

        }
        System.out.println(enteros);



    }
}
