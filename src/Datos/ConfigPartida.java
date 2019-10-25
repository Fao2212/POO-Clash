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
public class ConfigPartida {
    
        public static void guardarNuevaPartida(Partida partida){
        System.out.println(partida.getUser()+".config");
        FileManager.FileManager.writeObject(partida, partida.getUser()+".config");
    }
    
    public static Partida cargarPartida(String name){
        return (Partida)FileManager.FileManager.readObject(name);
    }
}
