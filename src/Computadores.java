public class Computadores {

        protected final static int PESO_BASE = 5;
        protected final static char CONSUMO_W ='F';
        protected final static double PRECIO_BASE = 100.0;
        protected double precioBase;
        protected char consumoW;
        protected int peso;

        public Computadores() {
            this(PRECIO_BASE,PESO_BASE,CONSUMO_W);
        }

        public Computadores(double precioBase, int peso) {
            this(precioBase, peso, CONSUMO_W);
        }
    
        public Computadores(double precioBase, int peso, char consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
        }

        public double calcularPrecio() {
            double adicion = 0.0;
            switch (consumoW){
                case 'A':
                    adicion += 100.0;
                    break;
                case'B':
                    adicion += 80.0;
                    break;
                case 'C':
                    adicion += 60.0;
                    break;
                case 'D':
                    adicion += 50.0;
                    break;
                case 'E':
                    adicion += 30.0;
                    break;
                case 'F':
                    adicion += 10.0;
                    break;    

            }

        if (peso >=0 && peso <19){
            adicion +=10.0;
        } else if (peso>=20 && peso<=49){
            adicion +=50.0;
        } else if (peso >= 50 && peso <= 79){
            adicion+=80.0;
        } else if (peso>=80){
            adicion+=100.0;
        }
        return precioBase + adicion;
        }
    
    public double getPrecioBase(){
        return precioBase;
    }

    public char getConsumoW(){
        return consumoW;
    }
    public int getPeso(){
        return peso;
    }

}
