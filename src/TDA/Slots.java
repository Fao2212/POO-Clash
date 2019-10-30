/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Enums.tiposDeSprite;
import java.io.Serializable;

/**
 *
 * @author ferol
 */
public class Slots implements Serializable,Cloneable{
    Sprite sprite;
    tiposDeSprite tipo;
    boolean empty;

    public Slots() {
        empty = true;
        sprite = null;
    }
    
    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
        this.setEmpty(false);
    }

    public tiposDeSprite getTipo() {
        return tipo;
    }

    public void setTipo(tiposDeSprite tipo) {
        this.tipo = tipo;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    
    public void llenarSlot(Sprite sprite){//Sprite con su tipo y actualizar los valores
            setSprite(sprite);
            setTipo(sprite.tipo);
            setEmpty(false);
    }
    
    public void vaciarSlot(){
            setSprite(null);
            setTipo(null);
            setEmpty(true);
    }
}
