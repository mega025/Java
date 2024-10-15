public class trabajandoConClases extends Persona{



    public static void main(String[] args) {
        Persona persona1 = new Persona("xinjie", 15, 100);
        Persona persona2 = new Persona("santiago", 10, 200);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getPeso());
        
        System.out.println();

        System.out.println(persona2.toString());


    }  
} 