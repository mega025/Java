import java.util.ArrayList;

public class tienda {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Manzana", 1.99, 100));
        productos.add(new Producto("Patata", 2.49, 200));
        productos.add(new Producto("Zanahorias", 2.99, 150));
        productos.add(new Producto("Peras", 1.99, 100));
        productos.add(new Producto("Berenjenas", 2.89, 75));
    
        System.out.println(productos.toString());
        int count = 0;
       for (Producto producto : productos) {

            System.out.println(productos.get(2));
            producto.setCantidad(100);
            producto.setPrecio(2.89);
        
        
        count++;
       }
             
    
        productos.remove(3);
        System.out.println(productos.toString());
        }
  }
