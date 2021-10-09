package cap3;

public class BinaryOperators {
    
    //Binary operators are used to perform mathematical operations on variables, create logical expressions 
    // and perform basic variable assigments. Often combined with others which makes operator precedence very important
    // + addition operatior
    // - substraction operator
    // * multiplier operator
    // / division operator
    // % returns the remainder of the division of to operands

    // * / and % have higher precedence than + and - (unless overridden with parenthesis)

    public static void main(String[] args) {
        operatorPrecedence();
        changingPrecedence();
        modulusOperator();
    }

    public static void operatorPrecedence(){
        int price = 2 * 5 + 3 * 4 - 8; // Here the multiplier operators are evaluated first from left to right 
        // this turns the expression as 10 + 12 - 8. Result is 14 
        System.out.println("price : " + price);
    }

    public static void changingPrecedence(){
        int price = 2 * ((5 + 3) * 4 - 8);
        //Here we change the order of precedence. The parenthesis have precedence, from the inside out. So first (5+3) which results in 8
        //Then (8 * 4 - 8). Here first multiplier then addition so, 32 - 8. Which is 24
        // Lastly 2 * 24. So result is 48
        System.out.println("price is: " + price);
        //BEWARE, WHEN WORKING WITH PARENTHESIS, THEY ALWAYS HAVE TO BE BALANCED
        //Java unlike other programming languages does not allow [] to be used in place of parenthesis
    }

    public static void modulusOperator(){
        //Modulus operator returns the remainder of a division.
        System.out.println(9 / 3); // 3;
        System.out.println(9 % 3); // remainder is 0
        System.out.println(10 / 3); // 3
        System.out.println(10 % 3); // 1
        System.out.println(11 / 3); // 3 
        System.out.println(11 % 3); // 2
        System.out.println(12 / 3); // 4
        System.out.println(12 % 3); // 0
        System.out.println((1%2));
        //NOTE for integer, division result in the floor value of the nearest integer.
    }
}
