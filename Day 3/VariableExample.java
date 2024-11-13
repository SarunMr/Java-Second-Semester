
public class VariableExample{
    //Instance Variable
    int instanceVar = 100;

    static boolean staticVar = false;
    static void firstfunction(){
        //local variable user defined function vitra
        int localvariable = 300;
        System.out.println("Local Variable"+localvariable);
    }
    static  void typeCasting(){
        byte a = 10;
        short shortvar =  a;
        System.out.println("Convert byte into short " + shortvar);
        int b = 10;
        double doublevar = b;
        System.out.println("Convert int into double " + doublevar);

        //maile garne wala type conversion
        double gpamain = 3.6;
        int gpa = (int)gpamain;
        System.out.println(gpa);
        int floatprinter = (int)33.33f;

     }
    public static void main(String[] args) {
        // yo variavle hamro main function vitra ko
        int localvariable2 = 400;
        System.out.println("Local Variable"+localvariable2);

        //obj banau class ko nam var = new class()
        VariableExample objvar = new VariableExample();
        //access ko lagi  obj ko nam ani instance varible ko name
        System.out.println("Instance Variable"+objvar.instanceVar);

        //access ko lagi class name ani static varible ko nme
        System.out.println("Static Variable"+VariableExample.staticVar);
        firstfunction();
        typeCasting();

        //  
    }
}