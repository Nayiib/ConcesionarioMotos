/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Zocalo
 */
public class Moto {
    private int cantidadDeNeumaticos;
    private String modelo;
    private String marca;
    private Motor motor;
    
    public int getCantidadDeNeumaticos(){
        return cantidadDeNeumaticos;
    }
    public void setCantidadDeNeumaticos(int cantidadDeNeumaticos){
        this.cantidadDeNeumaticos=cantidadDeNeumaticos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor){
        this.motor= motor;
    }
}