import java.util.Scanner;

public class KdvHesapla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tutar girin : ");
		int amount = scanner.nextInt();
		
		if (amount > 0 && amount <= 1000) {
			System.out.println("KDV'siz Fiyat = " + amount);
			System.out.println("KDV'li Fiyat = " + (amount + (amount * 0.18)));
			System.out.println("KDV tutarı = " + (float)(amount*0.18));
		}
		else {
			System.out.println("KDV'siz Fiyat = " + amount);
			System.out.println("KDV'li Fiyat = " + (amount + (amount * 0.08)));
			System.out.println("KDV tutarı = " + (float)(amount*0.08));
		}

	}

}
