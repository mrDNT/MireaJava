package Movable;

public class Test {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(1,1,1,1);
        System.out.println(point);
        point.moveDown();
        point.moveLeft();
        System.out.println("new x: " + point.x + ", y: " + point.y);
        MovableCircle circle = new MovableCircle(1,1,1,1,1);
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("new x: " + circle.x + ", y: " + circle.y);
        MovableRectangle rectangle = new MovableRectangle(1,1,1,1,1,1);
        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println("new x: " + rectangle.x + ", y: " + rectangle.y);
    }
}
