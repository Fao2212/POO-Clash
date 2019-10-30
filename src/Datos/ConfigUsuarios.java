/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import clash.User;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class ConfigUsuarios {
 
    
    public static void guardarNuevoUsuario(ArrayList<User> usuarios){//Una clase administrador que use todos los metodos estaticos
        if(usuarios != null)
            FileManager.FileManager.writeObject(usuarios,"Users.config");
        else 
            System.out.println("Error al guardar");
    }
    
    public static ArrayList<User> cargarUsuarios(){
        return (ArrayList<User>)FileManager.FileManager.readObject("Users.config");
    }

}
