public class TaskFour{
    public static void main(String[] args){
  
        int age = Integer.parseInt(args[0]);
        String vote = (age > 18)?"You can vote.":"You cannot vote.";
        System.out.println(vote);
    }
}