/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.Partes;

/**
 *
 * @author Dell
 */
public class Procesador {
    
    
    
    private String Marca;
    private String Modelo;
    private float velocidad;

    public Procesador() {
    }

    public Procesador(String Marca, String Modelo, float velocidad) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Procesador{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", velocidad=" + velocidad + '}';
    }
    
    
}
