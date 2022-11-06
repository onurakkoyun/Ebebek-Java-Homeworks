import java.util.Iterator;
import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Basamak sayısı girin : ");
		int digit = scanner.nextInt();
		
		int i = digit, j;
        while (i > 0) {
            j = 0;
            while (j++ < digit - i) {
                System.out.print(" ");
            }
  
            j = 0;
            while (j++ < (i * 2) - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
	}

}
