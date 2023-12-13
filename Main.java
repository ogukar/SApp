package SApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean megaLoopStop = true;
        Scanner in = new Scanner(System.in);
        int method = 0;
        do {
            System.out.println("to use calculator press      ---> 1");
            System.out.println("to use net calculator press  ---> 2");
            System.out.println("to use net sign/logger press ---> 3");
            System.out.println("to exit press ---> 4");
            if (in.hasNextInt()) {
                method = in.nextInt();
                switch (method) {
                    case 1:
                        int calculator = 0;
                        boolean calculatorStop = true;
                        do {
                            System.out.println("Press 1 for add");
                            System.out.println("Press 2 for subtract");
                            System.out.println("Press 3 for multiply");
                            System.out.println("Press 4 for division");
                            System.out.println("Press 5 to exit");
                            if (in.hasNextInt()) {
                                calculator = in.nextInt();
                                switch (calculator) {
                                    case 1:
                                        Calculator.add();
                                        break;
                                    case 2:
                                        Calculator.subtract();
                                        break;
                                    case 3:
                                        Calculator.multiply();
                                        break;
                                    case 4:
                                        Calculator.division();
                                        break;
                                    case 5:
                                        calculatorStop = false;
                                        break;
                                    default:
                                        System.out.println("undefined");
                                }
                            } else {
                                System.out.println("choose 1 , 2 , 3 , 4 or 5");
                            }

                        } while (calculator > 0 && calculator <= 4 && calculatorStop);

                        break;
                    case 2:
                        NetCalculation.netCalculator();
                        break;
                    case 3:
                        LogSign.logAndSign();
                        break;
                    case 4:
                        megaLoopStop = false;
                        break;
                    default:
                        System.out.println("undefined");
                }
            } else {
                System.out.println("you must press a number to process");
                break;
            }


        } while (method > 0 && method <= 4 && megaLoopStop);

    }
}
