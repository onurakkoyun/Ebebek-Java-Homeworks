import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		System.out.print("Bir sayı giriniz: ");
		int number = scanner.nextInt();
		
		for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
            	total += i;
            }
        }
		
		if (number == total) {
			System.out.println(number + " Mükemmel sayıdır");
		}
		else {
			System.out.println(number + " Mükemmel sayı değildir.");
		}

	}

}
