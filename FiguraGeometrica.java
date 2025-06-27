public class FiguraGeometrica{
    private String nombre;
    private double area;
    private double perimetro;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    //Ejemplo de polimorfismo estatico o parametrico
    //Sobrecarga de metodos
    public FiguraGeometrica(String nombre, double area) {
        this.nombre = nombre;
        this.area = area;
    }


    public FiguraGeometrica(String nombre, double area, double perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //Polimorfismo dinamico (sobre escritura de metodos)
    //sobrescribir el metodo toString que se hereda de object
    //El metodo deve cumplir con el tipo de regreso y los paramatros del heredados
    @Override
    public String toString() {
        return "FiguraGeometrica [nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + "]";
    }

    public String toString(boolean dato){
        if (dato == true) {
            return String.valueOf(this.area);
        }
            return String.valueOf(this.perimetro);
    }
    
}