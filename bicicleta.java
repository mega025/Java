public class bicicleta extends vehiculos{

    public String tipoBicicleta;

    public bicicleta(double VelocidadMaxima, String marca, String tipoBicicleta) {
        super(VelocidadMaxima, marca);
    this.tipoBicicleta = tipoBicicleta;
   
   

    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }   

    public void acelerar(){
        System.out.println("Acelerando bicicleta");
    }

    @Override
    public String toString() {
       
        return " Velocidad máxima del vehículo " + VelocidadMaxima + " , modelo del veículo " + marca + "tipo de bicicleta " + tipoBicicleta;
    }
}
