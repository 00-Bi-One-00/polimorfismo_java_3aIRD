public class TestingGeometrica {

    public static void main(String[] args) {
        FiguraGeometrica figura1 = new FiguraGeometrica("Rombo");
        figura1.setArea(12.46);
        System.out.println("\n");

        //Ejemplo de polimorfismo estatico: El programado indica cual metodo usar segun los parametros que envia 
        System.out.println(figura1.toString() + "\n");
        System.out.println("Area de la figura: " + figura1.toString(true));


        System.out.println("\n\n");
        Circulo circulo1 = new Circulo("Circulo_1", 10.5);
        //Ejemplo de polimorfismo dinamico: "java detecta que objeto es, para llamamr al metodo apropiado
        double a = circulo1.getArea();
        circulo1.setArea(a);

        System.out.println("------El area es: " + a +"------\n\n");

        System.out.println("Info de circulo: " + circulo1.toString());



        System.out.println("\n\n\n------------------------------------------------------------------------------------\n");
        Triangulo triangulo1 = new Triangulo("Triangulo_1", 8, 10);
        System.out.println("Info de Triangulo: " + triangulo1.toString());

           
        System.out.println("\n\n\n------------------------------------------------------------------------------------\n");
        Triangulo triangulo2 = new Triangulo("Triangulo_2", 4, 4, 4);
        System.out.println("Info de Triangulo: " + triangulo2.toString());


        double T1 = triangulo1.getArea();
        triangulo1.setArea(T1);
        System.out.println("------El area es: " + T1);

        
        System.out.println("Info de Triangulo: " + triangulo1.toString());


        double T2 = triangulo2.getPerimetro();
        triangulo2.setPerimetro(T2); 
        System.out.println("------El Perimetro es: " + T2); 


        System.out.println("Info de Triangulo: " + triangulo2.toString());

    }
}
