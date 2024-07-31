import java.util.*;
public class sum{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}