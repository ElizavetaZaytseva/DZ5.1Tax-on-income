package app;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your income to calculation your tax (enter decimal numbers using a comma):");
        Scanner scanner = new Scanner(System.in);
        double amountofincome = scanner.nextDouble();
        double taxmin = 0.025;
        double taxmiddle = 0.043;
        double taxmax = 0.067;

        if (amountofincome <= 0) {
            System.out.println("To calculate taxes, your income must be greater than 0." +
                    System.lineSeparator()+
                    "Enter an amount greater than 0. Enter decimal numbers using a comma:");
        } else if (amountofincome >= 0.00 && amountofincome <= 10000.00) {
            System.out.format("Your tax is %.2f", amountofincome * taxmin);
        } else if (amountofincome > 10000.00 && amountofincome <= 25000.00) {
            System.out.format("Your tax is %.2f", amountofincome * taxmiddle);
        } else {
            System.out.format("Your tax is %.2f", amountofincome * taxmax);

        }

    }
}
