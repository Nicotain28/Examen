public class Punto implements Grafico{
    public int x;
    public int y;

    public Punto(int x, int y) throws ExceptionFueraPantalla {
        try {
                if (x > 800 | x < 0 | y > 600 | y < 0){
                    throw new ExceptionFueraPantalla();
                }
                else {
                    this.x = x;
                    this.y = y;
                }
        } catch (ExceptionFueraPantalla ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public boolean mover(int x, int y) {
        this.x += x;
        this.y += y;
        return Grafico.super.mover(this.x, this.y);
    }

    @Override
    public void dibujar() {
        System.out.println("X: " + this.x + "Y: " + this.y);
    }
}

