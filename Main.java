package SApp;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("to use calculator press     ---> 1");
        System.out.println("to use net calculator press ---> 2");
        int method = in.nextInt();
        switch (method){
            case 1:
                System.out.println("Press 1 for add");
                System.out.println("Press 2 for subtract");
                int calculator = in.nextInt();
                switch (calculator){
                    case 1: Calculator.add(); break;
                    case 2: Calculator.subtraction(); break;
                    default:
                        System.out.println("undefined");
                } break;
            case 2: NetCalculation.netCalculator(); break;
            default:
                System.out.println("undefined");
        }
    }
}
