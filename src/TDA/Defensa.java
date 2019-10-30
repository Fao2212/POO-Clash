/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Enums.tiposDeGuerrero;
import Enums.tiposDeSprite;
import GUI.Animation;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public abstract class Defensa extends Harmfull{
    
    protected ArrayList<tiposDeGuerrero> preferencia;//Tipo de guerrero
    protected int prioridad;
    
    public Defensa(Animation animacion,int cantidadDeVida,
                    int[] golpePorSegundo, int nivelDeAparicion,String nombre,int rango) {
        
        this.animacion = animacion;
        this.cantidadDeVida = cantidadDeVida;
        this.golpePorSegundo =golpePorSegundo;
        this.nivel = 1;
        this.nivelDeAparicion = nivelDeAparicion;
        this.nombre = nombre;
        this.preferencia = new ArrayList<tiposDeGuerrero>();
        this.tipo = tiposDeSprite.Defensa;
        this.prioridad = 2;
        
    }

    public Defensa() {
        this.nivel = 1;
        this.tipo = tiposDeSprite.Defensa;
    }
    
    
    
    public ArrayList<tiposDeGuerrero> getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(ArrayList<tiposDeGuerrero> preferencia) {
        this.preferencia = preferencia;
    }
    
    @Override
    public void doAction() {
        rangeArea();
        objective();
        if(objetivoActual != null)
            atacar();
    }
    
}

enum tiposDeDefensa{
    Aereo,Bomba,Canon,Mortero,TorreArquero
}