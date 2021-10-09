package cap3;

public class LogicalOperators {

    public static void main(String[] args) {
        logicalOperatorsExamples(true, false);
        shortCircuitOperators();
    }

    //Logical Operators
    // - & Logical AND is true only if both values are true
    // - | Logical OR is true if any of the values is true
    // - ^ Exclusive XOR is true only if one value is true and the other is false

    //Tips
    // - AND is only true if both operands are true
    // - OR is only true if any of the operands is true
    // - XOR is true if the values are different

    public static void logicalOperatorsExamples(boolean eyesClosed, boolean breathingSlowly) {

        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println("resting: " + resting);
        System.out.println("asleep: " + asleep);
        System.out.println("awake: " + awake);
    }

    //Short circuit operators
    // Short circuit operators are logical operators that do not evaluate both values if the first one fulfills the condition
    // - && does not evaluate the second one if the first one is false and returns false
    // - || does not evaluate the second one if the first one is true and returns true

    public static void shortCircuitOperators() {

        boolean isTrue = true || (1==2);
        boolean isFalse = false && (1==1);

        //Here isTrue will never evaluate the right operand and neither will isFalse

        //A more common example is to avoid a NullPointerException: for example

        String s1 = null;
        if(s1!=null && s1.equals("this")){
            System.out.println("whatever");
            //This will work because of the shortcircuit 
        }
        //This will blow up at runtime
        // if((s1!=null) & s1.equals("this")){
        //     System.out.println("this will blow up");
        // }

        //The same evaluation blows up because there is no short circuit operator being used


        //Checking for Unperformed side effects
        //Because short circuit operators can make it so a code is never executed, some assignment or change can never happen. for example
        int i1 = 0;
        int i2 = 1;
        if((i1 != 0) && (++i2>1)){
            System.out.println("Here i2 has not changed because of short circuit, i2: " + i2);
        }
        else
            System.out.println("Here i2 has not changed because of short circuit, i2: " + i2);
        
        if((i1 != 0) & (++i2>1)){
            System.out.println("Here i2 was changed with the expression ++i2 because there was no short circuit, i2: " + i2);
        }
        else
            System.out.println("Here i2 was changed with the expression ++i2 because there was no short circuit, i2: " + i2);

    }

}
