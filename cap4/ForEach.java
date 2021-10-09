package cap4;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        example1();
        System.out.println();
        example2();
        System.out.println();
        checkingRunNumber();
    }
    //The for each loop is a specialized structure designed to iterate over arrays and various Collection Framework classes.
    //Its composed of an initializarion section and an object to be iterated over. The object must be one of the following
    // - a built-in Java Array
    // - An object whose type implements java.lang.Iterable
    //The left side must be the initialization for an instance of a variable whose type is compatible with the type of array or collection
    //on the right side

    public static void name(String [] names) {
        for(String name : names){
            System.out.println("Name: " + name);
        }
    }

    //Examples
    public static void example1() {
        final String [] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names){
            System.out.print(name + ", ");
        }

    }

    public static void example2() {
        List<String> values = new ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(var value : values){//Like the for, foreach also accepts var
            System.out.print(value + ", ");
        }
    }

    //When you see a for each, make sure the right side is an iterable
    //Also make sure the initalization is of a type compatible with the array or iterable items type

    //Switching between for and for each loops
    //While for each is convenient for working with lists, it does not give access to the iterator, so in certain cases,
    //using a simple for loop will be better. Like when needing to check in what position the current run is, or if there is
    //need to make operations on different objects of the collection
    public static void checkingRunNumber() {
        List<String> values = new ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(int i = 0; i<values.size();i++){
            String name = values.get(i);
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }
}
