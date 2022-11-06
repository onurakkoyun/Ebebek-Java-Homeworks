import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5;
		
		double kilo = 0;
		double tutar = 0;
		
		System.out.print("Armut Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		tutar += kilo * armut;
		System.out.print("Elma Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		tutar += kilo * elma;
		System.out.print("Domates Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		tutar += kilo * domates;
		System.out.print("Muz Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		tutar += kilo * muz;
		System.out.print("Patlıcan Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		tutar += kilo * patlican;
		System.out.print("Toplam Tutar : " + tutar + " TL");

	}

}
