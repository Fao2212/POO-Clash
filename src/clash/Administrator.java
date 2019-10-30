/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clash;

import Datos.ConfigDefensas;
import Datos.ConfigGuerreos;
import Datos.ConfigMapas;
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
import TDA.Harmless;
import TDA.Pueblo;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class Administrator {//Asegurarme de que las listas nunca sean null
    private String username;
    private String password;
    private ArrayList<Guerrero> guerreros;//Asegurarse de que solo esxista uno
    private ArrayList<Defensa> defensas;//Referencias al original en clash singleton
    private ArrayList<Pueblo> mapas;
    private ArrayList<Administrator> administradores;//Cada vez que realize una accion refrescar atributos al guardarse no deberia tener referencias antiguas
    private ArrayList<User> usuarios;//Tienen que cargarse todos para iniciar/Creo que esto seria lista de partidas pero de igual manera puedo guardar una lista de solo los usuarios
    private ArrayList<Harmless> harmless;//Decoracion

    public Administrator(String username, String password) {//Verificar que no se repitan los guerreros con el mismo nombre o imagen pero extra
        this.username = username;
        this.password = password;

    }
    //Dejar que use los datos para cargar una foto
    public void nuevoGuerrero(tiposDeGuerrero tipo,Animation animacion,int espacio,int vida,int danoXsegundo[],int nivelAparicion,String nombre,int rango,int costo){
        Guerrero guerrero = null;
        boolean error = false;
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
            default:
                error = true;
                System.out.println("Error en creacion");

        }
        if(error == false){
            guerreros.add(guerrero);
            ConfigGuerreos.guardarNuevoGuerrero(guerreros);
        }
    }
    
    void setData( ArrayList<Guerrero> guerreros,ArrayList<Defensa> defensas,ArrayList<Pueblo> mapas,ArrayList<Harmless> harmless,ArrayList<User> usuarios,ArrayList<Administrator> administradores){
        this.guerreros = guerreros;
        this.defensas = defensas;
        this.mapas = mapas;
        this.usuarios = usuarios;
        this.administradores = administradores;
        this.harmless = harmless;
    }
    
    public void nuevoMapa(Pueblo pueblo){//Usar el creador de pueblos
        if(pueblo != null)
            ConfigMapas.guardarNuevoMapa(mapas);
        else
            System.out.println("Error al guardar");
    }
    
    public void nuevaDefensa(tiposDeDefensa tipo,Animation animacion,int vida,int danoXsegundo[],int nivelAparicion,String nombre,int rango){
                Defensa defensa = null;
                boolean error = false;
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
            default:
                error = true;
                System.out.println("Error en creacion");

        }
        if(error == false){
            System.out.println("creado "+defensa.toString());
            defensas.add(defensa);
            ConfigDefensas.guardarNuevaDefensa(defensas);
        }
        
        
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<Guerrero> getGuerreros() {
        return guerreros;
    }

    public ArrayList<Defensa> getDefensas() {
        return defensas;
    }

    public ArrayList<Pueblo> getMapas() {
        return mapas;
    }

    public ArrayList<Administrator> getAdministradores() {
        return administradores;
    }

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Harmless> getHarmless() {
        return harmless;
    }
    
    
}
