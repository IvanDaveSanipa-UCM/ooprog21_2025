import java.util.Scanner;

public class DebugFour1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

        DebugCircle circle = new DebugCircle(radius);

        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println("The area is " + circle.getArea());
    }
}
   
