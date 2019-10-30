/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import TDA.Guerrero;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class ConfigGuerreos {//Guardar un archivo con los guerreros guardados/Devuelve todos los guerreros en memoria
    
    public static void guardarNuevoGuerrero(ArrayList<Guerrero> guerreros){//Una clase administrador que use todos los metodos estaticos
        if(guerreros != null)
            FileManager.FileManager.writeObject(guerreros, "Guerreros.config");
        else
            System.out.println("Error al guardar");
    }
    
    public static ArrayList<Guerrero> cargarGuerreros(){
        return (ArrayList<Guerrero>)FileManager.FileManager.readObject("Guerreros.config");
    }
}
