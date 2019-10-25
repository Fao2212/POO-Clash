package TDA.Defensas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Enums.tiposDeGuerrero;
import GUI.Animation;
import TDA.Defensa;
import TDA.Guerrero;
import TDA.Tablero;

/**Escoge un objetivo y lo fija hasa que lo destruye
 *
 * @author ferol
 */
public class Canon extends Defensa{
    
    public Canon(Animation animacion, int cantidadDeVida, int[] golpePorSegundo, int nivelDeAparicion, String nombre, int rango,Tablero tablero) {
        super(animacion, cantidadDeVida, golpePorSegundo, nivelDeAparicion, nombre, rango);
        this.preferencia.add(tiposDeGuerrero.Terrestre);
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
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
