public class vehiculos {
 public double VelocidadMaxima ;
 public String marca;

 public vehiculos (double VelocidadMaxima, String marca){
    this.VelocidadMaxima = VelocidadMaxima;
    this.marca = marca;
 }

public double getVelocidadMaxima() {
    return VelocidadMaxima;
}

public void setVelocidadMaxima(double velocidadMaxima) {
    VelocidadMaxima = velocidadMaxima;
}

public String getMarca() {
    return marca;
}
 
public void setMarca(String marca) {
    this.marca = marca;
}
 
    
}