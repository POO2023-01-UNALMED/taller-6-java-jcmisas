package vehiculos;

import java.util.ArrayList;

public class Pais {

    public Pais(){}

    public Pais(String nombre){

        this.nombre=nombre;
        paises.add(this);
    }
    
    public String getNombre(){

        return nombre;
    }

    public int getVentas(){

        return ventas;
    }

    public static Pais paisMasVendedor(){
        int aux=0;
        Pais top=new Pais();
        for(Pais p: paises){

            if(p.ventas>aux){top=p;aux=p.ventas;} else{continue;}
        }

        return top;
    }

    public void setVentas(){

        ventas++;
    }

    private String nombre;
    private int ventas;
    private static ArrayList<Pais> paises=new ArrayList<Pais>();
}
