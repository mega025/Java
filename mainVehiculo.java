import java.util.ArrayList;

public class mainVehiculo {
    public static void main(String[] args) {
        
        ArrayList<vehiculos> vehiculos1 = new ArrayList<>();
        coche vehiculos2 = new coche(200, "audi", 40);
        bicicleta bicicletas = new bicicleta(30, "sala", "calle");
        vehiculos1.add(new coche(200, "Audi", 40));
            vehiculos1.add(new coche(180, "Mercedes", 50));
            vehiculos1.add(new coche(200, "Audi", 45));
            vehiculos1.add(new bicicleta(50, "kaka", "montañoso"));
            vehiculos1.add(new bicicleta(45, "decathlon", "rural"));

        System.out.println(vehiculos1.toString());
        vehiculos2.acelerar();
        bicicletas.acelerar();
    }
} 
