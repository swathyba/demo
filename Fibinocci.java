import java.util.Scanner;

public class Fibinocci {
			
	public static void main(String[] args) {
    
		int num, t1 = 0, t2 = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of num:");
        num = s.nextInt();
        System.out.print("First " + num + " terms: ");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(t1 + "  ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
    }
	
	
}}
