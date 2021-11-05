package Movable;

public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();
    public MovableRectangle(int x1, int y1,int x2,int y2,
                            int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = bottomRight.xSpeed = xSpeed;
        topLeft.ySpeed = bottomRight.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y += ySpeed;
        bottomRight.y += ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= ySpeed;
        bottomRight.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= xSpeed;
        bottomRight.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += xSpeed;
        bottomRight.x += xSpeed;
    }
}
