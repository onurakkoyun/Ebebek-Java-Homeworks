import java.util.Scanner;

public class NotOrtalamasiHesapla {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int matematik,fizik,kimya,turkce,tarih,muzik;
		
		double avg;
		
		System.out.print("Matematik Notunuz : ");
		matematik = scanner.nextInt();
		
		System.out.print("Fizik Notunuz : ");
		fizik = scanner.nextInt();
		
		System.out.print("Kimya Notunuz : ");
		kimya = scanner.nextInt();
		
		System.out.print("Türkçe Notunuz : ");
		turkce = scanner.nextInt();

		System.out.print("Tarih Notunuz : ");
		tarih = scanner.nextInt();
		
		System.out.print("Müzik Notunuz : ");
		muzik = scanner.nextInt();
		
		avg = (matematik+fizik+kimya+turkce+tarih+muzik) / 6.0;
		
		if (avg > 60) {
			System.out.println("Sınıfı Geçti");
		}
		else {
			System.out.println("Sınıfta Kaldı");
		}
		
	}

}
