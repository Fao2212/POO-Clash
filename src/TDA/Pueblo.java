/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class Pueblo implements Serializable,Cloneable{
    
    private Slots size[][];


    public Pueblo() {
        this.size = new Slots[15][15];
        initPueblo();
        
    }

    public Slots[][] getSize() {
        return size;
    }

    public void setSize(Slots[][] size) {
        this.size = size;
    }
    
    public void initPueblo(){
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                size[i][j] = new Slots();
            }
        }

    }
    
    public void imprimirPueblo(){
        System.out.println("------------------------");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println(size[i][j]);
            }
        }
        System.out.println("------------------------");
    }
}
