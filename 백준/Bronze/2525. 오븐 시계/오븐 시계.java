import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int hour= sc.nextInt();
        int min= sc.nextInt();
        int pm= sc.nextInt();
        sc.close();
        
        int a = hour*60+ min+ pm;
		hour = a/60;
		min = a%60;
        
		if (hour>=24) {
			hour= hour-24;
		}
		
		System.out.println(hour+ " "+ min);
    }
}