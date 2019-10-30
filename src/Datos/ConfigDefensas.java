/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import TDA.Defensa;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class ConfigDefensas {
        public static void guardarNuevaDefensa(ArrayList<Defensa> defensas){//Una clase administrador que use todos los metodos estaticos
        if(defensas != null)
            FileManager.FileManager.writeObject(defensas, "Defensas.config");
        else
                System.out.println("Error al guardar");
    }
    
    public static ArrayList<Defensa> cargarDefensas(){
        return (ArrayList<Defensa>)FileManager.FileManager.readObject("Defensas.config");
    }
}
