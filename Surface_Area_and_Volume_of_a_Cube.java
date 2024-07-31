import java.util.*;
public class Surf{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int x=6*a*a;
        int y=a*a*a;
        System.out.printf("Surface area = %d and Volume = %d",x,y);
    }
}