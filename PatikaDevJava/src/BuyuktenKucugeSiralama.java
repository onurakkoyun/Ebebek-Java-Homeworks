import java.util.Scanner;

public class BuyuktenKucugeSiralama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("1. sayı : ");
		a = scanner.nextInt();
		
		System.out.print("2. sayı : ");
		b = scanner.nextInt();
		
		System.out.print("3. sayı : ");
		c = scanner.nextInt();
		
		if ((a < b) && (a < c)) {
			if (b < c) {
				System.out.println("a < b < c");
			}
			else {
				System.out.println("a < c < b");
			}
			
		}
		
		else if ((b < a) && (b < c)) {
			if (a < c) {
				System.out.println("b < a < c");
			}
			else {
				System.out.println("b < c < a");
			}
			
		}
		
		if ((c < b) && (c < a)) {
			if (a < b) {
				System.out.println("c < a < b");
			}
			else {
				System.out.println("c < b < a");
			}
			
		}
		
		scanner.close();

	}

}
