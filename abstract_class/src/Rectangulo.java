public class Rectangulo extends FiguraGeometrica{
    int ancho;
    int alto;
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public double area() {
        return alto * ancho;
    }
}
