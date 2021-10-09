package cap3;

public class TernaryOperator {

    public static void main(String[] args) {
        ternaryExample(5);
    }

    //The ternary operator is a decision operator and is the only operator that takes three operands
    // booleanExpression ? expression1: expression2;
    //The first operand must be a boolean expression, the second and third can be any operation that return a value
    //it's a condensed form of if and else expression

    public static void ternaryExample(int owl) {
        int food;
        if(owl < 2){
            food = 3;
        }
        else {
            food = 4;
        }
        System.out.println("Food is: " + food);
        //This if and else expression can be reduced to the following using the ternary operator
        int ternaryFood;
        ternaryFood = owl < 2 ? 3 : 4;
        //This gives the exact same result
        System.out.println("Ternary Food is: " + ternaryFood);

        //TIP, for readibility you can add parenthesis to the boolean expression
        //Both expressions can be of different type as long as theyre not used with an assign operator
        int stripes = owl;
        System.out.println((stripes < 5) ? 1 : "what?");
        //System.out.println does not care what type it is because in can convert both to object and call the toString() method on both
        //This line would not compile
        //int i1 = (stripes < 5) ? 1 : "what?";

        //WARN, ternary operators can also have a unperformed side effect

    }
}
