/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.Partes;

import java.awt.Color;

/**
 *
 * @author Dell
 */
public class Laptop {
  
private String Marca;
private String Modelo;
private float alto;
private float ancho;
private Procesador procesador;
private Memoria memoria;

    public Laptop() {
    }

    public Laptop(String Marca, String Modelo, float alto, float ancho, Procesador procesador, Memoria memoria) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.alto = alto;
        this.ancho = ancho;
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
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

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Laptop{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", alto=" + alto + ", ancho=" + ancho + ", procesador=" + procesador + ", memoria=" + memoria + '}';
    }


   
}
