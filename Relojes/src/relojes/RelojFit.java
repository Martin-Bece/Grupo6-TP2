/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relojes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Mila
 */
public class RelojFit extends Reloj{
    
    private int pasosY;
    private int pasosX;
    
    public RelojFit(LocalDate fecha, LocalTime hora) {
        super(fecha, hora);
    }
    
    public void contarPasos(int y, int x){
        int pasos = Math.abs(x) + Math.abs(y);
        System.out.println("Se ha movido "+pasos+" pasos");
    }
    
}
