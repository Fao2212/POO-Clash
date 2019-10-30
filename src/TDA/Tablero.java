/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import java.io.Serializable;

/**
 *
 * @author ferol
 */
public class Tablero implements Serializable,Cloneable{//Crear un thread para cada Sprite pueden desecharse , no se necesitan para guardar la partida
    
    private final Slots size[][];
    private final int DIMENSIONES = 70;//Tamano original 60 + evitar choques con nulos
    private final int ORIGENPUEBLO = (DIMENSIONES-10)/2-15;
    private Pueblo pueblo;
    
    public Slots[][] getSize(){
        return size;
    }

    public Tablero(Pueblo pueblo) {

        this.size = new Slots[DIMENSIONES][DIMENSIONES];
        this.pueblo = pueblo;
        initSlots();
        
    }
    
    public void setPueblo(){
        Slots saiso [][] = pueblo.getSize();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                size[ORIGENPUEBLO+i][ORIGENPUEBLO+j] = saiso[i][j];//Construir Slots?
            }
        }
        
    }
    
    public void asignarEspacio(Sprite sprite){
        //Que sea random funcion que lo haga a partir de 60 o 65
        if(size[0][0].isEmpty()){
            size[0][0].llenarSlot(sprite);
        }
    }
    
    public void initSlots(){
        for (int i = 0; i < DIMENSIONES; i++) {
            for (int j = 0; j < DIMENSIONES; j++) {
                size[i][j] = new Slots();
            }
            
        }
    }
    //Repetir para todos los espacios del tablero, Preguntar si tiene una piezaal moverse actualizar el slot
    //Fases, primero aparece, busca obetivo, se mueve hacia el centro o buscando las ciudades,luego vuelve a buscar obj
    //Cada vez que se mueven actualizan rango y buscan objetivo
    public void imprimirTablero(){
        for (int i = 0; i < DIMENSIONES; i++) {
            for (int j = 0; j < DIMENSIONES; j++) {
                System.out.println(size[i][j].sprite);
            }
        }
    }
}
