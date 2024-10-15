public class Tablet extends Dispositivo implements conectable{
    
    public Tablet( String marca){
        super(marca);
       }
       public void encender(){
        this.estado = estados.encendido;
        System.out.println("Se encendio el dispositivo");
       }
   public void conectarWifi(){
    System.out.println("Tienes Wifi");
   }
   public void desconectarWifi(){
    System.out.println("Se el Wifi se ha desconectado");
   }
} 