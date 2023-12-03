package SApp;

import java.text.DecimalFormat;
import java.util.*;

public class Calculator {
    public static void add() {
        DecimalFormat df = new DecimalFormat("0.00");
        ArrayList<Double> numberList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("write the numbers you want to add and press \"=\" for result ");
        Boolean loopStop = false;

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
        System.out.println("result = " + df.format(sum));

    }

    public static void subtract() {
        DecimalFormat df = new DecimalFormat("0.00");
        ArrayList<Double> numberList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("write the number you want to subtract from");
        System.out.println("write the number you want to subtract and press \"=\" for result ");
        Boolean loopStop = false;

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
        System.out.println("result = " + df.format(result));

    }

    public static void multiply() {
        double result = 1;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();
        System.out.println("print the numbers you want to multiply");
        boolean loopStop = false;
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
        for (int i = 0; i <= (numberList.size() - 1); i++) {
            result = numberList.get(i) * result;
        }
        System.out.println("result = " + df.format(result));
    }

    public static void division() {
        String finalResult = "";
        double result = 1;;
        Scanner in = new Scanner(System.in);
        ArrayList<Double> numberList = new ArrayList<>();
        boolean loopStop = false;
        System.out.println("print the numbers you want to divide");
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
        int i = 0;
        while (i <= (numberList.size() - 1)) {
            if (!numberList.contains(0.0)) {
                if (i == 0) {
                    result = numberList.get(i);
                    i++;
                } else if (i < (numberList.size()-1)){
                    result = result / numberList.get(i);
                    i++;
                }else {
                    result = result / numberList.get(i);
                    double numberResult = Math.round(result*100) / 100.0;
                    finalResult = Double.toString(numberResult);
                    System.out.println("result = " + finalResult);
                    break;
                }
            }else {
                if (numberList.indexOf(0.0) == 0){
                    result = numberList.get(i);
                    i++;
                }else {
                    finalResult = "division is invalid";
                    System.out.println("result = " + finalResult);
                    break;
                }
            }
        }
    }
}
