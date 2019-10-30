/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Enums.tiposDeSprite;
import GUI.Animation;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author ferol
 */
public abstract class Sprite implements Serializable,Cloneable{//Puede ser para la interfaz 
    
    protected String nombre;
    protected Animation animacion;
    protected int cantidadDeVida;
    protected int nivel;   
    protected Point pos;
    protected tiposDeSprite tipo;
    
    public abstract void morir();
    
    public int aumentar(int atributo,float porcentaje){
        int aumentado = atributo;
        aumentado += atributo*porcentaje;
        return aumentado;
    }
    
    public void aparecer(int posx,int posy){
        this.pos.x = posx;
        this.pos.y = posy;
    }
    
    public abstract void subirDeNivel();
    public abstract void doAction();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVida() {
        return cantidadDeVida;
    }

    public void setCantidadDeVida(int cantidadDeVida) {
        this.cantidadDeVida = cantidadDeVida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Animation getAnimacion() {//Dejar solo los que en realidad necesito
        return animacion;
    }

    public void setAnimacion(Animation animacion) {
        this.animacion = animacion;
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    public tiposDeSprite getTipo() {
        return tipo;
    }

    public void setTipo(tiposDeSprite tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{  
        return super.clone();
    }
    
}
