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
public abstract class MotoBuilder {

    protected Moto moto;

    public Moto getMoto() {
        return moto;
    }

    public void crearMoto() {
        moto = new Moto();
    }

    public abstract void buildMotor();

    public abstract void buildModelo();

    public abstract void buildMarca();
    
    public abstract void buildNeumaticos();

}
