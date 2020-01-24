import objectdraw.*;

public class Doot extends WindowController {

    public void onMousePress(Location point){
        new Text("Hello World!", point.getX(), point.getY(), canvas);
        new FramedOval(point.getX(), point.getY(), 100, 100, canvas);
        new Line(point.getX() - 42,point.getY() - 42, point.getX() + 42, point.getY() + 42, canvas);
        new Line()
    }

    public void onMouseRelease(Location point){
        canvas.clear();
    }

    public static void main(String[] args){
        new Doot().startController(500, 500);
    }
}
