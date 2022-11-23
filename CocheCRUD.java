package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public interface CocheCRUD {

    List<Coche> coches = new ArrayList<>();

    void save(Coche coche);

    List<Coche> FindAll();

    void delete(Coche coche);


}
