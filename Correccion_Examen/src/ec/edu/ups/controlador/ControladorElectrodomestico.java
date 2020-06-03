/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorElectrodomestico{
    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDAO dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }


    public void crearTelevision() {
        modelo = vista.ingresarTelevision();
        dao.crearTelevision((Television) modelo);
    }

    public void crearLavadora() {
        modelo = vista.ingresarLavadora();
        dao.crearLavadora((Lavadora) modelo);
    }

   
    public void mostrarTelevision() {
        vista.mostrarTelevisiones(dao.mostrarTelevision());
    }

  
    public void mostrarLavadoras() {
        vista.mostrarLavadoras(dao.mostrarLavadoras());
    }
    
    
}
