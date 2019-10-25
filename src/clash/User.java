/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clash;

import TDA.Ejercito;

/**
 *
 * @author ferol
 */
public class User {
    
    private String userName;
    private int nivel;
    private Ejercito ejercito;
    private int dinero;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Ejercito getEjercito() {
        return ejercito;
    }

    public void setEjercito(Ejercito ejercito) {
        this.ejercito = ejercito;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
}
