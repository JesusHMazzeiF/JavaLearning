package cap4;

public class While {

    public static void main(String[] args) {
        mouseEating(10);
    }

    //A loop is a repetitive control structure that can execute a statement of code multiple times in succession.
    //By making use of variables being able to be assigned new values, each repetition may be different

    public static void simpleLoop() {
        int counter = 0;
        while(counter < 10){
            double price = counter * 10;
            System.out.println(price);
            counter++;
        }
        //Here the while loop will execute until the counter reaches 9. NOTE, the while statement variable has to be modified, or
        //it will result in an infinite loop

        //the while statement, as all repetition structures has a termination condition, implemented as a boolean expression that will 
        //continue as long as the expression evaluates to true
        
    }

    public static void mouseEating(int bitesOfCheese) {
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0){
            bitesOfCheese--;
            roomInBelly--;
        }

        System.out.println(bitesOfCheese+" pieces of chese left");
        
    }

    //Loops can be executed 0 or more times
}
