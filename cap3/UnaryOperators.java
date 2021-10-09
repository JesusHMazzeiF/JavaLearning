package cap3;

public class UnaryOperators {
    //Operators are used to execute operations on variables
    //Operations have operator and operands. Operands are the values that the operator is working on
    int result = 2 + 3;
    //Here 2 and 3 are operands of the operator + and the result of 2+3 and result are operands of the operator =
    //There are three types of operators
    //unary: only one operand
    //binary: two operands
    //ternary: 3 operands

    //Unary operators are 
    // ! inverts a booleands logical value
    // + Indicates a number is positive(by default all numbers are)
    // - Indicates a number is negative(if not present, numbers are always positive)
    // -- Decreases a value by 1
    // ++ increments a value by one
    // (type) casts a value to a specific type
    public static void main(String[] args) {
        boolean cond = false;
        int increment = 5 ;
        int decrement = -5;
        if(!cond){
            increment++;
            decrement--;
        }
        System.out.println("Increment is: " +  increment);
        System.out.println("decrement is: " +  decrement);
        System.out.println("casting decrement to double: " +  (double) decrement);
               
        System.out.println("Pre and post decrement and increment");
        incrementAndDecrement();

    }

    //BEWARE OF WHAT OPERATORS ARE BEING APPLIED TO.
    //IN java 1 and true are not related in any way, nor are 0 and false

    // -- and ++ have a high order of precedence. They often get applied first in an expression
    // -- and  ++ can be place before (pre decrement or pre increment - the operation is applied before evaluatind the operand) 
    // or after (post decrement or post increment - the operation is applied after evaluating the operand) the operand

    public static void incrementAndDecrement(){
        int parkAttendance = 0;
        System.out.println(parkAttendance); // should print 0
        System.out.println(++parkAttendance); // first increment then evaluate so it prints 1
        System.out.println(parkAttendance); // still 1
        System.out.println(parkAttendance--); //evaluate then decrement, so it prints 1
        System.out.println(parkAttendance); // prints 0 since the value was decremented after evaluating it in last line
    }

    public static void commonQuestion(){
        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is: " + lion);
        System.out.println("tiger is: " + tiger);

        //first we do the unary operations, so the result would be
        // first post decrement lion so : ++lion * 5 / 3 - lion then gets assigned the value 2
        // the we pre increment, so lion gets assigned 3 and then evaluated: 3 * 5 / 3
        // Now we do the operation from left to right. Lion is 3 and Tiger 5

    }

}
