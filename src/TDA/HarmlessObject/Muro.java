/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA.HarmlessObject;

import Enums.tiposDeSprite;
import GUI.Animation;
import TDA.Harmless;

/**
 *
 * @author ferol
 */
public class Muro extends Harmless{

    public Muro() {
        this.animacion = new Animation();
        this.cantidadDeVida = 10;
        this.nombre = "Muro";
        this.prioridad = 1;
        this.tipo = tiposDeSprite.Harmless;
    }

    @Override
    public void morir() {
        System.out.println(cantidadDeVida);
        if(cantidadDeVida == 0)
            System.out.println("estoy muerto");
    }

    @Override
    public void subirDeNivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doAction() {
        morir();
    }
    

    
}
