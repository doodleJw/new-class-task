public class Main{
    public static void main(String []args) {
        Circle circle = new Circle("Круг", 5);
        Rectangle rectangle = new Rectangle("Прямоугольник",4, 5);
        Triangle triangle = new Triangle("Треугольник",3, 4, 5);
        Figure[] figures = {rectangle, circle, triangle};
        sumFigure.allPerimeter(figures);
        sumFigure.allArea(figures);
    }
}


