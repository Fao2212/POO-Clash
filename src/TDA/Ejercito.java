/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import GUI.Animation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 *
 * @author ferol
 */
public class Ejercito {
    
    private int cantidadDeCampos;
    private int cantidadMaximaDeCampos;
    private ArrayList<Guerrero> ejercito;//Podira declararse publico
    private ArrayList<Guerrero> guerreros;
    private int nivel;

    public int getCantidadDeCampos() {
        return cantidadDeCampos;
    }

    public void setCantidadDeCampos(int cantidadDeCampos) {
        this.cantidadDeCampos = cantidadDeCampos;
    }

    public int getCantidadMaximaDeCampos() {
        return cantidadMaximaDeCampos;
    }

    public void setCantidadMaximaDeCampos(int cantidadMaximaDeCampos) {
        this.cantidadMaximaDeCampos = cantidadMaximaDeCampos;
    }

    public ArrayList<Guerrero> getEjercito() {
        return ejercito;
    }

    public void setEjercito(ArrayList<Guerrero> ejercito) {
        this.ejercito = ejercito;
    }
    
    private void agregarGuerrero(String nombre)
        throws NoSuchMethodException, 
            InstantiationException, 
            IllegalAccessException, 
            IllegalArgumentException, 
            InvocationTargetException{
            Guerrero guerrero;
            for (int i = 0; i < guerreros.size(); i++) {
                if(nombre.equals(guerreros.get(i).nombre)){
                    if(validarCampos(guerreros.get(i).campos)){
                        guerrero = guerreros.get(i).getClass().getConstructor().newInstance();
                        darAtributos(guerrero, guerreros.get(i));
                        ejercito.add(guerrero);
                        cantidadDeCampos += guerreros.get(i).campos;
                        break;
                    }
                    else
                        System.out.println("No hay mas campo");
                }

            }
    }
    
    private boolean validarCampos(int campo){
        int total = cantidadDeCampos+campo;
        if(total <= cantidadMaximaDeCampos)
            return true;
        else
            return false;
        
    }
    private void subirDeNivel(){//Se puede implementar como una interfaz
        cantidadMaximaDeCampos += 5;
    }
    
    private void eliminarGuerrero(int index){//Buscar una manera de pasar el index o el guerrero
        cantidadDeCampos -= ejercito.get(index).campos;
        ejercito.remove(ejercito.get(index));
    }
    
    private void darAtributos(Guerrero nuevoGuerrero,Guerrero plantillaGuerrero){
        nuevoGuerrero.setAnimacion(plantillaGuerrero.getAnimacion());
        nuevoGuerrero.setCampos(plantillaGuerrero.getCampos());
        nuevoGuerrero.setCantidadDeVida(plantillaGuerrero.getCantidadDeVida());
        nuevoGuerrero.setGolpePorSegundo(plantillaGuerrero.getGolpePorSegundo());
        nuevoGuerrero.setNivelDeAparicion(plantillaGuerrero.nivelDeAparicion);
        nuevoGuerrero.setNombre(plantillaGuerrero.getNombre());
        nuevoGuerrero.setCosto(plantillaGuerrero.getCosto());
    }
}
