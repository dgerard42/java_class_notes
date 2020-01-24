import objectdraw.*;

import java.util.Scanner;

public class IntInput extends WindowController{
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Please enter the width and height that you want the canvas to be");
                int width = keyboard.nextInt();
                int height = keyboard.nextInt();
                new VariableCanvas().startController(width, height);
        }
}
