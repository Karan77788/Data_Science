import java.util.*;
public class DateValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date:" );
        int date = sc.nextInt();
        System.out.println("Enter the month:" );
        int month = sc.nextInt();
        System.out.println("Enter the Year:" );
        int Year = sc.nextInt();
        if(date==31){
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                System.out.println("valid Date");
            }
            else{
                System.out.println("Invalid Date");
            }
        }
        else if(month==2){
            if(Year%4==0||Year%400==0 &&Year%100!=0){
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Invalid Date");
            }
        }
        else if(date<=30 || date>0){
            System.out.println("valid date");
        }
        else{
            System.out.println("Invalid date");
        }
        sc.close();
    }
}
