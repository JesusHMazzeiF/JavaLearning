package cap3;

public class NumericPromotion {
    //Rules of numeric promotion
    // 1 - If two values have different data types, Java will automatically promote one of the values to the larger of the two data types
    // 2 - If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating
    // point value's data type
    // 3 - Smaller data types namely byte, short, char are first promoted to int any time they're used with a Java binaru arithmetic operator
    // even if neither operand is int
    // 4 - After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted
    // operands

    // Third rule exception, unary operators. ++ to a short results in a short value

    public static void main(String[] args) {
        testing();
        testingTwo();
        testingThree();
        testingFour();
        testingPrecedence();
    }

    public static void testing(){
        int x = 1;
        long y = 33;
        var z = x * y;
        System.out.println("Type of value is " + ((Object)z).getClass());
        //What is the type of value of z
        //Because long is larger, variable x is promoted to long, so the result of long * long is long
    }


    public static void testingTwo(){
        double x = 39.21;
        float y = 2.1f; //without and f here it does not compile. Floating point literals are assumed double if they dont have an f
        var z = x + y;
        System.out.println("Type of value is " + ((Object)z).getClass());
        //What is the type of value of z
        //Because double is larger, variable y is promoted to double, so the result of double * double is double
    }
    
    public static void testingThree(){
        short x = 10;
        short y = 3;
        var z = x * y;
        System.out.println("Type of value is " + ((Object)z).getClass());
        //because all small types(byte, short, char) get promoted to int, x and y get promoted to int, which results in int
        // If z is of type short, the code will not compile because the result will always be an int
    }

    public static void testingFour(){
        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x /  y;
        System.out.println("Type of value is " + ((Object)z).getClass());
        //short gets promoted to int, then to float to be muliplied by float value x and the result is then promoted to double to be 
        // divided by double y. So result is double
    }

    public static void testingPrecedence() {
        int x = 4 / 4 * 3;
        System.out.println("result is : " + x );
    }

}
