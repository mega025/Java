public class MainInterface {

    public static void main(String[] args) {
        telefono telefonos = new telefono();
        ordenador ordenadores = new ordenador();

        telefonos.encender();
        telefonos.apagar();
        ordenadores.encender();
        ordenadores.apagar();
        telefonos.nivelBateria();
        telefonos.cargar();
        ordenadores.nivelBateria();
        ordenadores.cargar();
    }
}
 