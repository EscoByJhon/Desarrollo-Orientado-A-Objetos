import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    
    //Atributos ArrayList Scanner
    private ArrayList <Producto> productos;
    //Declarar Scanner como atributo
    private Scanner scanner;

    //Contructor que inicialisa la lista y scanner
    public Tienda(){
        productos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    //metodo para agregar un producto
    public void agregarProducto(){
        System.out.println("ingrese el id de producto");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();

    //Crear un producto nuevo y añadirlo a la lista
        Producto producto = new Producto(id, nombre, precio);

    //Agrego a la lista
        productos.add(producto);
        System.out.println("Producto agregado correctamente");
    }
    //metodo para listar productos
    public void mostrarProductos(){
        //evaluo si hay productos vacios
        if(productos.isEmpty()){
            System.out.println("No hay productos agotados por cyber");
        }else{
            for(Producto producto : productos){
                System.out.println(producto);
            }
        }
    }
    //metodo para actualizar un producto id
    public void actualizarProducto(){
        System.out.println("Ingresa el id de producto para actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();

        //Buscar prodructo por id
        for(Producto producto : productos){
            if(producto.getIdProducto()==id){
                System.out.println("Ingrese el nuevo nombre del producto");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese el nuevo precio de producto");
                double nuevoPrecio = scanner.nextDouble();

                //Actualizar los datos
                producto.setNombreProducto(nuevoNombre);
                producto.setPrecioProducto(nuevoPrecio);
                System.out.println("Producto actualizado");
                return;

            }
        }

        System.out.println("producto no encontrado");
    }
    //metodo para eliminar un producto con id
    public void eliminarProducto(){
        System.out.println("ingresa el id del producto que quieras eliminar");
        int id = scanner.nextInt();

        //busco en la lista
        Producto productoEliminar = null;
        for(Producto producto : productos){
            if(producto.getIdProducto()== id){
                productoEliminar = producto;
            }
        } 

        //Eliminar el producto
        if (productoEliminar !=null) {
            productos.remove(productoEliminar);
            System.out.println("Producto eliminado");
        }else{
            System.out.println("Product no encontrado");
            
        }
    }

}
