/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author jorgi
 */
public class Boton extends JButton implements ActionListener{
    static boolean vivo;
    static int contVivos;
    static int contMuertos;
    public Boton(){
        if(this.isSelected()){
            this.setBackground(Color.WHITE);
        vivo=true;
        System.out.println("Estoy vivo");
        }
        this.setBackground(Color.DARK_GRAY);
        vivo=false;
        contVivos=0;
        
        this.addActionListener((ActionListener) this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        this.setBackground(Color.WHITE);
        this.vivo=true;
        System.out.println("Estoy vivo");
    }
    
    public void gestion(int cont){
        int contVivos=cont;
        Color color=new Color(255,255,255);
        if(/*vivo==true&&*/this.getBackground().equals(color)&&contVivos<2){
            vivo=false;
            this.setBackground(Color.DARK_GRAY);
            System.out.println("Aqui estoy");
        }
        else if(/*vivo==true&&*/this.getBackground().equals(color)&&(contVivos==2||contVivos==3)){
            vivo=true;
            this.setBackground(Color.WHITE);
            System.out.println("Aqui estoy");
        }
        else if(/*vivo==true&&*/this.getBackground().equals(color)&&contVivos>3){
            vivo=false;
            this.setBackground(Color.DARK_GRAY);
             System.out.println("Aqui estoy");
        }
        else if(/*vivo==false&&*/!(this.getBackground().equals(color))&&contVivos==3){
            vivo=true;
            this.setBackground(Color.WHITE);
            System.out.println("Aqui estoy");
        }
    }
    
    
    
}
