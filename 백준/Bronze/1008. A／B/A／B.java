import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        double num1=sc.nextInt();
        double num2=sc.nextInt();
        
        if(num1>0 && num2<10){
            System.out.print(num1/num2);
        }
    }
}