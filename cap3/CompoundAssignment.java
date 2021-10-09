package cap3;

public class CompoundAssignment {
    //Compound assignments
    // += adds the value to the right to he variable on the left
    // -= substracts the value to the right to he variable on the left
    // *= multiplies the value to the right to he variable on the left
    // /= divides the value to the right to he variable on the left

    //Basically are the simplest form of applying an arithmetic operator to a variable
    // myVariable += 1; is the shorthand version of writing myVariable = myVariable + 1;

    //Compound operators can be used only for already declared variables. It cant be used to initialize a variable

    //The compound operator can save us from explicitely casting a variable to another one.
    //Example
    public static void simpleOperator() {
        long goat = 10;
        int sheep = 5;
        sheep = sheep * (int)goat; // This would not compile without casting
    }

    public static void compoundOperator() {
        long goat = 10;
        int sheep = 5;
        sheep *= goat;
        //If we use the compound operator instead, sheep first gets promoted to long(as always), and then the resuld of the multiplication is casted
        //back to int by the compiler
    }

}
