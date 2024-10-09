import java.util.Scanner;

public class MainDispositivos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TelefonoInteligente telefonoInteligente = new TelefonoInteligente(null);
        Tablet tablet = new Tablet(null);

        telefonoInteligente.encender();
        telefonoInteligente.conectarWifi();
        telefonoInteligente.desconectarWifi();

        tablet.encender();
        tablet.conectarWifi();
        tablet.desconectarWifi();

    }
}
