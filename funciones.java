public class funciones {

    public static void HelloWordd() {
        System.out.println("Hola mundo");
    }
    public static boolean esVerdadero(String palabra){
        if (palabra.equals("Lunes")) 
            return true;
            else
            return false;
        
    }
    public static void main(String[] args) {
        HelloWordd();
        boolean esLunes = esVerdadero("Lunes");
        System.out.println("Es Lunes" + esLunes);
    }
}
 