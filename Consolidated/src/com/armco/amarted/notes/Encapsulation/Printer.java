package com.armco.amarted.notes.Encapsulation;

public class Printer {
    private Duplex isDuplex;
    private Toner toner;
    private int totalPages = 0;

    public Printer(Duplex isDuplex, Toner toner) {
        this.isDuplex = isDuplex;
        this.toner = toner;
    }

    public void print(){
        System.out.println("Printing Page...");
        this.totalPages++;
        this.toner.setLevel(this.toner.getLevel()-1);
        System.out.println("Toner level is now: " + this.toner.getLevel());
    }

    public void print(int pages){
        System.out.println("Printing " + pages + " pages...");
        this.totalPages += pages;
        this.toner.setLevel(this.toner.getLevel() - pages);
        System.out.println("Toner level is now: " + this.toner.getLevel());
    }

    public void addToner(int amt) {
        this.toner.fillToner(amt);
    }
}
