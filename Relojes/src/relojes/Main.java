package relojes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        
        Reloj r1 = new Reloj(LocalDate.now(),LocalTime.now());
        unaPersona p1 = new unaPersona("Mateo","Silvestri",19,2.01,r1);
        
        p1.r1.mostrarFechaHora();
    }
    
}
