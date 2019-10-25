/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import TDA.Sprite;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferol
 */
public class ThreadSprite extends Thread{
    //animation.start
    //aparecer
    //pos
    //movimiento
    Sprite sprite;
    boolean running;

    public ThreadSprite(Sprite sprite, boolean running) {
        this.sprite = sprite;
        this.running = running;
    }
    
    @Override
    public void run() {
        while(running){
            sprite.doAction();
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
