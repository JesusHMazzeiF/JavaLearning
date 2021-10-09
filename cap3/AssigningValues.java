package cap3;

public class AssigningValues {
    //BEWARE OF ASSIGNING ERRORS. THEY CAN BE EASILY OVERLOOKED
    //The assignment operator is a binary operator that modifies or assigns the variable on the left side with the result 
    //of the value on the right side of the equation.

    //example, the variable herd is being assign the value of 1
    int herd = 1;

    //Java will automatically promote from smaller to larger data types,
    //but it will throw a compile error if you try to go from larger to smaller

    //Casting values: Casting is a unary operator where one data type is explicitely interpreted as another data type. 
    //Casting is unnecessary when going to a larger type, but required when its going to a smaller data type
    //Casting is performed by placing the data type, in parentheris to the left of the value that will be casted
    //Example
    short shortHerd = (short) herd; // here we are casting a int to a short, without casting it would not compile

    //Casting can also be applied to objects and references. In those cases, no conversion is performed because casting is allowed
    //only if the underlying object is already a member of the class or interface

    //REMEMBER TO KEEP TRACK OF PARENTHESIS WHEN CASTING

}
