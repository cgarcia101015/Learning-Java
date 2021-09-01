package com.company;

import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalValue = 100.00d * (firstValue + secondValue);
        System.out.println(totalValue);

        double remainderValue = totalValue % 40.00d;
        System.out.println(remainderValue);

        boolean newVariable = (remainderValue == 0) ? true : false;
        System.out.println(newVariable);

        if (newVariable != true) {
            System.out.println("Got some remainder");
        }

    }
}
