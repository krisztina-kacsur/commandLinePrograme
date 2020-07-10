package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int getInt () {

        boolean repeat = true;
        int inputInt = 0;

        do {
            try {
                System.out.println("Enter a number: ");
                Scanner scan = new Scanner(System.in);
                inputInt = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value entered, please try again. ");
            }

        } while (repeat);

        return inputInt;

    }

    public String getString () {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }



}
