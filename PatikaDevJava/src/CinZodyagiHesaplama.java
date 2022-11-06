import java.util.Scanner;

public class CinZodyagiHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] hayvanlar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", 
				"Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
		
		System.out.print("Doğum Yılınızı Giriniz : ");
		int dogumYılı = scanner.nextInt();
		
		int kalan = dogumYılı % 12;
		
		System.out.println("Çin Zodyağı Burcunuz : "+ hayvanlar[kalan]);

	}

}
