public  class TaskDayFour{
    public static void main(String[] args){
        int passMarks = 40;
        int oopMarking = 85, architectureMarking = 90, databaseMarking = 80, creativeThinking = 88;
        float avg = (float)(oopMarking + architectureMarking + databaseMarking + creativeThinking) / 4;
        String status = (oopMarking > passMarks && architectureMarking > passMarks && databaseMarking > passMarks) && (avg > 50) ? "Good Job" : "Bad Job";
        System.out.println(status);
    }
}