package cap4;

public class DoWhile {
    // Do while loop works like the while loop but its executed 1 or more times,
    // meaning at least one time the
    // statements block is executed
    public static void doWhile() {
        int lizard = 0;
        do{
            lizard++;
        }while(false);   
        System.out.println("Lizard is: " + lizard);
        //Even though the condition is never met(its alwas false) the statments run once, meaning lizard ends in 1
    }

    //TIP: While and Do/While loops can be converted to work exactly the same way, but its better to use while when the code
    //needs to be executed 0 times, and do while when the code needs to be run at least once
}
