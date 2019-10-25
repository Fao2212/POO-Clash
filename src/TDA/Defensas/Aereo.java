/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA.Defensas;

import Enums.tiposDeGuerrero;
import GUI.Animation;
import TDA.Defensa;
import TDA.Guerrero;
import TDA.Tablero;

/**
 *
 * @author ferol
 */
public class Aereo extends Defensa{

    public Aereo(Animation animacion,int cantidadDeVida, int[] golpePorSegundo, int nivelDeAparicion, String nombre, int rango,Tablero tablero) {
        super(animacion,cantidadDeVida, golpePorSegundo, nivelDeAparicion, nombre, rango);
        this.preferencia.add(tiposDeGuerrero.Volador);
    }

    public Aereo() {
    }

    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aparecer(int posx, int posy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void subirDeNivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        objetivoActual.setCantidadDeVida(getCantidadDeVida()-golpePorSegundo[0]);//Set de la animacion proyectil 
    }
   
}
