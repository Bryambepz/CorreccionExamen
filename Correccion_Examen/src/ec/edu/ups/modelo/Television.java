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
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean puertoHDMI;

    public Television(int codigo) {
        super(codigo);
    }

    public Television() {
    }
    
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public double obtenerPrecioFinal() {
        double aumento=0.00;
        if(resolucion>40){
            aumento=(super.obtenerPrecioFinal()*0.30)+super.obtenerPrecioFinal();
        }
        double aumentoHDMI=0.00;
        if(puertoHDMI==true){
            aumentoHDMI=50;
        }
        return super.obtenerPrecioFinal()+aumento+aumentoHDMI; 
    }

    @Override
    public String toString() {
        return super.toString()+"\nTelevision: " + "\nresolucion=" + resolucion + "\npuertoHDMI=" + puertoHDMI+"\nPRECIO FINAL: "+obtenerPrecioFinal();
    }
    
    
    
}
