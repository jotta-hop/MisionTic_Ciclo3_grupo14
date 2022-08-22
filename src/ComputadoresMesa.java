
public class ComputadoresMesa extends Computadores {
    private final static int ALMACENAMIENTO_BASE = 50;
    private int almacenamiento;

    public ComputadoresMesa () {
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W, ALMACENAMIENTO_BASE);
    }

    public ComputadoresMesa(double precioBase, int peso){
        this(precioBase, peso, CONSUMO_W, ALMACENAMIENTO_BASE);
    }

    public ComputadoresMesa(double precioBase, int peso, char consumoW, int almacenamiento){
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    public double calcularPrecio() {
        double adicion = super.calcularPrecio();
        if(almacenamiento > 100){
            adicion += 50.0;
        }
        return adicion;
    }
    
}
