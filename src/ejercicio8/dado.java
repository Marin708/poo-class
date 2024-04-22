package ejercicio8;

import java.util.Random;

public class dado {
    private enum Status {CONTINUE, WON, LOST}

    public static void main(String[] args) {

        int plus = 0;
        final int pas1 = 7;
        final int pas2 = 11;
        final int pas3 = 2;
        final int pas4 = 3;
        final int pas5 = 12;
        int mypoint = 0;
        Status gameStatus;

        plus = rollDice();
        switch (plus) {
            case pas1:
            case pas2:
                gameStatus = Status.WON;
                break;
            case pas3:
            case pas4:
            case pas5:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                mypoint = plus;
                System.out.println("your point is: " + mypoint);
                break;
        }
        while (gameStatus == Status.CONTINUE) {
            plus = rollDice();
            if (plus == mypoint) gameStatus = Status.WON;
            else if (plus == pas1) gameStatus = Status.LOST;
        }
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
        } else {
            System.out.println("Player loses");
        }
    }

    public static int rollDice() {
        Random numbdice = new Random();
        int firstdice = 1 + numbdice.nextInt(6);
        int seconddice = 1 + numbdice.nextInt(6);
        int sum = firstdice + seconddice;
        System.out.println("el numero del primer dado es: " + firstdice);
        System.out.println("el numero del segundo dado es: " + seconddice);
        System.out.println(firstdice + " + " + seconddice + " = " + sum);
        return sum;
    }
}