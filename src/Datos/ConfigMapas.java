/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import GUI.Mapa;
import java.util.ArrayList;


/**
 *
 * @author ferol
 */
public class ConfigMapas {//Guardar un archivo con los mapas creados, puedo hacer que la funcion tenga un constructor actualize el array hy lo guarde seguido
    public static void guardarNuevoMapa(ArrayList<Mapa> mapas){//Una clase administrador que use todos los metodos estaticos
        FileManager.FileManager.writeObject(mapas, "Mapas.config");
    }
    
    public static ArrayList<Mapa> cargarMapas(){
        return (ArrayList<Mapa>)FileManager.FileManager.readObject("Mapas.config");
    }
}
