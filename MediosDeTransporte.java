

package clases.implementacion.mediosdetransporte;


public class MediosDeTransporte {

    public static void main(String[] args) {
        Moto motoUno= new Moto("ABC 123","Honda",2);
        Auto autoUno=new Auto("DEF 456","BMW",5);
        
        
        motoUno.conducir();
        autoUno.conducir();
    }
}
