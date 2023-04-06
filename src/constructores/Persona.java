
package constructores;

import java.util.Objects;

/**
 *
 * @author Ronaldo
 */
public class Persona {
    
    private String nombre;
    private int edad;

    public Persona(){}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getTextoImprimir(){
        return "Nombre: "
                +this.nombre 
                + "\nEdad: "
                +getEdadComoTexto()
                +"\n--------------";
    }
    public String getEdadComoTexto(){
        String edadTexto = Constructores.convertirATexto(edad);
        return edadTexto;
    }

   
    
    

}
