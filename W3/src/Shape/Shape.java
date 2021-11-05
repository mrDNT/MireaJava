package Shape;

public abstract class Shape {
    protected String colour;
    protected boolean filled;
    public Shape(){
        this.colour = "no colour";
        this.filled = false;
    }
    public Shape(String colour,boolean filled){
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
