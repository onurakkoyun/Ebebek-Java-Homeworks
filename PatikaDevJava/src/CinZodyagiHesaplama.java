import java.util.Scanner;

public class CinZodyagiHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] animals = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", 
				"Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
		
		System.out.print("Doğum Yılınızı Giriniz : ");
		int yearOfBirth = scanner.nextInt();
		
		int remainder = yearOfBirth % 12;
		
		System.out.println("Çin Zodyağı Burcunuz : "+ animals[remainder]);

	}

}
