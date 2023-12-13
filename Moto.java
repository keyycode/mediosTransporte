
package clases.implementacion.mediosdetransporte;


public class Moto extends Vehiculo {
    
    
    public Moto(String placa, String marca, Integer numeroPasajeros) {
        super(placa, marca, numeroPasajeros);
        
    }
 
    @Override
    public void conducir(){
        System.out.println("Sube a la moto");
        encender();
        acelerar();
        apagar();
    }
    
    
    
    
    
    
    
    
}
