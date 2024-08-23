
package relojes;

/**
 *
 * @author Luciano Colombero
 */
public class unaPersona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    
     public unaPersona(String nombre, String apellido, int edad, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

   
    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    
}
