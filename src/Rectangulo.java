public class Rectangulo extends Punto{
    public int ancho;
    public int alto;

    public Rectangulo(int x, int y, int ancho, int alto) throws ExceptionFueraPantalla {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("X: " + this.x + "Y: " + this.y + "Ancho: " + this.ancho + "Alto: " + this.alto);
    }
}
