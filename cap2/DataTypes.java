public class DataTypes {

    public static void main(String[] args) {
        // data types
        boolean someBoolean = false; // true or false
        byte someByte = 1; // 8-bit integral value, example 123
        short someShort = 1; // 16-bit integral value, example 123
        int someInt = 1; // 32-bit integral value, example 123
        long someLong = 1200; // 64-bit integral value, 123L
        float someFloat = 1.3F; // 32-bit floating point value, 123.33f
        double someDouble = 1.3; // 64-bit floating point value, 123.33
        char soemCHar = 'a'; // 16-bit unicode vlaue
        // Interchangeably types    
        short shortChar = 'c';
        char charShort = (short) 83;

        System.out.println(shortChar);
        System.out.println(charShort);

        //only posible if short value does not exceed the limit
    }

}
