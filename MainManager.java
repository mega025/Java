public class MainManager {

    public static void main(String[] args) {
        
        FileManager fileManager = new FileManager("C:\\Users\\ALUMNO\\Documents\\VS\\AcessoDeDatos\\archivo.txt");
        fileManager.exists();
        fileManager.importFromFile();
        fileManager.GetDataFromFile();
        fileManager.saveDataToFile();
        fileManager.verInformacion();
    }
    
}