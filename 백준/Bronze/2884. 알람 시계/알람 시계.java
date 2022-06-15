import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
         if(num2 >= 45){
            num2 = num2 - 45;
        }
        else{
            num2 = num2 + 15;
            if(num1 == 0){
                num1 = 23; 
            }
            else{
                num1--; 
            }
        }
        System.out.println(num1 + " " + num2);              
    }
}