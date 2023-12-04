package pruebascostazul;

import java.time.LocalDateTime;

public class Usuario {
    private String nombres;
    private String apellidos;
    private String cedula;
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    //private boolean tieneVehiculo;
    private Vehiculo vehiculo;
    private boolean realizoCompra;
    private Producto[] pedidoUsuario;
    private RegistroCompra registroCompra;
    private boolean online;
    private String tipoPago;
    
    public Usuario(String nombresUsuario, String apellidosUsuario, String cedulaUsuario, boolean usuarioOnline){
        nombres = nombresUsuario;
        apellidos = apellidosUsuario;
        cedula = cedulaUsuario;
        online = usuarioOnline;
        fecha = String.valueOf(LocalDateTime.now().getDayOfMonth()) + "-" + 
                String.valueOf(LocalDateTime.now().getMonth()) + "-" + 
                String.valueOf(LocalDateTime.now().getYear()); 
        horaEntrada = String.valueOf(LocalDateTime.now().getHour()) + ":" + 
                String.valueOf(LocalDateTime.now().getMinute()) + ":" + 
                String.valueOf(LocalDateTime.now().getSecond()); 
    }
    public Usuario(String nombresUsuario, String apellidosUsuario, String cedulaUsuario, boolean usuarioOnline, Vehiculo vehiculoUsuario){
        nombres = nombresUsuario;
        apellidos = apellidosUsuario;
        cedula = cedulaUsuario;
        online = usuarioOnline;
        fecha = String.valueOf(LocalDateTime.now().getDayOfMonth()) + "-" + 
                String.valueOf(LocalDateTime.now().getMonth()) + "-" + 
                String.valueOf(LocalDateTime.now().getYear()); 
        horaEntrada = String.valueOf(LocalDateTime.now().getHour()) + ":" + 
                      String.valueOf(LocalDateTime.now().getMinute()) + ":" + 
                      String.valueOf(LocalDateTime.now().getSecond());
        vehiculo = vehiculoUsuario;
    }

    
    
    public Producto getProducto(int n){
        if (pedidoUsuario[n] != null) {
            return pedidoUsuario[n];
        }
        return null;
    }
    public void setTipoPago(String tipoPagoUsuario){
        tipoPago = tipoPagoUsuario;
    }
    public String getTipoPago(){
        return tipoPago;
    }
    public void setPedido(Producto[] pedidoRealizado){
        pedidoUsuario = pedidoRealizado;
    }
    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getNombreCompleto(){
        return nombres + " " + apellidos;
    }
    public String getCedula(){
        return cedula;
    }
    public String getFecha(){
        return fecha;
    }
    public String getHoraEntrada(){
        return horaEntrada;
    }
    public String getHoraSalida(){
        return horaSalida;
    }
    public boolean getOnline(){
        return online;
    }
    public boolean getRealizoCompra(){
        return realizoCompra;
    }
    public String getTipoVehiculo(){
        return vehiculo.getTipo();
    }
    public String getMarcaVehiculo(){
        return vehiculo.getMarca();
    }
    public String getColorVehiculo(){
        return vehiculo.getColor();
    }
    public String getPlacaVehiculo(){
        return vehiculo.getPlaca();
    }
    public String getZonaVehiculo(){
        return vehiculo.getZona();
    }
    public int getPuestoVehiculo(){
        return vehiculo.getPuesto();
    }
    
}
