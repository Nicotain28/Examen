public class GraficoCompuesto implements Grafico{
    private final Grafico[] conjunto;

    public GraficoCompuesto(Grafico[] conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public boolean mover(int x, int y){
        boolean correcto = false;
        for (Grafico grafico : this.conjunto) {
            if (grafico.mover(x, y)) {
                correcto = true;
            } else {
                correcto = false;
                break;
            }
        }
        return correcto;
    }

    @Override
    public void dibujar() {
        for (Grafico grafico : this.conjunto) {
            grafico.dibujar();
        }
    }
}
