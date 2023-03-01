package interfaces;

import com.company.Coche;
import com.company.ElectricCar;
import interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {

        System.out.println("creando coche de carreras");
        return new ElectricCar();
    }

    @Override
    public void destruirCoche(Coche Coche) {

    }
}
