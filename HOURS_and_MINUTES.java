import java.util.*;
public class hrs{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=a/60;
        int c=a%60;
        System.out.printf("%d Hour(s) %d Minute(s)",b,c);
    }
}