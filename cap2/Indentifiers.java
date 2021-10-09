public class Indentifiers {
    
    //Rules
    //Must start with letter, $ or _
    //can include numbers but not start with them
    //_ not allowed as identifier
    //Cant use reserved word

    //valid declarations
    boolean b1, b2; // valid
    String s1 = 'S1', s2; //valid
    double d1, double d2; // invalid
    int i1; int i2; // valid
    int i3; i4; // invalid

    var inference = 1; //var is used to infer a type of variable. The value can be changed at runtime, the type cant


    //var can be used only for local variables
    //var is always initialized where it's declared
    //var can't be initiañlized with null without casting
    //var is not allowed in multi variable declaration
    //var is not a reserved word, but it is a reserved type name, so it can't ve used to define a class, interface or enum


}
