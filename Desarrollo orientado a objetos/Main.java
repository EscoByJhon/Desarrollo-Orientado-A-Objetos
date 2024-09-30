import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //crear una instancia de la tienda para gestionar los productos
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        //Menu principal
        do {

            System.out.println("\n Menu de la tienda");
            System.out.println("1- Agregar");
            System.out.println("2- Mostrar");
            System.out.println("3- Actualizar");
            System.out.println("4- Eliminar");
            System.out.println("5- Salir");
            System.out.println("Selecciona una opcion");

            opcion = scanner.nextInt();

                //Procesar la opcion que selecciono el cliente
                switch(opcion){
                    case 1:
                    tienda.agregarProducto();
                    break;

                    case 2:
                    tienda.mostrarProductos();
                    break;

                    case 3:
                    tienda.actualizarProducto();
                    break;

                    case 4:
                    tienda.eliminarProducto();
                    break;

                    case 5:
                        System.out.println("Saliendo del sistema...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("ingresa una opcion valida");
                }

            } while(opcion!=5);

            
        }

    }

