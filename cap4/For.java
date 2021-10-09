package cap4;

public class For {
    //For Loop: It has the same boolean expression as the while and do while but it has two extra expressions, the initialization block
    // and the update statement.
    //for(initialization;booleanExpression;updateStatement){
    //      Body
    //}
    //This syntax allows us to have a lot of control in a single line of code, something that with whiles would take more code
    //Each section is separated by a semicolon. Also, the initialization and update sections may contain multiple statements separated
    //by commas
    //scope rules maintain
    
    // public static void badForCode() {
    //     for(int i = 0; i < 10 ; i++){
    //         System.out.println("My i: " + i);
    //     }
    //     System.out.println("My unreachable i: " + i);//DOES NOT COMPILE, variable i's scope is inside the for loop
    // }

    public static void simpleFoorLoop() {
        for(int i = 0; i < 5 ; i++){
            System.out.print(i + " ");
        }
    }

        //First the boolean expression is evaluated, if it evaluates to true, executes the body, then it executes the update statement
    //and evaluates the boolean exrpression again and does the same process, until the expression evaluates to false

    public static void simpleForInReverse() {
        for(var i = 4; i >= 0 ; i--){
            System.out.print(i + " ");
        }
    }

    //NOTE, beware of forward and backward loops, look for the initialization and the update to recognize where it's going

    public static void main(String[] args) {
        //simpleFoorLoop();
        //simpleForInReverse();
        // multipleTerms();
        weirdFor();
    }

    //Familiar cases in exam
    //Infinite Loop
    public static void infiniteFor() {
        for( ; ; ){
            System.out.println("Infinite Loop");
        }
    }

    //The components of the loop are optional

    //Multiple terms to the for statement
    public static void multipleTerms() {
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.println(y + " ");
        }
        System.out.println(x + " ");
    }

    //Redeclaring a variable in the initialization block
    // public static void redeclaringVar() {
    //     int x = 0;
    //     for(int x = 4; x < 5; x++){//DOES NOT COMPILE, cant redeclare a variable, only modify it
    //         System.out.println(x + " ");
    //     }

    //     int y = 0;
    //     for(y = 4; y < 5; y++){//Does compile because y is only being modified
    //         System.out.println(y + " ");
    //     }
    // }

    //Incompatible data types in initialization block
    // public static void typeMismatch() {
    //     int x = 0;
    //     for(long y = 0, int z = 4; x < 5 ; x++){//DOES NOT COMPILE, all variables must be the same type in the initialization block
    //         System.out.println(y + " ");
    //     }
    // }

    //Java allows you to modify the for variables inside the body.
    //BEWARE OF MODIFYING VARIABLES INSIDE THE BODY; this can cause erratic behavior

    public static void weirdFor() {
        int count = 0;
        BUNNY: for(int row = 1; row <= 3 ; row++)
            RABBIT: for(int col = 0; col < 3; col++){
                if((col + row) % 2 == 0)
                    break;
                count++;
            }
        System.out.println(count);
    }

}
