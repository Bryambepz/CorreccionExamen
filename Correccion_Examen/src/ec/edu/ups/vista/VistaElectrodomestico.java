/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class VistaElectrodomestico {
    private Scanner l;

    public VistaElectrodomestico() {
        l=new Scanner(System.in);
    }
    
    public Television ingresarTelevision(){
        Television tvnueva = new Television();
        l=new Scanner(System.in);
        System.out.println("Ingrese codigo");
        int codigo=l.nextInt();
        System.out.println("Ingrese Descripcion");
        String des=l.next();
        System.out.println("Ingrese Precio Base");
        int pB=l.nextInt();
        System.out.println("Ingrese color");
        String color=l.next();
        System.out.println("Ingrese Consumo de energia");
        char con=l.next().charAt(0);
        System.out.println("Ingrese Peso");
        int peso=l.nextInt();
        System.out.println("Ingrese Resolucion");
        int resolucion=l.nextInt();
        System.out.println("Confirme si tiene o no HDMI");
        Boolean confirmar=l.nextBoolean();
        
        tvnueva.setCodigo(codigo);
        tvnueva.setDescripcion(des);
        tvnueva.setPrecioBase(pB);
        tvnueva.setColor(color);
        tvnueva.setConsumoElectrico(con);
        tvnueva.setPeso(peso);
        tvnueva.setResolucion(resolucion);
        tvnueva.setPuertoHDMI(confirmar);
        return tvnueva;
    }
    
    public Lavadora ingresarLavadora(){
        l=new Scanner(System.in);
        System.out.println("Ingrese codigo");
        int codigo=l.nextInt();
        System.out.println("Ingrese Descripcion");
        String des=l.next();
        System.out.println("Ingrese Precio Base");
        int pB=l.nextInt();
        System.out.println("Ingrese color");
        String color=l.next();
        System.out.println("Ingrese Consumo de energia");
        char con=l.next().charAt(0);
        System.out.println("Ingrese Peso");
        int peso=l.nextInt();
        System.out.println("Ingrese Carga");
        int carga=l.nextInt();
        return new Lavadora();
    }
    
    public void mostrarTelevisiones(List<Television> televisiones){
        for (Television television : televisiones) {
            System.out.println("Televisiones: "+television);
        }
        System.out.println("");
    }
    
    public void mostrarLavadoras(List<Lavadora> lavadoras){
        for (Lavadora lavadora : lavadoras) {
            System.out.println("Lavadoras: "+lavadora);
        }
        System.out.println("");
    }
}
