import  java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Principle? ");
        int principle =  scan.nextInt();
        System.out.print("Enter Time?");
        float time = scan.nextFloat();
        System.out.print("Enter Rate?");
        float rate = scan.nextFloat();

        float SI = (float)(principle * time * rate) / 100;
        System.out.println("Simple Intrest = "+ SI);
        scan.close();
    }
}