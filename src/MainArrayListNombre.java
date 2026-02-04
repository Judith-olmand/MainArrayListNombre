import java.util.ArrayList;
import java.util.List;

public class MainArrayListNombre {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Rodrigo");
        nombres.add("Antonio");

        for(String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("***********************");
        System.out.println("Elimino a Rodrigo y añado en la posición 0 a Ismael");
        nombres.remove("Rodrigo");
        nombres.add(0,"Ismael");


        for(String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("***********************");
        System.out.println("El nombre en la posición 2 es " + nombres.get(2));
        System.out.println();

        System.out.println("La lista tiene un total de " + nombres.size() + " elementos.");

        nombres.clear();
        System.out.println("Después de CLEAR la lista tiene " + nombres.size() + " elementos.");

    }
}