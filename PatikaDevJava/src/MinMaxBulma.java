import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MinMaxBulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		
		System.out.print("Kaç tane sayı gireceksiniz: ");
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.print((i+1) + ". Sayıyı giriniz: ");
			numbers.add(scanner.nextInt());
		}
	
		int max = numbers.get(0);
		int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (max < numbers.get(i))
            	max = numbers.get(i);
        }
        
        for (int i = 1; i < numbers.size(); i++) {
            if (min > numbers.get(i))
            	min = numbers.get(i);
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

	}

}
