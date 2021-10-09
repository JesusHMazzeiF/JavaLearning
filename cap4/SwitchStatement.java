package cap4;

public class SwitchStatement {
    //A switch statement is a complex decision-making structure in which a single value is evaluated and flow
    //is redirected to the first matching branch, known as a case statement. If there is no match then an optional default
    //statement will be called. If there is no default, the whole switch will be skipped
    //Switch statemend may contain 0 or more case statements. It can have optional breaks
    
    public static void main(String[] args) {
        simpleSwitchexample(0);
    }
    
    //Syntax
    public static void wrongSwitchSyntax() {
        int month = 5;
        // switch month { //missing parenthesis
        //     case 1:
        //         System.out.println("January!");
        // }

        // switch (month) // missing brackets
        //     case 1:
        //         System.out.println("January!");
        
        // switch (month) {
        //     case 1: 2: // missing case keyword before label 2
        //         System.out.println("January!");
        // }

        // switch (month) {
        //     case 1 || 2: //Short circuit boolean operator which can not me used with numeric values. 
        //     // | can work because it acts as a bitwise operation. So it would be the result of 1 | 2 which is 3
        //         System.out.println("January!");
        // }

    }

    //switch can have 0 cases
    
    //Switch Data Types

    //Boolean, Long, Float and Double are not allowed to be used as a switch statement
    //The following data types are allowed
    // int and Integer, byte and Byte, short and Short, char and Character, String, enum values and 
    // var(if the type resolves to one of the preceding types)

    //Maybe its easier to remember than boolean, long, float, double or any of their wrapper classes are not allowed 
    // to be used as switch statements

    //Switch flow control.

    public static void simpleSwitchexample(int dayOfWeek) {
        switch(dayOfWeek){
            default: 
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6: 
                System.out.println("Saturday");
            break;
        }
        //break statements terminate the switch statement. If there is no break, the flow will continue to the next case or default
        //block

        //There is no requirement that the case or default statement be in a particular order, unless you are going to have pathways
        //that reach multiple sections of switch block
        //The default only matches if there is no other match in any of the other cases

        //If there are no breaks, the code will keep executing case statements AFTER it matches until it finds a break, or the 
        //switch statement ends

        //BEWARE OF MISSING BREAKS
    }

    //Acceptable case values
    //The values in each case statement must be compile-time constant values of the same data type as the switch value
    //This means you can only use literals, enum constants or final constants variable of the same data type
    final static int getCookies() {return 4;}
    public static void wronkCaseValues() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch(numberOfAnimals){
            case bananas:
            // case apples: //DOES NOT COMPILE; NOT FINAL
            // case getCookies(): //DOES NOT COMPILE, METHODS ARE NOT EVALUATED UNTIL RUNTIME
            // case cookies://DOES NOT COMPILE, METHODS ARE NOT EVALUATED UNTIL RUNTIME
            case 3*5: //DOES COMPILE; expressions are valid as long as the value can be calculated at compile time
            // and the resulting type has to match the switch statement without any explicit casting
        }
    }

    public static int longSwitch(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName){
            case "Test":
                return 52; //can act as a break because it exits the method
            case middleName: //Not constant
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: //Even though is final, is not constant and known at runtime
                id = 8;
                break;
            case 5: //wrong data type
                id = 7;
                break;
            case 'J': //wrong data type
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: //wrong data type
                id = 15;
                break;
        }
        return id;
    }

    //Numeric promotion and Casting
    //Switch statements support numeric promotion that does not require explicit cast
    public static void switchNumPromotion() {
        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        switch(size){
            case small:
            case 1+2:
            case big://Does not fit in a short
        }
    }
}
