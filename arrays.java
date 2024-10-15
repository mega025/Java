import java.util.ArrayList;
public class arrays {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>(); 
       
       personas.add(new Persona("Santi",  19, 100));
       personas.add(new Persona("Axel",  18 ,60));
       personas.add(new Persona("Xinjie",  19, 100));
       personas.add(new Persona("Bo",  19, 70));
        

       boolean salir =  false;
       int cont = 0;

       while (!salir && cont < personas.size()) {
        if (personas.get(cont).getNombre().equals("Axel")){
        System.out.println("while:" + personas.get(cont).toString() );
        salir = true;
        }else{
            System.out.println("persona no valida: " + personas.get(cont).toString());
        }
        cont++;
       }
    }
}