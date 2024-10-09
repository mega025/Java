import java.util.Scanner;
public class main {
    public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Hola Axel");
      System.out.println("¿Cuantos años tienes?");
      int edad = scanner.nextInt();
      if (edad >= 18) {
        System.out.println("Eres mayor de edad");
      }else{
        System.out.println("Eres menor de edad");
      }
     scanner.close();
    }
    
  }