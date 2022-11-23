package Ejercicio5;

import java.util.List;

public class CocheCRUDimpl implements CocheCRUD {

    @Override
    public void save(Coche coche) {
        coches.add(coche);

    }

    @Override
    public List<Coche> FindAll() {
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
    }
}

