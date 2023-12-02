package SApp;

import java.util.Scanner;

public class NetCalculation {
    public static void netCalculator() {
        boolean firstLoop = false;
        double net;
        double wrongAnswers = 0;
        double correctAnswers = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("print the amount of correct answers");

            if (in.hasNextDouble()) {
                correctAnswers = in.nextDouble();

            } else {
                System.out.println("you should print a number");
                continue;
            }
            firstLoop = true;

        } while (!firstLoop);

        boolean secondLoop = false;
        do {
            System.out.println("print the amount of wrong answers");
            Scanner in = new Scanner(System.in);

            if (in.hasNextDouble()) {
                wrongAnswers = in.nextDouble();
            } else {
                System.out.println("you should print a number");
                continue;
            }
            secondLoop = true;
        } while (!secondLoop);

        double minus = wrongAnswers * (25 / 100.0);
        net = correctAnswers - minus;
        System.out.println("net = " + net);


    }
}
