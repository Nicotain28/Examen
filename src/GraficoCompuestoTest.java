import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraficoCompuestoTest {

    @Test
    void movertest() throws ExceptionFueraPantalla {
        Grafico grafico1 = new Punto(400, 300);
        Grafico grafico2 = new Circulo(150, 400, 90);
        Grafico grafico3 = new Rectangulo(150, 400, 90, 180);
        Grafico[] conjunto = new Grafico[3];
        conjunto[0] = grafico1;
        conjunto[1] = grafico2;
        conjunto[2] = grafico3;
        Grafico conjuntoGrafico = new GraficoCompuesto(conjunto);
        assertTrue(conjuntoGrafico.mover(200, 100));
        assertFalse(conjuntoGrafico.mover(800, 600));

}
}