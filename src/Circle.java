public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new RuntimeException("There is no figure with such parameters");
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
