/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class Pueblo {
    
    private Slots size[][];


    public Pueblo() {
        this.size = new Slots[15][15];
    }

    public Slots[][] getSize() {
        return size;
    }

    public void setSize(Slots[][] size) {
        this.size = size;
    }
    
}
