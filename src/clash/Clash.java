/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clash;

import Datos.ConfigAdministradores;
import Datos.ConfigDefensas;
import Datos.ConfigGuerreos;
import Datos.ConfigHarmless;
import Datos.ConfigMapas;
import Datos.ConfigUsuarios;
import Enums.tiposDeSprite;                                                         
import GUI.Animation;
import GUI.Mapa;
import Logic.ControladorFabricaPueblos;
import Logic.ControladorNuevoSprite;
import Logic.ThreadSprite;
import TDA.Defensa;
import TDA.Defensas.Aereo;
import TDA.Guerrero;
import TDA.Guerreros.Melee;
import TDA.Guerreros.Volador;
import TDA.Harmless;
import TDA.HarmlessObject.CasaDeDuendes;
import TDA.HarmlessObject.Muro;
import TDA.Pueblo;
import TDA.Sprite;
import TDA.Tablero;
import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
       /* this.guerreros = new ArrayList<Guerrero>();
        this.mapas = new ArrayList<Pueblo>();
        this.defensas = new ArrayList<Defensa>();
        this.administradores = new ArrayList<Administrator>();
        this.usuarios = new ArrayList<User>();
        FileManager.FileManager.writeObject(guerreros, "Guerreros.config");
        FileManager.FileManager.writeObject(defensas, "Defensas.config")  ;    
        FileManager.FileManager.writeObject(administradores, "Administrator.config");
        FileManager.FileManager.writeObject(mapas, "Mapas.config");
        FileManager.FileManager.writeObject(usuarios, "Users.config");*/
        /*Muro muro = new Muro();
        CasaDeDuendes casaDeDuendes = new CasaDeDuendes();
        ArrayList<Harmless> harolemseo= new ArrayList<>();
        harolemseo.add(muro);
        harolemseo.add(casaDeDuendes);*/
/**
 *
 * @author ferol
 */
public class Clash {//Crear archivos de config default qu eno se puedan modificar
//Volver a guardar las defensas ya que estas no tienen guardada la prioridad
    ArrayList<Guerrero> guerreros;
    ArrayList<Pueblo> mapas;
    ArrayList<Defensa> defensas;
    ArrayList<Administrator> administradores;//Cada vez que realize una accion refrescar atributos al guardarse no deberia tener referencias antiguas
    ArrayList<User> usuarios;//Tienen que cargarse todos para iniciar
    ArrayList<Harmless> harmless;
    
    public Clash(){
        //CargarAdministrador Debe poder hacer harmless tambien
       init();
        
    }
    
    public void init(){//El juego se juega a traves de la partida acas oslo inicializa datos y hace un start de la partida
        //ConfigDefensas.guardarNuevaDefensa(new ArrayList<>());
        this.guerreros = ConfigGuerreos.cargarGuerreros();
        this.mapas = ConfigMapas.cargarMapas();
        this.defensas = ConfigDefensas.cargarDefensas();
        this.administradores = ConfigAdministradores.cargarAdministradores();
        this.usuarios = ConfigUsuarios.cargarUsuarios();
        this.harmless = ConfigHarmless.cargarHarmless();
        System.out.println(guerreros);
        System.out.println(mapas);
        System.out.println(defensas);
        System.out.println(administradores);
        System.out.println(usuarios);
        System.out.println(harmless);

                
    }
    
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        //Creacion
        /*int danio [] = new int [2];
        danio[0] = 1;
        danio[1] = 1;
        Sprite muro = new Muro();
        ThreadSprite threadmuro = new ThreadSprite(muro,true);*/
        /*Sprite muro2 = new Muro();
        ThreadSprite threadmuro2 = new ThreadSprite(muro,true);*/
        /*Tablero tablero = new Tablero(new Pueblo());
        Sprite guerrero = new Volador(new Animation(),2,20,danio,1,"Maleante",1,12,tablero);*/
        //Posiciones
        /*ThreadSprite threadguerrero = new ThreadSprite(guerrero,true);//Hacer un for para el ejercito y otro para el pueblo creando hilos con su resp objeto
        tablero.getSize()[10][10].setSprite(muro);
        tablero.getSize()[9][9].setSprite(guerrero);
        muro.setPos(new Point(10, 10));
        guerrero.setPos(new Point(9, 9));
        Guerrero guerrero2 = (Volador) guerrero.getClass().getConstructor().newInstance();
        System.out.println(guerrero);
        System.out.println(guerrero2);*/
        //Thread
        //threadguerrero.start();
        //threadmuro.start();
        //Creacion guerreros con pantalla
        /*Clash juego = new Clash();
        Administrator admin = new Administrator("Administrator", "12345");
        admin.setData(juego.guerreros, juego.defensas, juego.mapas,juego.harmless,juego.usuarios,juego.administradores);
        ControladorNuevoSprite control = new ControladorNuevoSprite(admin);
        control.iniciarPantalla();*/
        //Creacion de archivos de configuracion
        //Clash juego = new Clash();
        //System.out.println(juego.defensas.get(0));
        //Creacion de pueblos
        /*Clash juego = new Clash();
         Administrator admin = new Administrator("Administrator", "12345");
         admin.setData(juego.guerreros, juego.defensas, juego.mapas,juego.harmless,juego.usuarios,juego.administradores);//Pasar a privadito
        ControladorFabricaPueblos creaPueblos = new ControladorFabricaPueblos(admin);
        creaPueblos.iniciarPantalla();*/
        
    }
    
}
