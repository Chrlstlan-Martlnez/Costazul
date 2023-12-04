package pruebascostazul;

public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;
    
    public Producto(String nombreProducto, int precioProducto){
        nombre = nombreProducto;
        precio = precioProducto;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int n){
        cantidad = n;
    }
}
