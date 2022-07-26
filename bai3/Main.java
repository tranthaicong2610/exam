package kiemtra.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu :");
        n = scanner.nextInt();
        int[] arr = new int[n];
        int res =0;
        System.out.println("nhap cac phan tu :");
        for(int i  =0 ;i<n;i++){
            arr[i] = scanner.nextInt();
            res = Math.max(arr[i],res);
        }
        System.out.println("so lon nhat trong n  phan tu la :"+res);
    }
}
