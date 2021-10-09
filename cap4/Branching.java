package cap4;

public class Branching {
    public static void main(String[] args) {
        nestedLoops();
        breakingLabel();
    }
    //Branching
    //Nested Loops
    //Is a loop that contains another loop inside it.

    public static void nestedLoops() {
        int [] [] myComplexArray = {{5,2,1,3}, {3,9,8,9}, {5,7,12,7}};
        for(int [] mySimpleArray : myComplexArray){
            for(int i = 0; i<mySimpleArray.length ; i++){
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    //Additional Optional Labels
    //Labels are optional pointers that allow the applications flow to jump to it or break from it. It is a single identifier proceeded
    //by a colon(:)
    public static void nestedLoopsWithLabel() {
        int [] [] myComplexArray = {{5,2,1,3}, {3,9,8,9}, {5,7,12,7}};
        OUTER_LOOP: for(int [] mySimpleArray : myComplexArray){
            INNER_LOOP: for(int i = 0; i<mySimpleArray.length ; i++){
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }
    //This would work exactly the same

    //The break statement
    //A break statemtn transfer the flow of countrol out to the enclosing statement.
    //Also can be used in loops(not for each) and it will end the loop early
    //The break statement can take the OPTIONAL_LABEL paramete. Without a label, it will end the nearest inner loop it is
    //currently in the process of executing
    //The optional label allows us to break out of a higher level loop

    public static void breakingLabel() {
        int [] [] list = {{1,13}, {5,2}, {2,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP: for(int i = 0; i<list.length; i++){
            System.out.println("BIGGER_LOOP");
            for(int j = 0; j<list[i].length;j++){
                System.out.println("SMALLER LOOP");
                if(list[i][j] ==searchValue){
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }

        if(positionX == -1 || positionY == -1){
            System.out.println("Value: " + searchValue + " not found");
        }
        else{
            System.out.println("Value: " + searchValue + " found at: (" + positionX + ", " + positionY + ")");
        }
    }
    //If we remove the LABEL the code would behave differently, and if we remove the break it will behave differently again

    //The continue statement
    //It is use to finish the execution of the current loop. It does not end it early
    //The continue can also have an OPTIONAL_LABEL
    //While the break statement returns control to the enclosing statement, the continue statement returns control to the boolean
    //expression of the loop that determines if the loop should continue. Like the break, it is applied to the nearest inner loop

    //The return statement
    //Return statements can be used as an alternative to using labels and break statements

    //Unreachable code
    //Code placed immediately after a break or continue statement is considered unreachable and this will make the code not compile
    //with a reason of "unreachable code"
    

    //Reviewing branching
    //while, do/while and fors can have optional labels, break and continue statements
    //switchs can have optional labels and break statements but not continue statements
}
