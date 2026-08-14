/*
Write a Java program for a Temperature Converter with the following specifications:
        a.	The program should display a menu as follows:

        TEMPERATURE CONVERTER MAIN MENU
        [1] Conversion from Celsius to Fahrenheit
        [2] Conversion from Fahrenheit to Celsius
        [3] Exit
        Choose an option ?

        b.	Option 1 should ask for a temperature input and convert it to Fahrenheit.  Display the converted temperature.  Assume that the user will only input numerical value.

        c.	Option 2 should ask for a temperature input and convert it to Celsius.  Display the converted temperature.  Assume that the user will only input numerical value.

        d.	The program returns to the main menu after each display from the option, and when an invalid input of the option is encountered.

        e.	Validate the option input.  Only 1, 2 and 3 are acceptable, otherwise, display a message error and return to the main menu.

        f.	Exit option terminates the program.

 */

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menuControls();

    }
    //print option menu
    public static void printOption(){
        System.out.println("TEMPERATURE CONVERTER MAIN MENU");
        System.out.println("[1] Conversion from Celsius to Fahrenheit");
        System.out.println("[2] Conversion from Fahrenheit to Celsius");
        System.out.println("[3] Exit");
        System.out.print("Choose an option ->");
    }
    //do-while for printOption
    public static void menuControls(){
        int userInput;

        do{
            printOption();
            userInput = takeUserInput();

            if(!isInputValid(userInput)){
                printInputError();
                continue;
            }

            if(userInput == 1){
                celsiusToFahrenheit(getTemperatureInput("celsius"));
            }
            else if(userInput == 2){
                fahrenheitToCelsius(getTemperatureInput("fahrenheit"));
            }

        }while(userInput != 3);




    }
    //take user input
    public static int takeUserInput(){
        //if not int -> return -1
        //if not 1/2/3 -> return -1

        int input;
        if(!sc.hasNextInt()){
            sc.nextLine();
            return -1;
        }
        else{
            input = sc.nextInt();
            sc.nextLine();
            if((input >= 4) || (input <= 0)){
                //call printInputError
                return -1;
            }
        }
        return input;
    }
    //printInputError(1,2,3 for user input only, throw an error otherwise)
    public static void printInputError(){
        System.out.println("Chosen option is Invalid. Please try again...");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
    }
    public static boolean isInputValid(int x){
        if(x == -1){
            //printInputError();
            return false;
        }

        return true;
    }

    //Celsius to fahrenheit
    public static void celsiusToFahrenheit(double degrees){
        double ans = (degrees*(9/5d)) + 32;
        String print = degrees +" degrees Celsius is equal to: " +ans +" degrees Fahrenheit";
        System.out.println(print);
        System.out.println();
    }
    //fahrenheit to celsius
    public static void fahrenheitToCelsius(double degrees){
        double ans = (degrees - 32) * (5/9d);
        String print = degrees +" degrees Fahrenheit is equal to: " +ans +" degrees Fahrenheit";
        System.out.println(print);
        System.out.println();
    }

    public static double getTemperatureInput(String tempType){

        if(tempType == "celsius"){
            System.out.print("Enter degrees Celsius: ");
            return sc.nextDouble();
        }

        System.out.print("Enter degrees Fahrenheit: ");
        return sc.nextDouble();

    }

}