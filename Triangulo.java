public class Triangulo extends FiguraGeometrica{

    private double base;
    private double lad1; 
    private double lad2;
    private double altura;

    public Triangulo(String nombre, double base,double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String nombre, double base, double lad1, double lad2) {
        super(nombre);
        this.base = base;
        this.lad1 = lad1;
        this.lad2 = lad2;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getLad1() {
        return lad1;
    }
    public void setLad1(double lad1) {
        this.lad1 = lad1;
    }

    public double getLad2() {
        return lad2;
    }
    public void setLad2(double lad2) {
        this.lad2 = lad2;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea(){
        double area = ((base * altura)/2);
        return area;
    }

    @Override
    public double getPerimetro(){
        double perimetro = base + lad1 + lad2;
        return perimetro;
    }


    @Override
    public String toString() {
        return super.toString() + "Triangulo [base=" + base + ", lad1=" + lad1 + ", lad2=" + lad2 + ", altura=" + altura + "]";
    }
    

    

    

}
