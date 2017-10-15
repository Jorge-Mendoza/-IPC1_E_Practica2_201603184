/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author jorgi
 */
public class JuegoVida extends javax.swing.JFrame {
static int tam;
Inicio obj=new Inicio();
    static Boton [][] BMatriz;
    static Boton [][] Aux;
    /**
     * Creates new form JuegoVida
     */
    public JuegoVida() {
        initComponents();
        
        add(getTablero());
        
       jSlider1.setBounds(10, HEIGHT-60, WIDTH-20, 50);
//        jPanel2.add(jSlider1);
        add(jPanel2);
    }
    public JPanel getTablero(){
        tam=obj.tamaño;
        //tam=8;
        BMatriz=new Boton[tam][tam];
        jPanel1.setLayout(new GridLayout(tam,tam));
        for (int j=0; j< tam;j++) {   
            for (int i=0; i<tam;i++) { 
                //Aux[i][j]=BMatriz[i][j];
                BMatriz[i][j] = new Boton(); 
                BMatriz[i][j].setBounds(10,10,360,360);
                
                jPanel1.setBounds(5,5,300,300);
                jPanel1.add(BMatriz[i][j]);
        }
        }
        return jPanel1;
    }
    public void aux(){
        for(int i=0;i<BMatriz.length;i++){
            for(int j=0;j<BMatriz.length;j++){
                Aux[i][j]=BMatriz[i][j];
                //System.out.println(Aux);
            }
        }
    }
    public void comparacion(Boton b,int i, int j){
        int cont;
        //(i!=0&&j!=0)||(i!=0&&j!=BMatriz.length)||(i!=BMatriz.length&&j!=0)||(i!=BMatriz.length&&j!=BMatriz.length)
                if((i>0&&i<tam)&&(j>1&&j<tam)){
                    System.out.println("Entramos");
                    cont=amigosVivos(b,i,j);
                    b.gestion(cont);
                    System.out.println(BMatriz.length);
                }
                if((i==0&&j==0)||(i==tam&&j==0)||(i==0&&j==tam)||(i==tam&&j==tam)){
                    System.out.println("Esquinas");
                    cont=esquinas(b,i,j);   
                    b.gestion(cont);
                }
                if((i==0&&(j>0&&j<tam))||(i==tam&&(j>0&&j<tam))||(j==0&&(i>0&&i<tam))||(j==tam&&(i>0&&i<tam))){
                    System.out.println("Laterales");
                    cont=laterales(b,i,j);
                    b.gestion(cont);
                }
            
        Thread t=new Thread();
        try {
        t.sleep(800);
    } catch (InterruptedException ex) {
        Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    public int laterales(Boton b,int i, int j){
        int cont=0;
        Color vivo=new Color(255,255,255);
        if(i==0&&(j>0&&j<tam)){
            if(BMatriz[i][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
        }
        if(i==tam&&(j>0&&j<tam)){
            if(BMatriz[i][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
        }
        if(j==tam&&(i>0&&i<tam)){
            if(BMatriz[i+1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
        }
        if(j==0&&(i>0&&i<tam)){
            if(BMatriz[i-1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
        }
        return cont;
        
    }
    
    public int esquinas(Boton b,int i,int j){
        int cont=0;
        Color vivo=new Color(255,255,255);
        if(i==0&&j==0){
            if(BMatriz[i+1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        }
        if(i==tam&&j==0){
            if(BMatriz[i-1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        }
        if(i==0&&j==tam){
            if(BMatriz[i][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i+1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        }
        if(i==tam&&j==tam){
            if(BMatriz[i][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
            }
            if(BMatriz[i-1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        }
        return cont;
    }
    
    public int amigosVivos(Boton b,int i,int j){
        int cont=0;
        Color vivo=new Color(255,255,255);
        if(BMatriz[i][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        if(BMatriz[i+1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        if(BMatriz[i+1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        if(BMatriz[i+1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        if(BMatriz[i][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        if(BMatriz[i-1][j+1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        if(BMatriz[i-1][j].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        if(BMatriz[i-1][j-1].getBackground().equals(vivo)){
            cont++;
            System.out.println(cont);
        }
        //Solamente los muertos
        
        
        
        System.out.println(cont);
        
    return cont;
    } 
    public void jugar(){
        Color vivo=new Color(255,255,255);
        for(int j=1;j<tam-1;j++){
            for(int i=1;i<tam-1;i++){
               // if(BMatriz[i][j].getBackground().equals(vivo)){
                    System.out.println("El boton en posiciones "+i+" y "+j+" está con vida");
                    comparacion(BMatriz[i][j],i,j);
                //}
            }
        }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Juego de la Vida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //jugar();
        
        for(int i=0;i<20;i++){
        Runnable r=new Hilo();
        Thread t=new Thread(r);
        t.start();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoVida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoVida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoVida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoVida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoVida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

    
    
}
