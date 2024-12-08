public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length >= 0 && width >= 0) {
            this.length = length;
            this.width = width;
        } else {
            throw new RuntimeException("There is no figure with such parameters");
        }
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public void setWidth(double newWidth) {
        width = newWidth;
    }
}
