package vehiculos;

public class Vehiculo {
    
    public Vehiculo(String placa, int puertas, int vmax, String nombre, int precio, int peso, String traccion, Fabricante fabricante){

        this.placa=placa;
        this.puertas=puertas;
        velocidadMaxima=vmax;
        this.nombre=nombre;
        this.precio=precio;
        this.peso=peso;
        this.traccion=traccion;
        this.fabricante=fabricante;
    }

    public static String vehiculosPorTipo(){

        return "Automoviles: "+a+"\nCamionetas: "+cta+"\nCamiones: "+c;
    }

    public static void totalVehiculos(Object o){
        CantidadVehiculos++;

        switch(o.getClass().getSimpleName()){

            case("Automovil"):
                a++; break;
            case("Camion"):
                c++; break;
            case("Camioneta"):
                cta++; break;
        }
    }

    public String getPlaca(){

        return placa;
    }

    public int getPuertas(){

        return puertas;
    }
    public int getVelocidadMaxima(){

        return velocidadMaxima;
    }

    public String getNombre(){

        return nombre;
    }

    public int getPrecio(){

        return precio;
    }

    public int getPeso(){

        return peso;
    }

    public String getTraccion(){

        return traccion;
    }

    public Fabricante getFabricante(){

        return fabricante;
    }

    public static int getCantidadVehiculos(){

        return CantidadVehiculos;
    }

    public void setPlaca(String placa){

        this.placa=placa;
    }

    public int setPuertas(){

        return puertas;
    }
    public int setVelocidadMaxima(){

        return velocidadMaxima;
    }

    public String setNombre(){

        return nombre;
    }

    public int setPrecio(){

        return precio;
    }

    public int setPeso(){

        return peso;
    }

    public String setTraccion(){

        return traccion;
    }

    public Fabricante setFabricante(){

        return fabricante;
    }

    public static void setCantidadVehiculos(int c){

        CantidadVehiculos=c;
    }

    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static int CantidadVehiculos;
    private static int a,c,cta;

}
