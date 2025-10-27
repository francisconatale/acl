import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrado(5);
        FiguraGeometrica rectangulo = new Rectangulo(5,7);
        List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
        figuras.add(cuadrado);
        figuras.add(rectangulo);
        for (FiguraGeometrica figura : figuras){
            System.out.println("EL area del " + figura.getClass().getName() + " es :" + figura.area());
        }
    }
}
