package Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String cPass="";
        for (int i = name.length()-1; i >=0; i--) {
            cPass+=name.charAt(i);
        }
        for (int i = 0; i < 4; i++) {
            String pas= sc.nextLine();
            if (pas.equals(cPass)){
                System.out.printf("User %s logged in.%n",name);
                break;
            }else {
                if (i==3) {
                    System.out.printf("User %s blocked!",name);
                }else {
                    System.out.println("Incorrect password. Try again.");
                }
            }
        }

    }
}
