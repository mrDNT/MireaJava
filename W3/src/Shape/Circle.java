package Shape;

public class Circle extends Shape {
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String colour, boolean filled){
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
