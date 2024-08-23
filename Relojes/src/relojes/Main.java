package relojes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        RelojFit rF = new RelojFit(LocalDate.now(),LocalTime.now());
        Scanner leer = new Scanner(System.in);
        Reloj r1 = new Reloj(LocalDate.now(),LocalTime.now());
        unaPersona p1 = new unaPersona("Mateo","Silvestri",19,2.01,rF);
        
        //Probando metodos
        p1.getRF().incrementarDia();
        p1.getRF().incrementarHora();
        p1.getRF().mostrarFechaHora();
        
        //Limpiar pantalla
        p1.getRF().limpiarPantalla();
        p1.getRF().mostrarFechaHora();
     
        //Contar pasos
        System.out.println("Ingrese las coordenadas Y");
        int y = leer.nextInt();
        System.out.println("Ingrese las coordenadas X");
        int x = leer.nextInt();
        p1.getRF().contarPasos(y, x);
    }
    
}
