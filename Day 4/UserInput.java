
import java.util.Scanner;


public class UserInput{
    public static void main(String[] args){
        //import scanner class at the top of the file
        //import java.util.scanner;
        //Make an object of scanner and take input from object
        Scanner scan = new Scanner(System.in);
        System.out.println("Your age? ");
        int ageInput = scan.nextInt();

        System.out.println("Over 18? ");
        boolean over18Input = scan.nextBoolean();

        System.out.println("Your weight: ");
        double weightInput = scan.nextDouble();
        //after using scanner for primitive daata and want input for String
        // you need to clear the enter input
        scan.nextLine();
        System.out.println("Your name?");
        String name = scan.nextLine();
        scan.close();
    }
}