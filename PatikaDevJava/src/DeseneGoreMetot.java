import java.util.Scanner;

public class DeseneGoreMetot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("N Sayısı : ");
        int n = scanner.nextInt();
        function(n);

	}
	
	public static void function(int n)
	{
		 System.out.print(n + " ");
		 
		 if(n > 0)
		 {
			 function(n-5);
			 System.out.print(n + " ");
		 }
	        
	 }

}
