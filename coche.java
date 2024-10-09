public class coche  extends vehiculos{
     
    private int capacidadCombustible;

    public coche(double VelocidadMaxima, String marca, int capacidadCombustible) {
        super(VelocidadMaxima, marca);
        this.capacidadCombustible = capacidadCombustible;
    }
   

  
    public void acelerar(){
        System.out.println("Acelerando coche");
    }


    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }


    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }
    @Override
 public String toString() {
    
     return " Velocidad máxima del vehículo " + VelocidadMaxima + " , modelo del veículo " + marca + "capacidad de combustible  " + capacidadCombustible;
 }
}
