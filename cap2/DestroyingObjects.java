import java.time.format.TextStyle;

public class DestroyingObjects {

    //As a prpgrammer all you can do is make an object be available for garbage collection. When it is collected is not up to you
    //System.gc(); can be used to sugest the JVM to perform garbage collection.

    //Tracing elegibility:
    //An objecti is not longer reachable when:
    //- The object no longer has references ponting to it
    //- All references to the object have gone out of scope

    char testingChar;

    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String ("b");
        one = two; //here object with String("a") is available for garbage collection
        String three = one;
        one = null;
        System.out.println(new DestroyingObjects().testingChar);
        // b is available for garbage collection when method ends
    }
    
}

