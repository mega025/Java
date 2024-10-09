import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TelefonoInteligente extends Dispositivo implements conectable {
    public TelefonoInteligente(String marca) {
        super(marca);
    }

    public void encender() {
        this.estado = estados.encendido;
        System.out.println("Se encendio el dispositivo");
    }

    public void conectarWifi() {
        System.out.println("Tienes Wifi");
    }

    public void desconectarWifi() {
        System.out.println(" el Wifi se ha desconectado");
    }

    @Override
    public String toString() {
        return "La marca que has buscado es: " + marca;
    }

   
}
