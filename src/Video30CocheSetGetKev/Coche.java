
package Video30CocheSetGetKev;


public class Coche {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    
    String color;
    int pesototal;
    boolean asientos;
    
    public Coche(){
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }
    
    public String dimelargo(){ //metodo getter
        
        return "El largo del coche es " + largo; 
    }
    
    public void establecer_color(){//metodo setter
        
        color = "Azul";
        
    }
    
    public String dime_color(){
        
        return "El color del automovil es " + color;
    }
}
