import java.util.*;
public class digitSum {
    public static void main(String[] args) {
     System.out.println("The sum of digits :"+sumDigit(1234));
    }
    public static int sumDigit(int number){
        int sum=0;
        if(number<0){
            return -1;
        }
        while(number>9){
           sum += number%10;
            number/=10;
        }
        sum+=number;

        return sum;
    }
}
