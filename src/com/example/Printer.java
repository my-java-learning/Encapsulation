package com.example;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = 100;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillUpToner(int ammountToFill){
        if(ammountToFill == 0){
            System.out.println("You need to add at least some!");
        }
        else if(this.tonerLevel == 100){
            System.out.println("Toner is already at full capacity");
        }
        else if((this.tonerLevel + ammountToFill) > 100 ){
            System.out.println("You can't fill above 100% of toner capacity");
            System.out.println("Toner filled to 100%, you've got " + (this.tonerLevel + ammountToFill - 100) + "% left");
            this.tonerLevel += ammountToFill;
        }
        else {
            this.tonerLevel += ammountToFill;
            System.out.println("You filled toner to " + this.tonerLevel + "%");
        }
    }

    public void printPage(int pagesToPrint){
        if(this.duplex) {
            this.pagesPrinted += Math.ceil((double)(pagesToPrint)/2);
            System.out.println("Printing in duplex mode");
        }
        else {
            this.pagesPrinted += pagesToPrint;
        }
        System.out.println("You have already printed out " + this.pagesPrinted + " pages");
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
