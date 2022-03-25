package Vacation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days=Integer.parseInt(sc.nextLine());
        String type=sc.nextLine();
        String day=sc.nextLine();

        double oneManPrice= findSum(type,day);
        double endSum=oneManPrice*days;
        double discounted=findDis(days,endSum,oneManPrice,type);
        System.out.printf("Total price: %.2f",discounted);



    }

    private static double findDis(int days, double endSum, double oneManPrice, String type) {
        double sum=endSum;

        switch (type){
            case "Students":
                if (days>=30){
                    sum=sum*0.85;
                }
                break;
            case "Business":
                if (days>=100) {
                    sum = sum - (oneManPrice * 10);
                }
                break;
            case "Regular":
                if (days>=10&&days<=20){
                    sum=sum*0.95;
                }
                break;
        }
        return sum;
    }

    private static double findSum(String type, String day) {
        double sum=0;
        switch (type){
            case "Students":
                sum=findDayS(day);

                break;
            case "Business":
                sum=findDayB(day);

                break;
            case "Regular":
                sum=findDayR(day);

                break;
        }
        return sum;
    }

    private static double findDayR(String day) {
        double sum=0;
        switch (day) {
            case "Friday":
                sum=15;
                break;

            case "Saturday":
                sum= 20;
                break;

            case "Sunday":
                sum= 22.50;
                break;

        }
        return sum;
    }

    private static double findDayB(String day) {
        double sum=0;
        switch (day) {
            case "Friday":
                sum= 10.90;
                break;

            case "Saturday":
                sum= 15.60;
                break;

            case "Sunday":
                sum= 16;
                break;

        }
        return sum;
    }

    private static double findDayS(String day) {
        double sum=0;

        switch (day){
            case "Friday":
                sum= 8.45 ;
                break;

            case "Saturday":
                sum= 9.80 ;
                break;

            case "Sunday":
                sum= 10.46 ;
                break;

        }
        return sum;
    }

}
