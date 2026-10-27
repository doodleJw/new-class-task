abstract class Figure {
    public String name;
    /**private int height;
    private int width;
    private int length;
    private int radius;*/

    public Figure(String name){
        this.name = name;
    }

    abstract double getPerimeter();
    abstract double getArea();
}

public class sumFigure {
    public static double allPerimeter(Figure[] figures) {
        double allP = 0;
        for (Figure figure : figures) {
            allP += figure.getPerimeter();
        }
        System.out.printf("\n-------Периметр всех фигур: %f", allP);
        return allP;
    }

    public static double allArea(Figure[] figures) {
        double allA = 0;
        for (Figure figure : figures) {
            allA += figure.getArea();
        }
        System.out.printf("\n-------Площадь всех фигур: %f", allA);
        return allA;
    }
}
//System.out.printf("Периметр фигуры %s", name);

class Rectangle extends Figure {
        private double width;
        private double length;

        public Rectangle(String name, double width, double length) {
            super(name);
            this.length = length;
            this.width = width;
        }

        double getPerimeter() {
            double result = 2 * (width + length);
            System.out.printf("\nПериметр фигуры %s: %f", name, result);
            return result;
        }

        double getArea() {
            double result = width * length;
            System.out.printf("\nПлощадь фигуры %s: %f", name, result);
            return result;
        }
    }

    class Triangle extends Figure {
        private double sideA;
        private double sideB;
        private double sideC;

        public Triangle(String name, double sideA, double sideB, double sideC) {
            super(name);
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        double getPerimeter() {
            double result = sideA + sideB + sideC;
            System.out.printf("\nПериметр фигуры %s: %f", name, result);
            return result;
        }

        double getArea() {
            double lilP = getPerimeter() / 2;
            double result = Math.sqrt(lilP * (lilP - sideA) * (lilP - sideB) * (lilP - sideC));
            System.out.printf("\nПлощадь фигуры %s: %f", name, result);
            return result;
        }
    }

    class Circle extends Figure {
        private double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        double getPerimeter() {
            double result = 2 * Math.PI * radius;
            System.out.printf("\nПериметр фигуры %s: %f", name, result);
            return result;
        }

        double getArea() {
            double result = Math.PI * radius * radius;
            System.out.printf("\nПлощадь фигуры %s: %f", name, result);
            return result;
        }
    }
