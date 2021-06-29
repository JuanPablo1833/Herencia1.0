/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1833;

/**
 *
 * @author Dell
 */
public class Animal {
    
    private String TiempDeVida;
    private String Especimen;
    private String Genero;

    public Animal() {
    }

    public Animal(String TiempDeVida, String Especimen, String Genero) {
        this.TiempDeVida = TiempDeVida;
        this.Especimen = Especimen;
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getTiempDeVida() {
        return TiempDeVida;
    }

    public void setTiempDeVida(String TiempDeVida) {
        this.TiempDeVida = TiempDeVida;
    }

    public String getEspecimen() {
        return Especimen;
    }

    public void setEspecimen(String Especimen) {
        this.Especimen = Especimen;
    }

    @Override
    public String toString() {
        return "Animal{" + "TiempDeVida=" + TiempDeVida + ", Especimen=" + Especimen + ", Genero=" + Genero + '}';
    }
    
    
    
    
    
}
