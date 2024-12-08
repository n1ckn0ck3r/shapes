import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.print("Введите тип фигуры(0-прямоугольник; 1-окружность; 2-треугольник): ");
            if (!scanner.hasNextDouble()) continue;
            short type = scanner.nextShort();
            switch (type) {
                case 0:
                    System.out.print("Введите длину прямоугольника: ");
                    if (!scanner.hasNextDouble()) break;
                    double length = scanner.nextDouble();
                    System.out.print("Введите ширину прямоугольника: ");
                    if (!scanner.hasNextDouble()) break;
                    double width = scanner.nextDouble();
                    shapes[i] = new Rectangle(length, width);
                    break;
                case 1:
                    System.out.print("Введите радиус окружности: ");
                    if (!scanner.hasNextDouble()) break;
                    double radius = scanner.nextDouble();
                    shapes[i] = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Введите первую сторону треугольника: ");
                    if (!scanner.hasNextDouble()) break;
                    double a = scanner.nextDouble();
                    System.out.print("Введите вторую сторону треугольника: ");
                    if (!scanner.hasNextDouble()) break;
                    double b = scanner.nextDouble();
                    System.out.print("Введите третью сторону треугольника: ");
                    if (!scanner.hasNextDouble()) break;
                    double c = scanner.nextDouble();
                    shapes[i] = new Triangle(a, b, c);
                    break;
                default:
                    throw new RuntimeException("Такой фигуры нет");
            }
        }
        scanner.close();
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Площадь фигуры: " + shapes[i].calculateArea());
            System.out.println("Периметр фигуры: " + shapes[i].calculatePerimeter());
        }
    }
}
