// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.
public class Printer {
    private int tonerLevelPercent;
    private int pagesPrinted;
    private int bondPaperLeft;
    private boolean isDuplex;


    Printer(int tonerLevelPercent, int pagesPrinted, int bondPaperLeft,boolean isDuplex){
        this.tonerLevelPercent = tonerLevelPercent;
        this.pagesPrinted = pagesPrinted;
        this.bondPaperLeft = bondPaperLeft;
        this.isDuplex = isDuplex;

        fillUpToner(this.tonerLevelPercent);
    }

    public void fillUpToner(int fill){
        if(this.tonerLevelPercent + fill <= 100){
            System.out.println("Toner is filled up to" +(this.tonerLevelPercent + fill <= 100));
            this.tonerLevelPercent += fill;
        }
        else if(this.tonerLevelPercent + fill > 100){
            System.out.println("We can't fill up toner above 100%! Toner is now set to 100%");
            this.tonerLevelPercent = 100;
        }
    }

    public void print(double pagesToPrint){
        pagesToPrint = duplexProcess(pagesToPrint);

        if((tonerLevelPercent < pagesToPrint) || (bondPaperLeft < pagesToPrint)){
            System.out.println("Not enough toner level or Bond papers left! The printing process will now be cancelled.");
            getStatus(pagesToPrint);
        }
        else{
            this.pagesPrinted += pagesToPrint;
            this.tonerLevelPercent -= pagesToPrint;
            this.bondPaperLeft -= pagesToPrint;
            System.out.println();
            System.out.println("Successfully printed " +pagesToPrint +" pages! " +'\n');
            getStatus(pagesToPrint);

        }
    }

    public double duplexProcess(double pagesToPrint){
        if(this.isDuplex){
            System.out.println("This printer is a duplex, I can print pages Front-and-Back!!! - insert Ross \n" );
            return pagesToPrint /= 2;
        }
        else{
            System.out.println("This is not a duplex printer. I cannot not print pages Front-and-Back!!! - insert Ross \n");
        }
        return pagesToPrint;
    }

    public void getStatus(double pagesToPrint){
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Total pages Printed: " +this.pagesPrinted +'\n'
                            + "Toner remaining percent: " +this.tonerLevelPercent +'\n'
                            + "Total Bond papers remaining: " +this.bondPaperLeft);
    }
}
