import objectdraw.*;

import java.awt.*;

public class Sunrise extends WindowController {

    private FilledOval sun = new FilledOval();

    public void onMousePress(Location point){
        sun.moveTo(sun.getX(), sun.getY(), -5);
        System.out.println(sun.getLocation());
    }

    public void begin(){
        sun = new FilledOval(100, 250, 100, 100, canvas);
        sun.setColor(new Color(100, 0, 100));
    }
}
