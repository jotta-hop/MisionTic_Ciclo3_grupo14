public class ComputadoresPortatiles  extends Computadores{
    private final static int PULGADAS_BASE = 20;
    private int pulgadas;
    private boolean camaraITG;
    
    //Constructor
    public ComputadoresPortatiles() {
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W, PULGADAS_BASE, false);

    }


    // Constructor
    public ComputadoresPortatiles(double precioBase, int peso) {
        this(precioBase, peso, CONSUMO_W, PULGADAS_BASE, false);
    }
    //Constructor
    public ComputadoresPortatiles(double precioBase, int peso, char consumoW, int pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
        
    }

    public double calcularPrecio() {
        double adicion = super.calcularPrecio();
        if (pulgadas > 40){
            adicion += precioBase*0.3;
        }
        if(camaraITG){
           adicion += 50.0; 
        }
        return adicion;
    }
}
