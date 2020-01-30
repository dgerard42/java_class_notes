public class Sunrise extends WindowController {
        
        private FilledOval sun;

        public void onMouseClick(Location point){
                sun.moveTo(sun.getX(), sun.getY() - 5);

        }
}
