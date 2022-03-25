package Division;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=Integer.parseInt(sc.nextLine());
        if (age%10==0){
            System.out.println("The number is divisible by 10");
        }else if (age%7==0){
            System.out.println("The number is divisible by 7");

        }else if (age%6==0){
            System.out.println("The number is divisible by 6");
        }else if (age%3==0){
            System.out.println("The number is divisible by 3");
        }else if (age%2==0){
            System.out.println("The number is divisible by 2");
        }else {
            System.out.println("Not divisible");
        }
    }
}
