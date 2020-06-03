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
public class Electrodomestico implements Comparable<Electrodomestico>{
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoElectrico;
    private int peso;

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double obtenerPrecioFinal(){
        double conEner=0.00;
        double vpeso=0.00;
        
        if(consumoElectrico=='A'){
            conEner=100;
        }else if(consumoElectrico=='B'){
            conEner=80;
        }else if(consumoElectrico=='C'){
            conEner=60;
        }else if(consumoElectrico=='D'){
            conEner=50;
        }else if(consumoElectrico=='E'){
            conEner=30;
        }else if(consumoElectrico=='F'){
            conEner=10;
        }
        
        if(peso>=0 && peso<=19){
            vpeso=10;
        }else if(peso>=20 && peso<=49){
            vpeso=50;
        }else if(peso>=50 && peso<=79){
            vpeso=80;
        }else if(peso>=80){
            vpeso=100;
        }
        return this.precioBase+conEner+vpeso;
    }

    
    @Override
    public String toString() {
        return "Electrodomesticos: " + "\ncodigo: " + codigo + "\ndescripcion: " + descripcion + "\nprecioBase: " + precioBase 
                + "\ncolor: " + color + "\nconsumoElectrico: " + consumoElectrico + "\npeso: " + peso ;
    }

    @Override
    public int compareTo(Electrodomestico electro) {
        return (int) (this.precioBase - electro.precioBase);
    }
    
    
}
