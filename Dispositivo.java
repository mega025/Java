abstract class Dispositivo {
    public String marca;
   public estados estado;

   public Dispositivo(String marca){
    this.estado = estados.apagado;
    this.marca = marca;
   }


abstract void encender();
   
}
