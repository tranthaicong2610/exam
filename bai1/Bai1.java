package kiemtra.bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;
        a= scanner.nextFloat();
        b  = scanner.nextFloat();
        c = scanner.nextFloat();
        if (check(a, b, c)) {
            System.out.println("tam giac la tam giac vuong");
            System.out.println("chu vi tam gia la : "+(a+b+c));
            float tich = a*b*c;
            float num_max = Math.max(a,b);
            num_max = Math.max(num_max,c);
            System.out.println("dien tich cua tam giac la :" + ((tich/num_max)/2));
        }
        else{
            System.out.println("ko la tam giac vuong");
        }

    }
    static boolean check(float a,float b,float c){
        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a ){
            return true;
        }
        return false;
    }
}
