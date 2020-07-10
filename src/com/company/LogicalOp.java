package com.company;

public class LogicalOp {

    public void countingBetweenTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println("Count between 2 given numbers: ");
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.print(i + " ");
        }
    }


    public void upToOneHundred(int givenNumber) {
        System.out.println("Count from given number up to 100: ");
        for (int i = givenNumber; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }



    public void negativeUpToOneHundred(int givenNumber) {
        System.out.println("Count from given number up to -100: ");
        for (int i = givenNumber; i <= 100; i++) {
            System.out.print(-i + " ");
        }
    }


    public int checkBiggerNumber(int smallerNumber, int biggerNumber) {
        if (smallerNumber < biggerNumber) {
            return biggerNumber;
        } else {
            return smallerNumber;
        }
    }


    public String checkText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparision.";
        } else {
            return "Got to try some more.";
        }
    }


    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void oddNumbers() {
        System.out.println("Print odd numbers between 1 and 100: ");
        int endCounting = 100;

        for (int i = 1; i <= endCounting; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }


    public String orCondition(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }

    }

    public String greaterThanEqualTo(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and is not equal to 4 \n";
        } else if (number == 4) {
            return "The number is equal to 4\n";
        } else if (number < 3) ;
        {
            return "The number is lower than 3\n";
        }
    }

    public void fibonacci() {
        System.out.println("First 20 Fibonacci numbers: ");

        int firstNumber = 0;
        int secondNumber = 1;
        int endCount = 20;
        int count = 1;

        while (count <= endCount) {
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.print(sum + " ");
            count++;
        }
        System.out.println("\n");
    }



    public void wait(int secWait) {


        try {
            Thread.sleep(secWait*1000);
            //System.out.println("You waited " + secWait + " seconds");

        } catch (InterruptedException e) {
            System.out.println("Time out");


        }


    }

    public void pattern2 () {
        System.out.println( "              + \" \" \" \" \" +\n"+
                            "             [|   o   o   |]\n" +
                            "              |     ^     |\n" +
                            "              |   ' _ '   |\n" +
                            "              + _ _ _ _ _ +\n") ;
    }


}
