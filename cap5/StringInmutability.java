package cap5;

public class StringInmutability {
    //Inmutability = it can not be changed. The reference will always point to the initial object. Any modification creates a new object
    //Mutable: it allouws to be set
    
    //Importan String methods:
    //Remember, String is a sequence of characters and Java counts from 0 when indexed

    //- int lenght() . Returns the lenght of the string. It does not return an indexed result, only the lenght.
    //- char charAt(int index). Returns the char placed at index. Can throw index out of bounds exception
    //- int indexOf(char charSeq, int startPos). It looks for the charSeq in the string and returns the index of the first
    //match. It can be given a startPos of where to look. It can also receive a string as charSeq
    //- String substring(int beginIndex, int endIndex). Returns the substring marked by the indexes. endIndex is optional.
    //endIndex is not included. THIS IS THE TRICKIEST STRING METHOD ON THE EXAM
    //- String toLowerCase() and String toUpperCase(). Returns Lower or Upper case version of String
    //- boolean equals(Object str) and boolean equalsIgnoreCase(String str). equals returns true if both strings Objects contain the same 
    // characters in the same order. equalsIgnoreCase returns true if Strings are identical being case insensitive. equals takes an Object
    // because it's the same for all Objects. If you pass a different type of object it will return false
    //- startsWith() and endsWith() check if the string starts or finissh with something
    //- replace() changes a new char or charsequence for a new one
    //contains checks if the string contains a sequence
    //trim removes spaces in the front and in the back. strip does the same but supports unicode. trimleading and trimtrailing self explanatory
    //intern() return the value from the string pool if its there

}
