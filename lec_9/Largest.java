package lec_9;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = in.nextInt();
        System.out.println("Enter second number :");
        int b = in.nextInt();
        System.out.println("Enter third number :");
        int c = in.nextInt();


//        int max = a ;
//        if (b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }

//        int max = 0;
//        if (a>b){
//            max = a;
//        }
//        else{
//            max =b;
//        }
//
//        if (c > max){
//            max =c;
//        }
        int max = Math.max(c,Math.max(a,b));

        System.out.println("Largest number among the three is :" + max);
    }

}
