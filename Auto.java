
package clases.implementacion.mediosdetransporte;



public class Auto extends Vehiculo {
    
    private int llave;
    
    public Auto(String placa, String marca, Integer numeroPasajeros) {
        super(placa, marca, numeroPasajeros);
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }
    
    public void abrirAuto(int key){
        if(key==llave){
            System.out.println("ABIERTO");
        }else{
            System.out.println("NO ES LA LLAVE");
        }   
    }

    @Override
    public void conducir(){
        abrirAuto(llave);
        System.out.println("Sube al auto");
        encender();
        acelerar();
        apagar();
    }
    
   
    
}
