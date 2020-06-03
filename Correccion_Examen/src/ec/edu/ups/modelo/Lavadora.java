/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author braya
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(int codigo) {
        super(codigo);
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public double obtenerPrecioFinal() {
        double aumento=0.00;
        if(carga >30){
            aumento=50;
        }
        
        return super.obtenerPrecioFinal()+aumento;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLavadora: " + "\ncarga " + carga + " Precio Final: "+obtenerPrecioFinal() ;
    }
    
}
