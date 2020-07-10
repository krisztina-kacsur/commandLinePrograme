package com.company;

import java.util.HashMap;

public class Program {
    private Read read = new Read();
    private Calculator calc = new Calculator();
    private LogicalOp logical = new LogicalOp();
    HashMap<String, String> user = new HashMap <String, String>();



    public void executeEverything () {
        if (loginHashMap()) {
            startProgram();
        }
    }


    public void startProgram () {


        boolean repeatProgram = runMenu();
        while(repeatProgram) {
            repeatProgram = runMenu();
        }

    }


    public void startMath () {

        boolean repeatMath;
        do {
            repeatMath = runMathSubMenu();
            logical.wait(2);
        } while (repeatMath);

    }



    public void startLogicalOp () {

        boolean repeatLogical;
        do {
            repeatLogical = runLogicalSubMenu();
            logical.wait(2);
        } while (repeatLogical);

    }



    public boolean login () {

        for (int attempts = 0; attempts < 3; attempts++) {

            System.out.println("Please, enter username: ");
            String username = "User";
            String user = read.getString();

            System.out.println("Please enter password: ");
            String password = "password";
            String pass = read.getString();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Welcome!\n");
                return true;

            } else {
                System.out.println("Invalid username or password, please try again.");
            }

        }
        return false;
    }


    private boolean loginHashMap () {
        users();
        for (int attempts = 0; attempts < 3; attempts++){

            System.out.print("Please, enter username: ");
            String username = read.getString();

            System.out.print("Please, enter password: ");
            String password = read.getString();

            if ((user.containsKey(username)) && (user.get(username).equals(password))) {
                System.out.println("\nHello " + username + "!" );
                return true;
            } else {
                System.out.println("Invalid username or password, please try again.");
            }
        }
        return false;



    }



    private void users () {

        user = new HashMap<String, String>();

        user.put("admin", "123456");
        user.put("Kri" , "Password");
        user.put("Guest", "guest");
        user.put("Jenny", "J213987");

    }



    private void printMenu () {
        System.out.println( "\nThis is the Main Menu\n" +
                "\n"+
                "1. Math op\n" +
                "2. Logical op\n" +
                "0. Exit\n");
    }

    private void printMathSubMenu () {

        System.out.println( "Mathematical Operations\n" +
                "\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. Division\n" +
                "4. Multiply\n" +
                "5. Greater than or equals to?\n"+
                "6. Lazy to count between two numbers?\n" +
                "7. Curious about the first 20 Fibonacci numbers?\n" +
                "8. Count to One Hundred\n" +
                "9. Count to minus One Hundred\n" +
                "0. Back to Main Menu\n" );

    }

    private void printLogicalSubMenu () {
        System.out.println( "Logical operators\n" +
                "\n" +
                "1. Which number is greater?\n" +
                "2. Check FastTrackIT\n" +
                "3. Even or not?\n" +
                "4. Which are the odd numbers between 1 and 100?\n" +
                "5. Can I vote?\n" +
                "6. How much snow do we have?\n" +
                "0. Back to Main Menu\n");
    }


    private boolean runMenu () {
        printMenu();
        int number = read.getInt();

        switch (number) {
            case 1:
                startMath();
                break;
            case 2:
                startLogicalOp();
                break;
            case 0:
                System.out.println( "Thank you for using my first Java console line program.\n"+
                        "              Have a nice day!\n");
                logical.pattern2();
                return false;
        }
        return true;

    }


    private boolean runMathSubMenu () {
        printMathSubMenu();
        int number = read.getInt();

        switch (number) {
            case 1:
                sum();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                division();
                break;
            case 4:
                multiplication();
                break;
            case 5:
                greaterThanEqualTo();
                break;
            case 6:
                countBetweenTwoNumbers();
                break;
            case 7:
                fibonacci();
                break;
            case 8:
                countToHundredFromGivenNr();
                break;
            case 9:
                countToMinusHundred();
                break;
            case 0:
                return false;
        }
        return true;
    }




    private boolean runLogicalSubMenu () {
        printLogicalSubMenu();
        int number = read.getInt();

        switch (number){
            case 1:
                biggerNumber();
                break;
            case 2:
                textCheck();
                break;
            case 3:
                evenNumber();
                break;
            case 4:
                oddNumber();
            case 5:
                voteAge();
                break;
            case 6:
                orCondition();
                break;
            case 0:
                return false;
        }
        return true;
    }






    private void sum () {
        System.out.println ("Please, enter two values you want to add up ");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The sum is: " + calc.sum(first, second) + "\n");
    }


    private void subtraction () {
        System.out.println ("Please, enter two values you want to extract ");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result of the subtraction is: " + calc.subtraction(first, second) + "\n");
    }


    private void division () {
        System.out.println ("Please, enter two values you want to divide ");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result of the division is:" + calc.divide(first, second) + "\n");
    }


    private void multiplication () {
        System.out.println ("Please, enter two values you want to multiply ");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result of the multiplication is: " + calc.multiply(first,second) + "\n");
    }

    private void greaterThanEqualTo () {
        int number = read.getInt();
        System.out.println(logical.greaterThanEqualTo(number));
    }



    private void countBetweenTwoNumbers() {
        int first = read.getInt();
        int second = read.getInt();
        logical.countingBetweenTwoNumbers(first, second);
    }

    private void fibonacci() {
        logical.fibonacci();
    }



    private void countToHundredFromGivenNr () {
        int number = read.getInt();
        logical.upToOneHundred(number);
    }


    private void countToMinusHundred () {
        int number = read.getInt();
        logical.negativeUpToOneHundred(number);
    }






// -------------------------------- LOGICAL MENU--------------------------------------

    private void biggerNumber () {
        System.out.println("Please enter two values: ");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The bigger number is: " + logical.checkBiggerNumber(first, second) + "\n");
    }


    private void textCheck () {
        System.out.println("Please enter FastTrackIT: ");
        String first = read.getString();
        System.out.println("Text: " + logical.checkText(first) + "\n");

    }

    private void evenNumber () {

        int number  = read.getInt();
        System.out.println(logical.isNumberEven(number));

    }

    private void oddNumber() {
        logical.oddNumbers();
    }



    private void voteAge () {
        int number = read.getInt();
        System.out.println(logical.isEligibleToVote(number));

    }



    private void orCondition () {
        int number = read.getInt();
        System.out.println(logical.orCondition(number)+"\n");
    }





}
