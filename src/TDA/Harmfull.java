/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Enums.tiposDeSprite;

/**
 *
 * @author ferol
 */
public abstract class Harmfull extends Sprite{
    
    protected int golpePorSegundo[];
    protected int rango;
    protected int nivelDeAparicion;
    protected int campos;
    protected tiposDeSprite[] objetivo;
    protected Sprite objetivoActual;
    protected Slots rangeArea[][];
    protected Tablero tablero;

    public Harmfull() {

    }

    
    
    public int[] getGolpePorSegundo() {
        return golpePorSegundo;
    }
    
    public void atacar() {//SI LA VIDA LE LLEGA A 0 ENTONCES SETEAR EN NULL A OBJETIVO Y VACIAR EL TILE DEL MAPA
        objetivoActual.setCantidadDeVida(objetivoActual.getCantidadDeVida()-golpePorSegundo[0]);//Set de la animacion proyectil 
        System.out.println("Estoy atacando "+objetivoActual.nombre);
    }
    
    public void setGolpePorSegundo(int[] golpePorSegundo) {
        this.golpePorSegundo = golpePorSegundo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getNivelDeAparicion() {
        return nivelDeAparicion;
    }

    public void setNivelDeAparicion(int nivelDeAparicion) {
        this.nivelDeAparicion = nivelDeAparicion;
    }

    public int getCampos() {
        return campos;
    }

    public void setCampos(int campos) {
        this.campos = campos;
    }
    
    public void rangeArea(){
        
        int lado = rango*2+1;
        int puntox = -rango;
        int puntoy = -rango;
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                rangeArea[i][j] = tablero.getSize()[this.pos.x+puntox][this.pos.y+puntoy];
                puntoy += 1;
            }
            puntoy = -rango;
            puntox += 1;
        }
        
    }

    
    public void selectObjective(){
        tiposDeSprite[] obj = new tiposDeSprite[2];
        if(this.tipo == tiposDeSprite.Defensa)
            obj[0] = tiposDeSprite.Guerrero;//Poner ambos en guerrero
        else{
            obj[0] = tiposDeSprite.Defensa;
            obj[1] = tiposDeSprite.Harmless;
        }
        
        this.objetivo = obj;
        
    }
    
    public void objective(){
        for (int i = 0; i < rango*2+1; i++) {
            for (int j = 0; j < rango*2+1; j++) {
                if(!rangeArea[i][j].isEmpty()){
                    System.out.println(i);
                    System.out.println(j);
                    if(rangeArea[i][j].sprite.tipo == objetivo[0] || rangeArea[i][j].sprite.tipo == objetivo[1])//Devuelve si esta lleno o no.\
                        objetivoActual = rangeArea[i][j].sprite;
                        }
            }
        }
    }
    
    public void initSlots(){
        for (int i = 0; i < rango*2+1; i++) {
            for (int j = 0; j < rango*2+1; j++) {
                rangeArea[i][j] = new Slots();
            }
        }
    }
    
}
