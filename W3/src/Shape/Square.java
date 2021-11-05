package Shape;

public class Square extends Rectangle{
    public Square() {
        width = 0;
        length = 0;
        colour = "no colour";
        filled = false;
    }
    public Square(double side){
        width = side;
        length = side;
        colour = "no colour";
        filled = false;
    }
    public Square(double side, String colour, boolean filled){
        width = side;
        length = side;
        this.colour = colour;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        width = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + width +
                ", colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }
}
