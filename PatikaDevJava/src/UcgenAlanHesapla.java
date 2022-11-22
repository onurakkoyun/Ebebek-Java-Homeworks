import java.util.Scanner;

public class UcgenAlanHesapla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;

		System.out.print("a kenarını girin : ");
		a = scanner.nextInt();
		
		System.out.print("b kenarını girin : ");
		b = scanner.nextInt();
		
		System.out.print("c kenarını girin : ");
		c = scanner.nextInt();
		
		int u = (a + b + c) / 2 ;
		
		double value = u * (u - a) * (u - b) * (u - c);
		
		double area = Math.sqrt(value);
		System.out.println("Üçgenin alanı = " + area);

	}

}
