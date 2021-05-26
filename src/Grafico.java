public interface Grafico {
    public default boolean mover(int x, int y){
        return !(x > 800 | y > 600);
    }
    public default void dibujar(){
    }
}
