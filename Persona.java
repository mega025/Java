public class Persona {
   public String nombre ;
    public  int edad ;
    public double peso;
    
    public Persona(){

    }
    public Persona(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad; 
    }
    public double getPeso() {
        return peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return " [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
    }
    
}
