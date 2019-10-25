/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clash;

import Datos.ConfigGuerreos;
import Datos.ConfigMapas;
import Enums.tiposDeSprite;
import GUI.Animation;
import GUI.Mapa;
import Logic.ControladorFabricaPueblos;
import Logic.ThreadSprite;
import TDA.Defensas.Aereo;
import TDA.Guerrero;
import TDA.Guerreros.Melee;
import TDA.Guerreros.Volador;
import TDA.HarmlessObject.Muro;
import TDA.Pueblo;
import TDA.Sprite;
import TDA.Tablero;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class Clash {

    ArrayList<Guerrero> guerreros;
    ArrayList<Mapa> mapas;
    
    public Clash(){
        //CargarAdministrador
       // init();
        
    }
    
    public void init(){
        this.guerreros = ConfigGuerreos.cargarGuerreros();
        this.mapas = ConfigMapas.cargarMapas();
                
    }
    
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //ControladorFabricaPueblos creaPueblos = new ControladorFabricaPueblos(15, 15);
        //Creacion
        int danio [] = new int [2];
        danio[0] = 1;
        danio[1] = 1;
        Sprite muro = new Muro();
        ThreadSprite threadmuro = new ThreadSprite(muro,true);
        Tablero tablero = new Tablero(new Pueblo());
        Sprite guerrero = new Volador(new Animation(),2,20,danio,1,"Maleante",1,12,tablero);
        //Posiciones
        ThreadSprite threadguerrero = new ThreadSprite(guerrero,true);//Hacer un for para el ejercito y otro para el pueblo creando hilos con su resp objeto
        tablero.getSize()[10][10].setSprite(muro);
        tablero.getSize()[9][9].setSprite(guerrero);
        muro.setPos(new Point(10, 10));
        guerrero.setPos(new Point(9, 9));
        Guerrero guerrero2 = (Volador) guerrero.getClass().getConstructor().newInstance();
        System.out.println(guerrero);
        System.out.println(guerrero2);
        //Thread
        //threadguerrero.start();
        //threadmuro.start();
    }
    
}
