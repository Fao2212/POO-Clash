/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Enums.tiposDeDefensa;
import Enums.tiposDeGuerrero;
import GUI.Animation;
import GUI.frameNuevoSprite;
import clash.Administrator;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author ferol
 */
public class ControladorNuevoSprite {
    
    frameNuevoSprite formNuevoSprite;
    Administrator administrador;
    DefaultComboBoxModel defensas,guerreros;
    String[] nombreDef,nombreGue;

    public ControladorNuevoSprite() {
    }

    public ControladorNuevoSprite(Administrator admin) {
        formNuevoSprite = new frameNuevoSprite(this);
        administrador = admin;
        nombreDef = new String[tiposDeDefensa.values().length];
        nombreGue = new String[tiposDeGuerrero.values().length];
        setArrays();
    }
    
    public final void setArrays(){
        
        for (int i = 0; i < tiposDeDefensa.values().length; i++) {
            nombreDef[i] = tiposDeDefensa.values()[i].name();
        }
        for (int i = 0; i < tiposDeGuerrero.values().length; i++) {
            nombreGue[i] = tiposDeGuerrero.values()[i].name();
        }
        defensas = new DefaultComboBoxModel(nombreDef);
        guerreros = new DefaultComboBoxModel(nombreGue);
    }
    
    public void cambioDeInterfazGuerrero(){
        formNuevoSprite.tfCosto.setVisible(true);
        formNuevoSprite.tfCampos.setVisible(true);
        formNuevoSprite.labelCampos.setVisible(true);
        formNuevoSprite.labelCosto.setVisible(true);
        formNuevoSprite.comboTipo.setModel(guerreros);
    }
    
    public void cambioDeInterfazDefensa(){
        formNuevoSprite.tfCosto.setVisible(false);
        formNuevoSprite.tfCampos.setVisible(false);
        formNuevoSprite.labelCampos.setVisible(false);
        formNuevoSprite.labelCosto.setVisible(false);
        formNuevoSprite.comboTipo.setModel(defensas);
    }
    
    public void crearSprite(){//Revisar el getselected//Revisar que solo entren datos validos
        System.out.println(formNuevoSprite.comboTipo.getSelectedItem());
        int dano[] = {Integer.parseInt(formNuevoSprite.tfDano.getText()),Integer.parseInt(formNuevoSprite.tfVelocidadAtaque.getText())};
        Animation animation = null;//Cambiar a nuevas animaciones
        if(formNuevoSprite.radiosGuerrero.isSelected())
            administrador.nuevoGuerrero(tiposDeGuerrero.valueOf(formNuevoSprite.comboTipo.getSelectedItem().toString()), animation, Integer.parseInt(formNuevoSprite.tfCampos.getText()), Integer.parseInt(formNuevoSprite.tfVida.getText()),
                    dano, Integer.parseInt(formNuevoSprite.tfNivelAparicion.getText()), formNuevoSprite.tfNombre.getText(), Integer.parseInt(formNuevoSprite.tfCosto.getText()), Integer.parseInt(formNuevoSprite.tfCosto.getText()));
       else
            administrador.nuevaDefensa(tiposDeDefensa.valueOf(formNuevoSprite.comboTipo.getSelectedItem().toString()), animation,
                    Integer.parseInt(formNuevoSprite.tfVida.getText()), dano, Integer.parseInt(formNuevoSprite.tfNivelAparicion.getText()), formNuevoSprite.tfNombre.getText(), Integer.parseInt(formNuevoSprite.tfRango.getText()));
            }
    
    public void iniciarPantalla(){
                java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                formNuevoSprite.setVisible(true);
            }
        });
    }
    
    /*private void matchType(String tipo,int mode){
        tiposDeDefensa[] lista;
        if(mode == 0)
            lista = tiposDeDefensa.values();
        else if(mode == 1)
            lista = tiposDeGuerrero.values();
        f*/
        
    
}
//Ajustar combo box