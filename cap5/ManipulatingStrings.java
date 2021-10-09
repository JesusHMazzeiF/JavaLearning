package cap5;

public class ManipulatingStrings {
    //A String is basically a sequence of characters
    //String class is special and does not need to be instatiatiated with the new keyword
    //String implements the interface CharSequence. 

    //Concatenation
    //This is placing one string before another and combining them
    //Concatenation rules with plus sign (+)
    //- if both operands are numeric, + means numeric addition
    //- if either operand is String, + means concatenation
    //- The expression is evaluated from left to right

    public static void concaExamples() {
        System.out.println(1 + 2);
        System.out.println("a" + "b");
        System.out.println("a" + "b" + 3);
        System.out.println(1 + 2 + "c");
        System.out.println("c" + 1 + 2);
    }
    
    public static void trickyConcat() {
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //should print "64"
    }

    //With strings += is a concatenation and it applies the same rules
    //String s = "1"; s+=2 is equal to s = + s + 2. SO it would be "12"

    public static void main(String[] args) {
        concaExamples();
        trickyConcat();
    }

}
