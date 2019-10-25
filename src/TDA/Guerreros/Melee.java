/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA.Guerreros;

import Enums.tiposDeSprite;
import GUI.Animation;
import Interfaces.Moverse;
import TDA.Guerrero;
import TDA.Slots;
import TDA.Tablero;

/**
 *
 * @author ferol
 */
public class Melee extends Guerrero implements Moverse{
    
    public Melee(Animation animacion, int campos, int cantidadDeVida, int[] golpePorSegundo, int nivelDeAparicion, String nombre, int rango, int costo,Tablero tablero) {
        super(animacion, campos, cantidadDeVida, golpePorSegundo, nivelDeAparicion, nombre, rango, costo);
        rangeArea = new Slots [rango*2+1][rango*2+1]; 
        initSlots();//YEA
        this.tablero = tablero;//YEA
        this.tipo = tiposDeSprite.Guerrero;//YEA esto se tiene que definir desde antes ver que hacer con los voladores
        selectObjective();//YEA
    }//Quitar nivel pasar tablero desde tablero como un this desde el ejercito

    public Melee() {
        super();
    }

    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void subirDeNivel() {
        golpePorSegundo[0] = aumentar(golpePorSegundo[0], 10);
        golpePorSegundo[1] = aumentar(golpePorSegundo[1], 10);
        cantidadDeVida = aumentar(cantidadDeVida, 10);
    }

    @Override
    public void doAction() {
        rangeArea();
        objective();
        if(objetivoActual != null)
            atacar();
        else
            mover();
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
