package vehiculos;

public class Camioneta extends Vehiculo{
    
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){

        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco=volco;

        Vehiculo.totalVehiculos(this);
    }

    public int getEjes(){

        return ejes;
    }

    public boolean isVolco(){

        return volco;
    }

    private int ejes;
    private boolean volco;

}
