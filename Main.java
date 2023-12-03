package SApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("to use calculator press      ---> 1");
        System.out.println("to use net calculator press  ---> 2");
        System.out.println("to use net sign/logger press ---> 3");
        int method = in.nextInt();
        switch (method){
            case 1:
                System.out.println("Press 1 for add");
                System.out.println("Press 2 for subtract");
                System.out.println("Press 3 for multiply");
                System.out.println("Press 4 for division");
                int calculator = in.nextInt();
                switch (calculator){
                    case 1: Calculator.add(); break;
                    case 2: Calculator.subtract(); break;
                    case 3: Calculator.multiply(); break;
                    case 4: Calculator.division(); break;
                    default:
                        System.out.println("undefined");
                } break;
            case 2: NetCalculation.netCalculator(); break;
            case 3: LogSign.logAndSign(); break;
            default:
                System.out.println("undefined");
        }
    }
}
