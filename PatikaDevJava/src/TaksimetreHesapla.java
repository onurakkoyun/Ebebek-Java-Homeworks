import java.util.Scanner;

public class TaksimetreHesapla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float km,amount;
		
		System.out.print("Kaç km gidilecek : ");
		km = scanner.nextFloat();
		
		amount = (km * 2.2f) + 10;
		
		if (amount < 20) {
			amount = 20;
			System.out.println("Tutar : " + amount);
		}
		else {
			System.out.println("Tutar : " + amount);
		}
		

	}

}
