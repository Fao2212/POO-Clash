/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA.Guerreros;

import GUI.Animation;
import TDA.Guerrero;
import TDA.Tablero;

/**
 *
 * @author ferol
 */
public  class Volador extends Guerrero{

    public Volador(Animation animacion, int campos, int cantidadDeVida, int[] golpePorSegundo, int nivelDeAparicion, String nombre, int rango, int costo,Tablero tablero) {
        super(animacion, campos, cantidadDeVida, golpePorSegundo, nivelDeAparicion, nombre, rango, costo);
    }

    public Volador() {
        super();
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
