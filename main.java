package Ejercicio5;

public class main {
    public static void main(String[] args){

        CocheCRUD CocheCRUD = new CocheCRUDimpl();

        Coche Toyota = new Coche();

        CocheCRUD.save(new Coche ("Mercedes"));
        CocheCRUD.save(new Coche ("Lamborgini"));

        CocheCRUD.FindAll();


        System.out.println(CocheCRUD.FindAll());
    }

}
