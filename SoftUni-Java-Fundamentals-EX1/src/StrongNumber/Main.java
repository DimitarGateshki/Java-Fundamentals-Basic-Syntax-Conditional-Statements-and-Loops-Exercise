package StrongNumber;

import java.util.Scanner;

public class Main { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numb=Integer.parseInt(sc.nextLine());
    int copi=numb;
    int current=0;
    int sum=0;

    while (numb>0){
        current=numb%10;
        numb/=10;
        int cSum=1;
        for (int i = 1; i <=current ; i++) {
            cSum*=i;
        }
        sum+=cSum;
    }


    if (sum==copi){
        System.out.println("yes");
    }else {
        System.out.println("no");
    }

}

}
