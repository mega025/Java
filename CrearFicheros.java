import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CrearFicheros {
    
    public static void main(String[] args) {
        
        try {
            File file = new File("C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\fichero2.txt");
            if (file.createNewFile()) {
                System.out.println("Este archivo se ha creado");
            }else{
                System.out.println("Este archivo ya existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        File file = new File("C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\fichero2.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.getMessage();
        }
       
    }

}
