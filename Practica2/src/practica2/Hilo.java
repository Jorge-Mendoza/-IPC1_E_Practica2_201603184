/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorgi
 */
public class Hilo implements Runnable{

    @Override
    public void run() {
        JuegoVida obj=new JuegoVida();
        obj.jugar();
        
//        Thread t=new Thread();
//        try {
//        t.sleep(2000);
//    } catch (InterruptedException ex) {
//        Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
//    }
    
        
    }
    
}
