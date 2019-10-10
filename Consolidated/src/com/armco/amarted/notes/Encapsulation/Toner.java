package com.armco.amarted.notes.Encapsulation;

public class Toner {
    private int level = 100;
    private int capacity;

    public Toner(int level, int maxLevel) {
        this.level = level;
        this.capacity = maxLevel;
    }

    public void fillToner(int amount){
        if (amount + this.level > capacity){
            this.level = capacity;
        } else {
            this.level += amount;
        }
        System.out.println("Added " + amount + " toner");
        System.out.println("Current level now " + this.level);
    }

    public int getLevel() {
        return level;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
