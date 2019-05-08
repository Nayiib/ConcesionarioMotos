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
public class YamahaBuilder extends MotoBuilder{
@Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(820560);
        motor.setPotencia("7750 rpm");
        moto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        moto.setModelo("TRACER 900 GT");
    }

    @Override
    public void buildMarca() {
        moto.setMarca("YAMAHA");
    }

    @Override
    public void buildNeumaticos() {
        moto.setCantidadDeNeumaticos(2);
    }
}
