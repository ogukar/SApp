package SApp;

import java.util.*;

public class Calculator {
    public static void add() {

        ArrayList<Double> numberList = new ArrayList<>();
        Boolean loopStop = false;
        Scanner in = new Scanner(System.in);
        System.out.println("write the numbers you want to add and press \"=\" for result ");

        do {
            if (in.hasNextDouble()) {
                double a = in.nextDouble();
                numberList.add(a);
            } else if (in.hasNext()) {
                String equalSign = in.next();
                if (equalSign.equals("=")) {
                    loopStop = true;
                } else System.out.println("you should write a number or pres \"=\"");
            }
        } while (!loopStop);

        int numberListLength = numberList.size();
        double sum = 0;
        for (int i = 0; i <= (numberListLength - 1); i++) {
            sum = sum + numberList.get(i);
        }
        System.out.println(sum);

    }

    public static void subtraction() {
        ArrayList<Double> numberList = new ArrayList<>();
        Boolean loopStop = false;
        Scanner in = new Scanner(System.in);
        System.out.println("write the number you want to subtract from");
        System.out.println("write the number you want to subtract and press \"=\" for result ");

        do {
            if (in.hasNextDouble()) {
                double a = in.nextDouble();
                numberList.add(a);
            } else if (in.hasNext()) {
                String equalSign = in.next();
                if (equalSign.equals("=")) {
                    loopStop = true;
                } else System.out.println("you should write a number or pres \"=\"");
            }
        } while (!loopStop);

        int numberListLength = numberList.size();
        double sum = 0;
        for (int i = (numberListLength - 1); i > 0; i--) {
            sum = sum + numberList.get(i);
        }
        double result = numberList.get(0) - sum;
        System.out.println(result);

    }

// çarpma bölme ekle
}
