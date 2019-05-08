/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consesionariomotos;

import modelo.BMWBuilder;
import modelo.Concesionaria;
import modelo.Moto;

/**
 *
 * @author Zocalo
 */
public class ConsesionarioMotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionaria pedido = new Concesionaria();
        pedido.setMotoBuilder(new BMWBuilder());
        pedido.constructMoto();
        Moto moto = pedido.getMoto();
        
        System.out.println(moto.getMarca());
        System.out.println(moto.getModelo());
    }
    
}
