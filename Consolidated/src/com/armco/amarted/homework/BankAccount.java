package com.armco.amarted.homework;

public class BankAccount {
    int accountNum;
    double balance;
    String name;
    String email;
    String phone;

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds(double amount){
        balance += amount;
        System.out.println("New Balance is: $");
    }
    public void withdrawFunds(double amount){
        if (amount>balance){
            System.out.println("Insufficient Funds Available");
        }
        balance -= amount;
        System.out.println("New Balance is: $");
    }


}
