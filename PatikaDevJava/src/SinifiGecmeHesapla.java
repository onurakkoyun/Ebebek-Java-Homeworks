import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinifiGecmeHesapla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> dersler = new ArrayList<>();
		double avg = 0;
		int count = 0;
		
		
		System.out.print("Matematik notunuz : ");
		dersler.add(scanner.nextInt());
		
		System.out.print("Fizik notunuz : ");
		dersler.add(scanner.nextInt());
		
		System.out.print("Kimya notunuz : ");
		dersler.add(scanner.nextInt());
		
		System.out.print("Türkçe notunuz : ");
		dersler.add(scanner.nextInt());
		
		System.out.print("Müzik notunuz : ");
		dersler.add(scanner.nextInt());
		
		for (int i = 0; i < dersler.size(); i++) {
			if (dersler.get(i) >= 0 && dersler.get(i) <= 100) {
				avg +=dersler.get(i);
				count++;
			}
		}
		avg = avg / count;
		if (avg >= 55) {
			System.out.println("Geçtiniz "+ avg);
		}
		else {
			System.out.println("Kaldınız " + avg);
		}
		
		
		

	}

}
