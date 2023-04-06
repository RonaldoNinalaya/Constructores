
package constructores;

/**
 *
 * @author Ronaldo
 */
public class Constructores {
    
    
    /*public static void main(String[] args) {
        Persona persona = new  Persona();
        Persona juanPersona = new  Persona("juan",25);
        
        imprimir(persona.getTextoImprimir());
        imprimir(juanPersona.getTextoImprimir());
        
    }*/
    public static void main(String[] args){
        Empleado empleado = new  Empleado("Manuel",20,"Finanza");
        Empleado empleadoCopia = Empleado.copiaEmpleado(empleado);
        empleadoCopia.setDepartamento("ventas");
        
        imprimir(empleado.getTextoImprimir());
        imprimir(empleadoCopia.getTextoImprimir());
    }
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static String convertirATexto(int entero){
        return String.valueOf(entero);
    }
}
