package interfaces;

import com.company.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service1 = new CocheServiceClassicImpl();


        Coche coche = service1.crearCocheDemo();





    }
}
