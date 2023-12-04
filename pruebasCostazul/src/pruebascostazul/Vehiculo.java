package pruebascostazul;

public class Vehiculo {
    private Usuario conductor;
    private String tipoVehiculo;
    private String marca;
    private String color;
    private String placa;
    private String zona;
    private int puestoEstacionamiento;
    private String fecha;
    private String horaEntrada;
    private String horaSalida;

    public Vehiculo(Usuario conductorVehiculo, String tipo, String marcaVehiculo, String colorVehiculo, 
                    String placaVehiculo, String zonaEstacionamiento, int puesto, String fechaActual, String horaActual){
        conductor = conductorVehiculo;
        tipoVehiculo = tipo;
        marca = marcaVehiculo;
        color = colorVehiculo;
        placa = placaVehiculo;
        zona = zonaEstacionamiento;
        puestoEstacionamiento = puesto;
        fecha = fechaActual;
        horaEntrada = horaActual;
    }
    
    public String getNombreConductor(){
        return conductor.getNombres() + " " + conductor.getApellidos();
    }
    public String getCedulaConductor(){
        return conductor.getCedula();
    }
    public String getTipo(){
        return tipoVehiculo;
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public String getPlaca(){
        return placa;
    }
    public String getZona(){
        return zona;
    }
    public int getPuesto(){
        return puestoEstacionamiento;
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
    public void setHoraSalida(String horaActual){
        horaSalida = horaActual;
    }
}
