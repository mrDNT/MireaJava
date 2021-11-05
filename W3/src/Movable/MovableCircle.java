package Movable;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint();
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x=x;
        center.y=y;
        center.xSpeed =xSpeed;
        center.ySpeed =ySpeed;
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
