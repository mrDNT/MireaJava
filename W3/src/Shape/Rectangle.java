package Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        width = 0;
        length = 0;
        colour = "no colour";
        filled = false;
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
        colour = "no colour";
        filled = false;
    }
    public Rectangle(double width,double length, String colour, boolean filled){
        this.width = width;
        this.length = length;
        this.colour = colour;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
