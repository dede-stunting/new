package com.example;

import static java.lang.System.out;

public class UseAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        Account secondAccount = new Account();

    //    out.println(yourAccount.name);
        firstAccount.name = "Charles David";
        firstAccount.address = "1, Nigerian Development Foundation";
        firstAccount.balance = 724.70;
        secondAccount.name = "Chiedu C. Daniel";
        secondAccount.address = "Newton Lane";
        secondAccount.balance = 100.00;
        out.print(firstAccount.name);
        out.print(" (");
        out.print(firstAccount.address);
        out.print(") has $");
        out.print(firstAccount.balance);
        out.println();
        out.print(secondAccount.name);
        out.print(" (");
        out.print(secondAccount.address);
        out.print(") has $");
        out.print(secondAccount.balance);
    }
}
