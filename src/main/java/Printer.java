public class Printer {
    private int tonerLevel, printedPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        if (tonerLevel > 100) {
            System.out.println("Printer can't have more than 100% of toner level :(");
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            System.out.println("Printer can't have less than 0% of toner level :(");
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        if (printedPages < 0) {
            this.printedPages = 0;
            System.out.println("Printer can't printed negative number of pages :(");
        } else {
            this.printedPages = printedPages;
        }
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void changeToner() {
        this.tonerLevel = 100;
        System.out.println("You've changed a toner. Have more happy printings :)");
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public void printPage() {
        if(tonerLevel >= 2) {
            if (isDuplex) {
                this.printedPages = this.printedPages + 1;
                this.tonerLevel = this.tonerLevel - 1;
            } else {
                this.printedPages = this.printedPages + 2;
                this.tonerLevel = this.tonerLevel - 2;
            }
            System.out.println("You print a page. Number of paged printed is " + this.printedPages);
            if (this.tonerLevel <= 20) {
                System.out.println("Your toner is getting low. Reconsider changing it ASAP ;/");
            }
        } else {
            System.out.println("Sorry but your tonner is kind of dead. You must change it before next using :/");
        }
    }
    public boolean isDuplex() {
        return isDuplex;
    }

}
