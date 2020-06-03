/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladorDao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author braya
 */
public class ElectrodomesticosDAO implements IElectrodomesticoDAO{
    private SortedSet<Electrodomestico> electrodomesticos;

    public ElectrodomesticosDAO() {
        electrodomesticos=new TreeSet<>();
    }
    
    @Override
    public void crearTelevision(Television television) {
        electrodomesticos.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        electrodomesticos.add(lavadora);
    }

    @Override
    public List<Television> mostrarTelevision() {
        List<Television> televisiones = new ArrayList<>();
        for (Electrodomestico electroLista : electrodomesticos) {
            if(electroLista instanceof Television){
                televisiones.add((Television) electroLista);
            }
        }
        return televisiones;
    }

    @Override
    public List<Lavadora> mostrarLavadoras() {
        List<Lavadora> lavadoras = new ArrayList<>();
        for (Electrodomestico electrolista : electrodomesticos) {
            if(electrolista instanceof Lavadora){
                lavadoras.add((Lavadora)electrolista);
            }
        }
        return lavadoras;
    }
    
    
}
