// This program formats a duration into a readable "Xh Ym Zs" string.
// Demonstrates method overloading: one version takes minutes and seconds
// directly, the other takes total seconds only and converts it internally
// by calling the first version. Invalid values (negative numbers, or
// seconds over 59) return "Invalid Value".

// Example: getDurationString(61, 58) -> 61 minutes, 58 seconds
// -> 1h 1m 58s

// Example: getDurationString(69) -> 69 total seconds
// -> converted to 1 minute 9 seconds -> 0h 1m 9s

// Takes minutes and seconds directly.
// Returns "Invalid Value" if minutes is negative, or seconds is negative
// or greater than 59. Otherwise formats and returns "Xh Ym Zs".

// Overloaded version: takes total seconds only.
// Returns "Invalid Value" if seconds is negative.
// Otherwise converts seconds into minutes+seconds and calls the other
// getDurationString method to build the formatted string.
public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(61,58));
        System.out.println(getDurationString(69));
    }
    public static String getDurationString(int minutes, int seconds) {
        if( (minutes < 0) || ( (seconds < 0) || (seconds > 59)) ) {
            return "Invalid Value";
        }

        return (minutes/60) +"h"  +' ' +(minutes % 60) +"m " + seconds +"s";
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        return getDurationString((seconds/60),(seconds%60));
    }}