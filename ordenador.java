public class ordenador implements conectable, recargable{

    public void encender(){
        System.err.println("Se enciende el ordenador");
    }
    public void apagar(){
        System.err.println("Se apaga  el ordenador");
    }
    public void cargar() {
        System.err.println("Se esta cargando  el ordenador");
    }
    public void nivelBateria(){
        System.out.println(" el ordenador tiene poca bateria");
    }
    
}
