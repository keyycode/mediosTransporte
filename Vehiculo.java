
package clases.implementacion.mediosdetransporte;


abstract public class Vehiculo {
    
    public String placa;
    public String marca;
    public Integer numeroPasajeros;
    private String tipoVehiculo; 

    public Vehiculo(String placa, String marca, Integer numeroPasajeros) {
        this.placa = placa;
        this.marca = marca;
        this.numeroPasajeros = numeroPasajeros;
    }
    
    
    

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public void encender(){
        System.out.println("Encendido");
    }
            
    public void apagar(){
        System.out.println("Apagado");
    }
    
    public void acelerar(){
        System.out.println("Acelerando");   
    }
    
    abstract void conducir();
    
}
