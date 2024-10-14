import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    String ruta;
    ArrayList<Figura> arrayFiguras;
    
    public FileManager(){}

    public FileManager(String ruta){
        this.ruta = ruta;
        this.arrayFiguras = arrayFiguras;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public ArrayList<Figura> getArrayFiguras() {
        return arrayFiguras;
    }

    public void setArrayFiguras(ArrayList<Figura> arrayFiguras) {
        this.arrayFiguras = arrayFiguras;
    }
    
    public boolean exists(){
        File file = new File(ruta);
        if (file.exists()) {
            return true;
        }else{
            return false;
        }
    }

    public void importFromFile(){
        File file = new File(ruta);
        ArrayList<Figura> arrayList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\archivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            String delimitador = " ";
            while ((linea = bufferedReader.readLine()) != null) {
            String [] figura = new String[5];
            figura = linea.split(delimitador);

            if (figura.length < 4) {
                System.out.println("No valido");
            }

            if (figura[0].equals("Rectangulo")) {
                Rectangulo rectangulo = new Rectangulo();                
                
                rectangulo.setLadoCorto(Integer.parseInt(figura[1]));
                rectangulo.setLadoLargo(Integer.parseInt(figura[3]));

                try {
                    rectangulo.setColor(figura[5]);
                } catch (Exception e) {
                    System.out.println("ERROR CON EL COLOR");
                }
                arrayList.add(rectangulo);

            }if (figura[0].equals("Circulo")) {
                Circulo circulo = new Circulo();
                circulo.setRadio(Integer.parseInt(figura[2]));

                try {
                    circulo.setColor(figura[4]);
                } catch (Exception e) {
                 System.out.println("ERROR CON EL COLOR");
                }
                 arrayList.add(circulo);
            }if (figura[0].equals("Cuadrado")) {
                Cuadrado cuadrado = new Cuadrado();
                cuadrado.setLongitud(Integer.parseInt(figura[2]));

                try {
                    cuadrado.setColor(figura[3]);
                } catch (Exception e) {
                    System.out.println("ERROR CON EL COLOR");
                }
                arrayList.add(cuadrado);
            } 
               
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.arrayFiguras = arrayList;
    }


    public void GetDataFromFile () {
        File file = new File(ruta);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String linea;

            while((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


     public void saveDataToFile() {
        File file = new File("C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\resultado.txt");

        if (file.exists()) {}
        else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(arrayFiguras.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void verInformacion () {
        for (Figura figura : arrayFiguras) {
            System.out.println(figura.toString());
        }
    }
}


