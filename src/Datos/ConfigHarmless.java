/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import TDA.Harmless;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class ConfigHarmless {
    public static void guardarNuevoHarmless(ArrayList<Harmless> harmless){//Una clase administrador que use todos los metodos estaticos
        if(harmless != null)
            FileManager.FileManager.writeObject(harmless, "Harmless.config");
        else
            System.out.println("Error al guardar");
    }
    
    public static ArrayList<Harmless> cargarHarmless(){
        return (ArrayList<Harmless>)FileManager.FileManager.readObject("Harmless.config");
    }
}
