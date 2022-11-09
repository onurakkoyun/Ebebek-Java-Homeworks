import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double pear = 2.14;
		double apple = 3.67;
		double tomatoes = 1.11;
		double banana = 0.95;
		double aubergine = 5;
		
		double kilo = 0;
		double amount = 0;
		
		System.out.print("Armut Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		amount += kilo * pear;
		System.out.print("Elma Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		amount += kilo * apple;
		System.out.print("Domates Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		amount += kilo * tomatoes;
		System.out.print("Muz Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		amount += kilo * banana;
		System.out.print("Patlıcan Kaç Kilo ? :");
		kilo = scanner.nextDouble();
		amount += kilo * aubergine;
		System.out.print("Toplam Tutar : " + amount + " TL");

	}

}
