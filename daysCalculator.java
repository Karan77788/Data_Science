import java.util.*;
public class daysCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Years = " +num/365);
        int num2 = num%365;
        System.out.println("Weeks = " +num2/7);
        int num3 = num2%7;
        System.out.println("Days = "+num3);
        sc.close();
    }
}
