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
public class Concesionaria {
    private MotoBuilder motoBuilder;
    
    public void constructMoto(){
        motoBuilder.crearMoto();
        motoBuilder.buildMarca();
        motoBuilder.buildModelo();
        motoBuilder.buildMotor();
        motoBuilder.buildNeumaticos();
    }
    public void setMotoBuilder(MotoBuilder x){
        motoBuilder = x;
    }
    public Moto getMoto(){
        return motoBuilder.getMoto();
    }
}
