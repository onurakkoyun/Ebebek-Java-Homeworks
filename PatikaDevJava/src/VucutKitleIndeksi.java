import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = scanner.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kilo = scanner.nextDouble();
		double vki = kilo / (boy * boy);
		System.out.println("Vücut Kitle İndeksiniz : " + vki);

	}

}
