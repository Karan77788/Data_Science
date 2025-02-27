import java.util.*;
 class model
{
    int print(int num)
    {
        System.out.println(num+num);
        return num*num;
    }
}
public class function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        model obj=new model();
        int num=sc.nextInt();
        //System.out.println(obj.print(num));
        int c=obj.print(num);
    }
}
