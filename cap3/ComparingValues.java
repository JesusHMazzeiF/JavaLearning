package cap3;

public class ComparingValues {
    
    public static void main(String[] args) {
        trickQuestion();
        comparingObjects();
        instanceOfExample();
        openZoo(3.5);
        openZoo(5);
    }


    //There are binary operators that can help us compare two values. 
    //Equality operators
    // == for primitives: it says if the values are the same(returns true). For objects, it says if the variables reference the same object
    // != the opposite of the previous one. It says if they are different(returns true)

    //If the primitives are of different types, the smaller one gets promoted to the largest one.
    //The uses are:
    // - Comparin two numeric or character primitive types
    // - Comparing two boolean values
    // - Comparing two objects, including null and String values

    //CAN NOT COMPARE DIFFERENT TYPES, like boolean and string

    public static void trickQuestion() {
        boolean bear = false;
        boolean polarBear = (bear = true);
        System.out.println("polar Bear: " + polarBear);
        //Here it prints true. The key is that bear = false is not a comparisson, is an assignment. And the result of the assignment is true 
        // if it doesn't fail
        
    }

    public static void comparingObjects() {
        //Two objects are considered equal if they both referenct the same object, example;
        String s1 = "My String";
        String s2 = "My String";
        //WHY?
        System.out.println("Should be false: " + (s1 == s2)); // This prints false even though the strings content are the same. To compare content use equals()
        System.out.println("Should be true: " + s1.equals(s2));//This prints true because equals compares the content of the objects, which are the same String
        String s3 = s2;
        System.out.println("Should be true: " + (s2 == s3));// This prints true because we assigned s3 the reference of the object whose reference is stored in s2
    }

    //JAVA RETURNS TRUE IF COMPARING null == null

    //RELATIONAL OPERATORS
    //These operators compare two values and return a boolean value
    // - > returns true if the value on the left is strictly greater than the value on the right
    // - >= returns true if the value on the left is greater or equal than the value on the right
    // - < returns true if the value on the left is strictly less than the value on the right
    // - <= returns true if the value on the left is less or equal than the value on the right
    // - instanceof returns true is the reference that the variable on the left side points to in an instance of a class, subclass or 
    // class that implements a particular interface of named class to the right side of the operator

    //Numeric comparisson operators
    //The first four one only apply to numeric operands. If there arent the same type, they get promoted to the larger type

    //Instance of Operators:
    //Its useful to determine if an arbitrary object is member of a particular class or interface at runtime

    public static void instanceOfExample() {
        Integer zootime = Integer.valueOf(9);
        Number num = zootime;
        Object obj = zootime;

        System.out.println("num is instance of Object " + (num instanceof Object));
        System.out.println("zootime is instance of Object " + (zootime instanceof Object));
        System.out.println("num is instance of Integer " + (num instanceof Integer));
        System.out.println("zootime is instance of Number " + (zootime instanceof Number));
        System.out.println("obj is instance of Number " + (obj instanceof Number));
    }

    //example use of instance of
    public static void openZoo(Number time) {
        if(time instanceof Integer){
            System.out.println((Integer) time + " O'clock");
        }
        else 
            System.out.println(time);
    }

    //Its considered good practice to use instance of before casting from an object to a narrower type

    //NOTE. calling instance of on a null always returns false

}
