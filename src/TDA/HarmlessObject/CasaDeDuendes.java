/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA.HarmlessObject;

import Enums.tiposDeSprite;
import TDA.Harmless;

/**
 *
 * @author ferol
 */
public class CasaDeDuendes extends Harmless{
    private int cantidadDeOro;

    public CasaDeDuendes() {
        this.cantidadDeVida = 200;
        this.nivel = 1;
        this.nombre = "Casa De Duendes";
        this.prioridad = 3;
        this.cantidadDeOro = 2000;
        this.tipo = tiposDeSprite.Harmless;
        
    }
    
    

    public int getCantidadDeOro() {
        return cantidadDeOro;
    }

    public void setCantidadDeOro(int cantidadDeOro) {
        this.cantidadDeOro = cantidadDeOro;
    }

    @Override
    public void morir() {
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
