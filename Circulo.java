public class Circulo extends Figura{
    int radio;
    String color;
    
    public Circulo() {
    }
    public Circulo(int radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString()  {
        return "El circulo tiene de radio  " + radio + " y Color: " + color;
    }
}
