
public class HelloInput {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Please enter your name");
                String name = keyboard.next();
                System.out.println("Hello " + name);
        }
}
