/*Write a program that prompts the user to enter the minutes (e.g., 1 billion),
and displays the number of years and days for the minutes.Return -1 when given a
negative number for minutes. For simplicity,assume year has 365 days. Here is an example:

Enter the number of minutes: 1,000,000,000
1,000,000,000 minutes is approximately 1902 years and 214 days. */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(minutes2YearsAndDays(1000000000));

    }
    public static String minutes2YearsAndDays(double minutes){
        if(minutes < 0){
            return "Invalid Value";
        }
        double years = (minutes)/(60 * 24 * 365);
        int iyears = (int)years;
        double days = (years - iyears) * 365;
        int idays = (int)days;
        int iminutes = (int)(minutes);


        return iminutes +" minutes is approximately " +iyears +" year/s and " +idays +" days.";
    }
}