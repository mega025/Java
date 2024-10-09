import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.*;

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
        telefonoInteligente.setMarca();

        System.out.println(telefonoInteligente.toString());

        ArrayList<String> lista = new ArrayList<>();
        File fr = new File("C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\mis-dispositivo.txt\\");

       try {
        FileReader fileReader = new FileReader(fr);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
    
            while ((linea = bufferedReader.readLine()) != null) {
                lista.add(linea);
            }
           bufferedReader.close();
            for (String marcas : lista) {
                System.err.println(marcas);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}