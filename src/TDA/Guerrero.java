/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Enums.tiposDeSprite;
import GUI.Animation;

/**
 *
 * @author ferol
 */
public abstract class Guerrero extends Harmfull{
    
    protected int costo;

    public Guerrero(Animation animacion,int campos,int cantidadDeVida,int golpePorSegundo[],int nivelDeAparicion,String nombre,
                    int rango,int costo) {
        this.animacion = animacion;
        this.campos = campos;
        this.cantidadDeVida = cantidadDeVida;
        this.golpePorSegundo=golpePorSegundo;
        this.nivel=1;
        this.nivelDeAparicion= nivelDeAparicion;
        this.nombre= nombre;
        this.rango= rango;
        this.costo = costo;
        this.tipo = tiposDeSprite.Guerrero;
    }

    public Guerrero() {
        this.nivel = 1;
        this.tipo = tiposDeSprite.Guerrero;
    }
    
    
    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}

