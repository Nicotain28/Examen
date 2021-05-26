public class Circulo extends Punto{
    public int radio;

    public Circulo(int x, int y, int radio) throws ExceptionFueraPantalla {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("X: " + this.x + "Y: " + this.y + "Radio: " + this.radio);
    }
}
