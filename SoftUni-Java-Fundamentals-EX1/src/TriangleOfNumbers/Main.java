package TriangleOfNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=numb ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
