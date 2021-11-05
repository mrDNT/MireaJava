package Shape;

public class TestCircle {
    public static void main(String[] args) {
        Shape firstcircle = new Circle(3, "Red",false);
        System.out.println(firstcircle);
        Shape secondcircle = new Rectangle(6 , 2, "Green", true);
        System.out.println(secondcircle);
        Shape thirdcircle = new Square(21,"Blue",true);
        System.out.println(thirdcircle);
    }
}
