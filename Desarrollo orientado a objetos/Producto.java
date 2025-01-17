public class Producto{
    //Atributos
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    //Constructor
    public Producto(int id, String nombre, double precio){
        //referencias 
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.precioProducto = precio;
    }

    //Getter and sette

    public int getIdProducto(){
        return idProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public double getprecioProducto(){
        return precioProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
    return "id producto"+idProducto+"Nombre producto"+nombreProducto+"Precio Producto"+precioProducto;

    }
}