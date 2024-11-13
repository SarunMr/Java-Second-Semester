



public class OperatorClass{
    public static void main(String[] args){
        //Arithmetic Operator +-*/%
        int a,b;
        a = 10;
        b = 20;
        int plus = a + b;
        int minus = a - b;
        int mul = a * b;
        int divide = a / b;
        int remainder = a % b;   //remainder

        //Assignment Operator = += *= -= /= %=
        int updatevar = 10;
        updatevar += 10;    //10 + 10 = 20
        updatevar -= 10;    //20 - 10 = 10
        updatevar *= 10;    //10 * 10 = 100
        updatevar /= 10;    //100 / 10 = 10
        updatevar %= 3;     //10 % 3 = 1

        //uranary operator 
        int i = 2;
        i ++;        //i += 1 increment operator
        i --;       //i -= 1  decrement operator

        //relational operator
        int reVar1 = 20, reVar2 = 30;
        boolean equalTo = reVar1 == reVar2;
        boolean greaterThan = reVar1 > reVar2;
        boolean lessthan = reVar1 < reVar2;
        boolean lessthanequalto = reVar1 <= reVar2;
        boolean notEqualto = reVar1 != reVar2;


        // Logical Operator
        int logVar1 = 10, logVar2 = 20, logVar3 = 23;
        boolean andOper = true && true;
        boolean orOper = false || false || true;
        boolean andOperVar = (logVar1 < logVar2)&& (logVar2 == logVar3);
        boolean orOperVar = (logVar1 < logVar2) || (logVar3 == logVar2);
        boolean notOper = !(logVar1 < logVar2);

        //Ternery Operator
        /*
        int marks = 40;
        String status;
        if (marks > 40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        
         */
        int marks = 40;
        String status = (marks > 40) ? "pass":"fail";
        System.out.println("Status : " +status);
    }
}