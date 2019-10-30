/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import clash.Partida;

/**
 *
 * @author ferol
 */
public class ConfigPartida {//Revisar como relacionar con cada usuario o si solo guardar el usuario con su partida actual
    //Boolean para las partidas en partida o fuera de partida
    
        public static void guardarNuevaPartida(Partida partida){
        System.out.println(partida.getUser()+".config");
        if(partida != null)
            FileManager.FileManager.writeObject(partida, partida.getUser()+".config");
        else
                System.out.println("Error al guardar");
    }
    
    public static Partida cargarPartida(String name){
        return (Partida)FileManager.FileManager.readObject(name);
    }
}
