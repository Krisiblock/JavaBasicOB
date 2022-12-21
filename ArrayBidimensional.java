package ArrayBidimensional;

public class ArrayBidimensional {
    public static void main(String[] args) {

        int Enteros [][] = new int[2][3];
        Enteros[0][0] = 1;
        Enteros[0][1] = 4;
        Enteros[0][2] = 2;

        Enteros[1][0] = 10;
        Enteros[1][1] = 40;
        Enteros[1][2] = 20;


        for (int i=0; i < Enteros.length; i++){

            for(int j=0; j < Enteros[i].length; j++ ){

                System.out.println(" Cuando i es " + i + " , j es " + j);
                System.out.println(Enteros[i][j]);
            }
        }



    }
}
