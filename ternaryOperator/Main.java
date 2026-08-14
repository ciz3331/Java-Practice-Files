// This program demonstrates the ternary (conditional) operator as a
// shorthand alternative to an if/else statement, using both forms on
// similar string comparisons.

// name holds a string value to check

// Ternary operator: if name equals "CJ", quality is set to "Pogi",
// otherwise "Not Pogi". Equivalent to an if/else but written as one
// expression.

// Prints the result of the ternary check above

// Equivalent if/else statement, but comparing against "JC" instead
// (a different value from the ternary check above), so this and the
// ternary result are independent of each other.

// Note: this code compares Strings using ==, which checks reference
// equality rather than content equality. It happens to work here due to
// how Java caches identical string literals, but .equals() is the
// generally correct way to compare String content.
public class Main {
    public static void main(String[] args)
    {
        String name = "CJ";
        String quality = name == "CJ" ? "Pogi" : "Not Pogi";
        System.out.println(quality);

        if(name == "JC")
            System.out.println("Pogi");
        else
            System.out.println("Not pogi");
    }
}