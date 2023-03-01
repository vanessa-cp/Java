package interfaces;

import com.company.Coche;
import com.company.ElectricCar;
import interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche clasico");
        return new ElectricCar();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");

    }
}
