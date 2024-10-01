package com.pluralsight;
import java.util.*;

public class financial_calculators2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double depositAmount = promptUserForValues("Enter deposit amount: $");
        double interestAmount = promptUserForValues("Enter interest rate: ");
        double yearsLength = promptUserForValues("Enter number of years: ");

        displayEndingBalance(depositAmount, interestAmount, yearsLength);
    }

    public static double promptUserForValues(String prompt){

        System.out.print(prompt);

        return scanner.nextDouble();
    }

    public static double getTotalInterest(double deposit, double futureValue){
        return  futureValue - deposit;
    }

    public static double displayEndingBalance(double deposit, double interest, double years){
        interest = (interest/100);
        double paymentFormula = deposit * Math.pow(1 + (interest/365), years*365);
        System.out.println("If you deposit " + String.format("%.2f" , deposit) + " in a CD that earns " + String.format("%.2f" , interest*100) + "% interest and matures in " + years + " years, your CD's ending balance would be $" + String.format("%.2f", paymentFormula) + " and you would have earned $"+ String.format("%.2f",getTotalInterest(deposit,paymentFormula)) + " in interest.");

        return paymentFormula;
    }

}