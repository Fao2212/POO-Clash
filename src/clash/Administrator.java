/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clash;

import Datos.ConfigDefensas;
import Datos.ConfigGuerreos;
import Enums.tiposDeDefensa;
import Enums.tiposDeGuerrero;
import GUI.Animation;
import TDA.Defensa;
import TDA.Defensas.Aereo;
import TDA.Defensas.Bomba;
import TDA.Defensas.Canon;
import TDA.Defensas.Mortero;
import TDA.Defensas.TorreArquero;
import TDA.Guerrero;
import TDA.Guerreros.GrandesBestias;
import TDA.Guerreros.Heroe;
import TDA.Guerreros.Melee;
import TDA.Guerreros.Range;
import TDA.Guerreros.Volador;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class Administrator {
    String username;
    String password;
    ArrayList<Guerrero> guerreros;//Asegurarse de que solo esxista uno
    ArrayList<Defensa> defensas;//Referencias al original en clash singleton
    

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //Dejar que use los datos para cargar una foto
    private void nuevoGuerrero(tiposDeGuerrero tipo,Animation animacion,int espacio,int vida,int danoXsegundo[],int nivelAparicion,String nombre,int rango,int costo){
        Guerrero guerrero = null;
        switch(tipo){
            case Volador:
                guerrero = new Volador(animacion, espacio, vida, danoXsegundo, nivelAparicion, nombre, rango, costo,null);
                break;
            case GrandesBestias:
                guerrero = new GrandesBestias(animacion, espacio, vida, danoXsegundo, nivelAparicion, nombre, rango, costo,null);
                break;
            case Melee:
                guerrero = new Melee(animacion, espacio, vida, danoXsegundo, nivelAparicion, nombre, rango, costo,null);
                break;
            case Range:
                guerrero = new Range(animacion, espacio, vida, danoXsegundo, nivelAparicion, nombre, rango, costo,null);
                break;
            case Heroe:
                guerrero = new Heroe(animacion, espacio, vida, danoXsegundo, nivelAparicion, nombre, rango, costo,null);
                break;

        }
        guerreros.add(guerrero);
        ConfigGuerreos.guardarNuevoGuerrero(guerreros);
    }
    
    private void nuevoMapa(){//Usar el creador de pueblos
        
    }
    
    private void nuevaDefensa(tiposDeDefensa tipo,Animation animacion,int vida,int danoXsegundo[],int nivelAparicion,String nombre,int rango){
                Defensa defensa = null;
        switch(tipo){
            case Aereo:
                defensa = new Aereo(animacion,  vida, danoXsegundo, nivelAparicion, nombre, rango,null);
                break;
            case Bomba:
                defensa = new Bomba(animacion,  vida, danoXsegundo, nivelAparicion, nombre, rango,null);
                break;
            case Canon:
                defensa = new Canon(animacion, vida, danoXsegundo, nivelAparicion, nombre, rango, null);
                break;
            case Mortero:
                defensa = new Mortero(animacion, vida, danoXsegundo, nivelAparicion, nombre, rango, null);
                break;
            case TorreArquero:
                defensa = new TorreArquero(animacion, vida, danoXsegundo, nivelAparicion, nombre, rango,null);
                break;

        }
        defensas.add(defensa);
        ConfigDefensas.guardarNuevaDefensa(defensas);
    }
}
