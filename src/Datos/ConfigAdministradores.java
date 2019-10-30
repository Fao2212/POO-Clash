/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import clash.Administrator;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class ConfigAdministradores {

    public static void guardarNuevoAdministrador(ArrayList<Administrator> administradores){//Una clase administrador que use todos los metodos estaticos
        if(administradores != null)
            FileManager.FileManager.writeObject(administradores, "Administrator.config");
        else
            System.out.println("Error al guardar");
    }
    
    public static ArrayList<Administrator> cargarAdministradores(){
        return (ArrayList<Administrator>)FileManager.FileManager.readObject("Administrator.config");
    }
}
