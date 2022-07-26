package kiemtra.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so fibo thu n la :");
        int n = scanner.nextInt();
        long f0=1,f1=1;
        if(n==0||n==1) System.out.println("so fibo la :" + 1);
        else {
            n--;
            while(n-->0){
                long tem = f1 ;
                f1 += f0;
                f0=tem;

            }
            System.out.println("so fibo la :"+f1);

        }
    }
}
