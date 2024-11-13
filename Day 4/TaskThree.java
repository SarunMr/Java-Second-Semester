
import java.util.Scanner;

public class TaskThree{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base of triangle? ");
        float base_triangle = scan.nextFloat();
        System.out.print("Enter height of triangle? ");
        float height_triangle = scan.nextFloat();

        System.out.println("Area of Triangle = "+ (1/2.0)*base_triangle*height_triangle);

        System.out.print("Enter length of cuboid? ");
        float length = scan.nextFloat();
        System.out.print("Enter width of cuboid? ");
        float width = scan.nextFloat();
        System.out.print("Enter height of cuboid? ");
        float height = scan.nextFloat();
        System.out.print("Volume of Cuboid =" + (length*width*height));
        
        System.out.print("Enter side of cube? ");
        float side = scan.nextFloat();
        System.out.print("Volume of Cube =" + (side * side  * side));



        scan.close();


    }
}