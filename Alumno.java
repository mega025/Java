import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int edad;
    private String ciclo;
    private double notaMedia;

    public Alumno (String nombre, int edad, String ciclo, double notaMedia){
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    public Alumno(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    @Override
    public String toString() {
        return " Alumno: " + nombre  + " edad " + edad +  " ciclo que cursa el alumno: " + ciclo + " nota media del alumno: " + notaMedia;
    }

    public static void main(String[] args) {

       
       String ruta ="C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\alumnos.txt";

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
 ArrayList<Alumno> alumnos = new ArrayList<>();
    alumnos.add(new Alumno("Angela Veron", 20, "DAW",  7.1223));
    alumnos.add(new Alumno("Silvia Climent",24,"DAM",5.5));
    alumnos.add(new Alumno("Jordi Costa", 22, "DAW", 9));

    Alumno notaAlta = alumnos.get(0);
    int cont = 0;
    while (cont < alumnos.size()) {
        if (alumnos.get(cont).getNotaMedia() > notaAlta.getNotaMedia()) {
            notaAlta = alumnos.get(cont);
            System.out.println("El alumno con la nota media más alta es: " + notaAlta);
        }
        cont++;
        
    }
       
    }

}




