
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
    private RelojFit r1;
    

    public unaPersona(String nombre, String apellido, int edad, double altura, RelojFit r1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.r1 = r1;
    }

    public RelojFit getRF() {
        return r1;
    }

    public void setRF(RelojFit r1) {
        this.r1 = r1;
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
