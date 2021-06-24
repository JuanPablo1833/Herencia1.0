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
public class Memoria {
    
private String tipo;
private float ranuras;
private float VelocidadDeRelpoj;

    public Memoria() {
    }

    public Memoria(String tipo, float ranuras, float VelocidadDeRelpoj) {
        this.tipo = tipo;
        this.ranuras = ranuras;
        this.VelocidadDeRelpoj = VelocidadDeRelpoj;
    }

    public float getVelocidadDeRelpoj() {
        return VelocidadDeRelpoj;
    }

    public void setVelocidadDeRelpoj(float VelocidadDeRelpoj) {
        this.VelocidadDeRelpoj = VelocidadDeRelpoj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getRanuras() {
        return ranuras;
    }

    public void setRanuras(float ranuras) {
        this.ranuras = ranuras;
    }

    @Override
    public String toString() {
        return "Memoria{" + "tipo=" + tipo + ", ranuras=" + ranuras + ", VelocidadDeRelpoj=" + VelocidadDeRelpoj + '}';
    }

    
}
