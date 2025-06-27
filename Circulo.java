public class Circulo extends FiguraGeometrica {

    private double radio;
    private final  double PI = 3.1416;  //final define una constante

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Se genera un geter para consultar el valor de la constante "Pi"
    public double getPI() {
        return PI;
    }

    //Este metoodo sobre-scribe al heredado de "FiguraGeometrica", conserva la misma firma, pero su    @Override
    @Override
    public double getArea(){
        double area = this.PI * this.radio * this.radio;
        return area;
    }

    

    @Override
    public String toString() {
        return super.toString() + "Circulo [radio=" + radio + "]";
    }
    

}
