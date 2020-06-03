/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.controladorDao.ElectrodomesticosDAO;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author braya
 */
public class Principal {

    static VistaElectrodomestico vista = new VistaElectrodomestico();
    static Electrodomestico modelo = new Electrodomestico();
    static IElectrodomesticoDAO dao = new ElectrodomesticosDAO();
    static ControladorElectrodomestico contrlEle = new ControladorElectrodomestico(vista, modelo, dao);

    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Television "+(i+1));
            contrlEle.crearTelevision();
        }
        
        System.out.println("");
        System.out.println("Mostrar Televisiones");
        contrlEle.mostrarTelevision();
        System.out.println("--------------\n");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese lavadora "+(i+1));
            contrlEle.crearLavadora();
        }
        
        System.out.println("");
        System.out.println("Mostrar lavadoras");
        contrlEle.mostrarLavadoras();
    }
}
