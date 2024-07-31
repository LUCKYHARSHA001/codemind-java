import java.util.*;
public class Calc{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        float a=read.nextFloat();
        float b=read.nextFloat();
        float c=read.nextFloat();
        float pf=(12*a)/100;
        float g=a+b+c+pf;
        System.out.printf("%.2f
%.2f",pf,g);
    }
}