package vehiculos;

import java.util.ArrayList;

public class Fabricante {

    public Fabricante(String nombre,Pais pais){

        this.nombre=nombre;
        this.pais=pais;
        this.pais.setVentas();
        fabricas.add(this);
    }

    public String getNombre(){

        return nombre;
    }

    public Pais getPais(){

        return pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int aux=0;
        Fabricante top=new Fabricante(null, null);
        for(Fabricante f: fabricas){

            if(f.ventas>aux){top=f;} else{continue;}
        }

        return top;
    }

    
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricas=new ArrayList<Fabricante>();
    private int ventas;
}
