public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a >= 0 && b >= 0 && c >= 0 && a < (b + c) && b < (a + c) && c < (a + b)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new RuntimeException("There is no figure with such parameters");
        }
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter()/2;
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - a) *
                (halfPerimeter - b) *
                (halfPerimeter - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double newA) {
        a = newA;
    }

    public void setB(double newB) {
        b = newB;
    }

    public void setC(double newC) {
        c = newC;
    }
}
