package cap4;

public class IfStatement {

    public static void main(String[] args) {
        badIfExpression(0);
    }

    //The if statement allows us to run a block of code only if a boolean expression evaluates to true at runtime
    public static void ifExample(int hourOfDay) {
        if(hourOfDay < 11 ){
            System.out.println("Good Morning!");
        }
    }

    public static void ifElseExample(int hourOfDay) {
        if(hourOfDay < 11){
            System.out.println("Good Morning!");
        }
        else {
            System.out.println("Good Afternoon!");
        }
    }

    public static void elseIfExample(int hourOfDay) {
        if(hourOfDay < 11){
            System.out.println("Good Morning!");
        }
        else if(hourOfDay < 17){
            System.out.println("Good Afternoon!");
        }
        else {
            System.out.println("Good Evening!");
        }
    }

    //The if statement HAS to evaluate to a boolean expression, otherwise it will result in a compilation error
    public static void badIfExpression(int hourOfDay) {
        /*if(hourOfDay = 5){//This is an assigment, it does not return a boolean expression. The assignment returns the value assigned
            //DOES NOT COMPILE
        }*/
        System.out.println(hourOfDay = 5);
        boolean b1;
        System.out.println(b1 = true);
        System.out.println(b1 = false);
    }
}
