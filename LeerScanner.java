import java.io.File;
import java.util.Scanner;

public class LeerScanner {
    public static void main(String[] args) {
        String ruta ="C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\hola.txt";

        try {
            
            File archivo = new File(ruta);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNext()) 
            {
                String Linea = scanner.nextLine();
                System.out.println(Linea);
                
            }
            scanner.close();
        } catch (Exception e) {
System.out.println("Archivo no encontrado:" + e);       
 }
    }
     
}
