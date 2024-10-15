public class Cuadrado extends Figura {
    int longitud;
    String color;

    public Cuadrado(){}
    public Cuadrado(int longitud, String color){
        this.longitud = longitud;
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "El cuadrado tiene de Lado: " + longitud + " y Color: " + color ;
    }
}
 