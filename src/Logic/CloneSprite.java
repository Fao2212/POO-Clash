/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import TDA.Sprite;

/**
 *
 * @author ferol
 */
public class CloneSprite {//Esta clase esta de mas?
    public static Sprite spriteCloning(Sprite original) throws CloneNotSupportedException{
        return (Sprite)original.clone();
    }
}
