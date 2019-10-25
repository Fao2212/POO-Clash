/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import GUI.customLabel;
import GUI.formCreadorPueblos;
import TDA.Pueblo;
import TDA.Slots;
import TDA.Sprite;

/**
 *
 * @author ferol
 */
public class ControladorFabricaPueblos {
    formCreadorPueblos pantalla;
    Pueblo pueblo;

    public ControladorFabricaPueblos(int columnas,int filas) {
        Slots dimensiones[][] = new Slots[columnas][filas];
        pueblo = new Pueblo();
        pantalla = new formCreadorPueblos();
        matrizPantalla();
        iniciarPantalla();
       
        
    }
    
   /* public void crearMatrizPantalla(){
        int dimesion_x = (int)pantalla.jPanel1.getAlignmentX();
        int dimesion_y = (int)pantalla.jPanel1.getAlignmentY();
        
    }*/
    public void matrizPantalla(){
        pantalla.matrizPantalla = new customLabel[15][15];
        System.out.println(pantalla.jPanel1.getY());
        int dimesion_x = (int)pantalla.jPanel1.getX()/15;
        int dimesion_y = (int)pantalla.jPanel1.getY()/15;
        System.out.println(dimesion_x);
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                                // coloca imagen a todos vacio
                pantalla.matrizPantalla[i][j] = new customLabel();
                pantalla.matrizPantalla[i][j].setEmpty(true);
                

                pantalla.jPanel1.add(pantalla.matrizPantalla[i][j].label);
                // coloca dimensiones y localidad
                pantalla.matrizPantalla[i][j].label.setBounds(20*i, 20*j, 20, 20);

            }
            
        }
    }
    
    public void iniciarPantalla(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pantalla.setVisible(true);
            }
        });
    }
    
}
