
package clases.implementacion.mediosdetransporte;



public class Auto extends Vehiculo {
   

    public Auto(String placa, String marca, Integer numeroPasajeros) {
        super(placa, marca, numeroPasajeros);
    }
    
    @Override
    public void conducir(){
        System.out.println("Sube al auto");
        encender();
        acelerar();
        apagar();
    }
    
   
    
}
