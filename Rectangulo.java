public class Rectangulo extends Figura{
    int ladoLargo;
    int ladoCorto;
    String color;
    
    public Rectangulo() {
    }
    public Rectangulo(int ladoLargo, int ladoCorto, String color) {
        this.ladoLargo = ladoLargo;
        this.ladoCorto = ladoCorto;
        this.color = color;
    }
    public int getLadoLargo() {
        return ladoLargo;
    }
    public void setLadoLargo(int ladoLargo) {
        this.ladoLargo = ladoLargo;
    }
    public int getLadoCorto() {
        return ladoCorto;
    }
    public void setLadoCorto(int ladoCorto) {
        this.ladoCorto = ladoCorto;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "El rectangulo tiene de Altura: " + ladoCorto + " , base " + ladoLargo + " y Color: " + color;
    }
}
