public class Scopes {
    
    final static int MAX_LENGTH = 5; //class variable
    int lenght; // instance variable
    public void grow(int inches){ //method variable
        if(lenght < MAX_LENGTH){
            int newSixze = lenght + inches; // local variable
            lenght = newSize;
        }
    }

    //Local variable: In scope from declaration to end of block
    //Instance variables: In scope from declaration until object eligible for garbage collection
    //Class variables: In scrope from declaration until program ends

}
