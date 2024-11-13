public class UserOutput{
    public static void main(String[] args){
        // prints in same line
        System.out.print("This");
        System.out.print("is");
        System.out.print("Java \n");
        // adds a line break at the end
        System.out.println("Next print will start from next line");

        //print using formatting
        // \%f floating point, %d integral, %s String(any)
        System.out.printf("Temperatire %f degree celsius \n",30.22);
        //can use multiple placeholder
        System.out.printf("Name %s, Age %d, Weight %f","Sarun",16,62.0);
        //must match  and arranged according to the datatype
    }
}