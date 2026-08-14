// This program demonstrates switch statements on two different types:
// a char and a String.

// letter holds a single character to check

// Checks if letter is one of A, B, C, D, or E (using fall-through cases,
// so multiple case labels share the same body). Prints a message
// depending on whether a match was found; falls to default otherwise.

// CJ holds a String value to check

// Checks CJ against specific String values ("Pogi" or "NOT Pogi") and
// prints a corresponding message. Note: there is no default case here,
// so if CJ matches neither value, nothing is printed.
public class Main {
    public static void main(String[] args) {
        char letter = 'Z';

        switch(letter){
            case 'A': case'B': case 'C': case'D': case 'E':
                System.out.println("Was A, B, C, D, or E");
                break;
            default:
                System.out.println("Not found: A, B, C, D, or E");
                break;
        }

        String CJ = "Pogi";
        switch(CJ){
            case "Pogi":
                System.out.println("True!");
                break;
            case "NOT Pogi":
                System.out.println("False!");
                break;
        }

    }
}