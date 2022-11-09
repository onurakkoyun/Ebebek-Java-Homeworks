import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		double height = scanner.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		double weight = scanner.nextDouble();
		double vki = weight / (height * height);
		System.out.println("Vücut Kitle İndeksiniz : " + vki);

	}

}
