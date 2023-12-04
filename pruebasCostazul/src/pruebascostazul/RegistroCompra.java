package pruebascostazul;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegistroCompra {
    private Usuario comprador;
    private String horaCompra;
    private Tienda tienda;
    //private Producto[] productos;
    private String[] nombresProductos;
    private int[] preciosProductos;
    private static int nCompras = 0;
    
    public RegistroCompra(Usuario usuarioComprador, Tienda tiendaDeCompra, String[] nombresProductosComprador, int[] preciosProductosComprador){
        comprador = usuarioComprador;
        horaCompra = String.valueOf(LocalDateTime.now().getHour()) + ":" + 
                              String.valueOf(LocalDateTime.now().getMinute()) + ":" + 
                              String.valueOf(LocalDateTime.now().getSecond());
        tienda = tiendaDeCompra;
        //productos = productosComprados;
        nombresProductos = nombresProductosComprador;
        preciosProductos = preciosProductosComprador;
        nCompras += 1;
    }
    
    public String datosComprador(){
        return "Comprador: " + comprador.getNombreCompleto() + " - C.I: " + comprador.getCedula();
    }
    public String datosTienda(){
        return "Tienda: " + tienda.getNombre() + " - ID: " + tienda.getID() + " - Empleado: " + tienda.getEmpleado() + " - Zona: " + tienda.getZona();
    }
    public String datosProductos(){
        String productos = "";
        for (int i = 0; i < 3; i++) {
            Producto p = comprador.getProducto(i);
            if (p != null) {
                productos = productos + " " + p.getNombre();
            }
        }
        return "Productos: " + productos;
    }
    public String datosCantidades(){
        String cantidades = "";
        for (int i = 0; i < 3; i++) {
            Producto p = comprador.getProducto(i);
            if (p != null) {
                cantidades = cantidades + " " + String.valueOf(p.getCantidad());
            }
        }
        return "Cantidades: " + cantidades;
    }
    public String datosPrecios(){
        String precios = "";
        for (int i = 0; i < 3; i++) {
            Producto p = comprador.getProducto(i);
            if (p != null) {
                precios = precios + " " + String.valueOf(p.getPrecio());
            }
        }
        return "Precios: " + precios;
    }
    public String datosPago(){
        int pago = 0;
        for (int i = 0; i < 3; i++) {
            Producto p = comprador.getProducto(i);
            if (p != null) {
                pago = pago + (p.getPrecio() * p.getCantidad());
            }
        }
        return "Pago Total (Bs): " + pago + " - Tipo de Pago: " + comprador.getTipoPago();
    }
    public String datosFecha(){
        return "Fecha de compra: " + comprador.getFecha() + " a las  " + horaCompra;
    }
    public void crearRegistro() throws IOException{
        File archivoCompras = new File("RegistroDeComprasCostaAzul.txt");
        String saltoLinea = System.lineSeparator();
        
        if (!archivoCompras.exists()) {
            FileWriter escritor = new FileWriter("RegistroDeComprasCostaAzul.txt");
            escritor.write("Registros de Compras en el Parque Costa Azul" + saltoLinea + saltoLinea);
            escritor.close();
        }
        if (archivoCompras.exists()){
            FileReader lector = new FileReader("RegistroDeComprasCostaAzul.txt");
            FileWriter temp = new FileWriter("temp.txt");
            
            int dato = lector.read();
            while (dato != -1){
                temp.write((char)dato);
                dato = lector.read();
            }
            
            temp.append(saltoLinea + "Compra " + String.valueOf(nCompras) + ": ");
            temp.append(saltoLinea + datosComprador());
            temp.append(saltoLinea + datosTienda());
            temp.append(saltoLinea + datosProductos());
            temp.append(saltoLinea + datosCantidades());
            temp.append(saltoLinea + datosPrecios());
            temp.append(saltoLinea + datosPago());
            temp.append(saltoLinea + datosFecha() + saltoLinea);
            temp.close();
            lector.close();
            
            FileWriter escritor = new FileWriter("RegistroDeComprasCostaAzul.txt");
            FileReader lectorTemp = new FileReader("temp.txt");
            dato = lectorTemp.read();
            while (dato != -1){
                escritor.write((char)dato);
                dato = lectorTemp.read();
            }
            escritor.close();
            lectorTemp.close();
            File archivoTemp = new File("temp.txt");
            archivoTemp.delete();
        }   
    }
}
