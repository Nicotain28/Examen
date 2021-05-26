import Libreria.pide;
import Libreria.pide.*;
public class EditorGrafico {
    private Grafico grafico;

    public static void main(String[] arg) throws ExceptionFueraPantalla {
        boolean correcto = true;
        try {
            Punto punto = new Punto(pide.numero("Escribe la x del punto: "), pide.numero("Escribe la y del punto: "));
            Circulo circulo = new Circulo(pide.numero("Escribe la x del circulo: "), pide.numero("Escribe la y del circulo: "), pide.numero("Escribe el radio del circulo: "));
            Rectangulo rectangulo = new Rectangulo(pide.numero("Escribe la x del rectangulo: "), pide.numero("Escribe la y del rectangulo: "), pide.numero("Escribe el alto del rectangulo: "), pide.numero("Escribe el alto del rectangulo: "));
        } catch (ExceptionFueraPantalla exceptionFueraPantalla) {
            correcto = false;
        }
        if (correcto){
            Grafico[] conjunto = new Grafico[3];
            conjunto[0] = punto;
            conjunto[1] = circulo;
            conjunto[2] = rectangulo;
            GraficoCompuesto graficoCompuesto = new GraficoCompuesto(conjunto);
            while (true){

            }
        }
    }
}
