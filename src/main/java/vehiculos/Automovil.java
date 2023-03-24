package vehiculos;

public class Automovil extends Vehiculo {
    
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){

        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);

        this.puestos=puestos;

        Vehiculo.totalVehiculos(this);


    }

    public int getPuestos(){

        return puestos;
    }

    private int puestos;


}
