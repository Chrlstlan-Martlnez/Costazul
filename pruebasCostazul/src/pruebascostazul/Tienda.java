package pruebascostazul;

import java.util.Random;

public class Tienda {
    private String nombre;
    private String[] empleados;
    private String empleadoActual;
    private int idTienda;
    private Producto[] productos;
    private Producto[] pedido = new Producto[3];
//    private String[] nombresProductos;
//    private int[] preciosProductos;
    private String zona;
    
    public Tienda(String nombreTienda, String[] empleadosTienda, int nTienda, Producto[] productosTienda,  String zonaTienda){    
        Random r = new Random();
        
        nombre = nombreTienda;
        empleados = empleadosTienda;
        empleadoActual = empleados[r.nextInt(2)];
        idTienda = nTienda;
        productos = productosTienda;
//        nombresProductos = nombresProductosTienda;
//        preciosProductos = preciosProductosTienda;
        zona = zonaTienda;
    }
    
    public void anadirPedido(Producto producto, int cantidad){
        producto.setCantidad(cantidad);
        
        if (pedido[0] == null) {
            pedido[0] = producto;
        }
        else if (pedido[1] == null) {
            pedido[1] = producto;
        }
        else if (pedido[2] == null) {
            pedido[2] = producto;
        }
    }
    public Producto getProducto(int nProducto){
        return productos[nProducto];
    }
    public String getNombre(){
        return nombre;
    }
    public String getID(){
        return String.valueOf(idTienda);
    }
    public String getEmpleado(){
        return empleadoActual;
    }
    public String getZona(){
        return zona;
    }

}
