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
import clash.Administrator;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferol
 */
public class ControladorFabricaPueblos {//Opcion para borrar cuando se cree la nueva defensa hacer que se cree un hilo en la ejecucion del juego
    formCreadorPueblos pantalla;
    Pueblo pueblo;
    Administrator admin;
    ArrayList<Sprite> sprites;
    Sprite pincel;

    public ControladorFabricaPueblos(Administrator admin) {
        this.admin = admin;
        sprites = new ArrayList<>();
        pueblo = new Pueblo();
        pantalla = new formCreadorPueblos(this);
        matrizPantalla();
        listaSpritesVentana();
        setListaVentada();
       
        
    }
    
    public void matrizPantalla(){
        pantalla.matrizPantalla = new customLabel[15][15];
        int dimesion_x = (int)pantalla.jPanel1.getX()/15;//Esto esta demas hay que arreglarlo o dejarlo asi y omitirlo
        int dimesion_y = (int)pantalla.jPanel1.getY()/15;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                final customLabel tile = pantalla.matrizPantalla[i][j] = new customLabel();
                pantalla.matrizPantalla[i][j].setEmpty(true);
                pantalla.matrizPantalla[i][j].x = i;
                pantalla.matrizPantalla[i][j].y = j;
                pantalla.matrizPantalla[i][j].label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    try {
                        pintar(tile);
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(ControladorFabricaPueblos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Soy un asd");
                }});

                pantalla.jPanel1.add(pantalla.matrizPantalla[i][j].label);
                // coloca dimensiones y localidad
                pantalla.matrizPantalla[i][j].label.setBounds(20*i, 20*j, 20, 20);

            }
            
        }
    }
    
    public void iniciarPantalla(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                pantalla.setVisible(true);
            }
        });
    }
    
    public void listaSpritesVentana(){
        for (int i = 0; i < admin.getDefensas().size(); i++) {
            sprites.add(admin.getDefensas().get(i));
        }
        for (int i = 0; i < admin.getHarmless().size(); i++) {
            sprites.add(admin.getHarmless().get(i));
        }
    }
    
    public void setListaVentada(){
        int cont = 0;
        pantalla.listaSpritePantalla = new customLabel[15][15];//Arreglar esto
        for (int i = 0; i < sprites.size(); i++) {
            for (int j = 0; j < (sprites.size()/3)+1; j++) {
                
                final customLabel tile = pantalla.listaSpritePantalla[i][j] = new customLabel();
                pantalla.listaSpritePantalla[i][j].setSprite(sprites.get(cont));
                
                pantalla.listaSpritePantalla[i][j].label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    seleccionDePincel(tile);
                    System.out.println("Soy un evento");
                }});
                pantalla.scrollPanelSprites.add(pantalla.listaSpritePantalla[i][j].label);
                pantalla.listaSpritePantalla[i][j].label.setBounds(40*i, 40*j, 40, 40);
                cont = cont +1;
            }
            
        }
    }
    
    public void seleccionDePincel(customLabel tile){//Se tiene que asegurar de que lo que se seleccione no sea nulo
        tile.label.setBackground(Color.red);
        System.out.println(tile.getSprite().toString());
        //Setear imagen , setear borde de color verde
        this.pincel = tile.getSprite();
    }
    
    public void pintar(customLabel tile)throws CloneNotSupportedException{
        tile.label.setBackground(Color.orange);
        tile.setSprite(pincel);
        agregarAlPueblo(tile);
        
    }
    
    
    
    public void agregarAlPueblo(customLabel tile) throws CloneNotSupportedException{//Crear nueva instancia para las piezas a pintar
        Sprite clon = CloneSprite.spriteCloning(tile.getSprite());
        pueblo.imprimirPueblo();
        System.out.println(tile.x+" "+tile.y);
        pueblo.getSize()[tile.x][tile.y].setSprite(clon);
        System.out.println("pueblo"+pueblo.getSize()[tile.x][tile.y].getSprite().toString());
        
    }
    
    public void crearPueblo(){//Hacer un esta seguro? para un save correcto una vez que se hace el save se borra lo que hay en el ditor para volverse a usar    
        admin.nuevoMapa(pueblo);
    }
}
