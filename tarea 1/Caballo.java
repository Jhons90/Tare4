
/**
 * Write a description of class Caballo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Caballo
{
    // instance variables - replace the example below with your own
    private String Nombre;
    private int edad;
    private double peso;
    private String color;

    /**
     * Constructor for objects of class Caballo
     */
    public Caballo(String Nombre ,int edad,double peso, String color)
    {

        this.Nombre=Nombre;
        this.edad=edad;
        this.peso=peso;
        this.color=color;

    }

    public String getNombre(){
        return Nombre;
    }

    public int getEdad(){
        return edad;
    }

    public double getPeso (){
        return peso;
    }

    public String getColor(){
        return color;
    }

    public void setNombre( String nuevoNombre){
        Nombre=nuevoNombre;
    }

    public void setEdad(int valorEdad){
        edad=valorEdad;
    }

    public void setPeso(double nuevoPeso){
        peso=nuevoPeso;
    }

    public void setColor(String nuevoColor){
        color=nuevoColor;
    }

    public String saludar (){
        return "hola mi nombre es"+""+Nombre;
    }

    public String comer(){
    
        return "Como demaciado por el peso que llevo que es"+peso;
    }
}

