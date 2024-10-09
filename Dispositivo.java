import java.util.Scanner;

abstract class Dispositivo {
    public String marca;
   public estados estado;

   public Dispositivo(String marca){
    this.estado = estados.apagado;
    this.marca = marca;
   }

public String getMarca() {
    return marca;
}

public void setMarca() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingresa la marca de tu celu" );
    this.marca = scanner.nextLine();
    scanner.close();
}


abstract void encender();
   
}
