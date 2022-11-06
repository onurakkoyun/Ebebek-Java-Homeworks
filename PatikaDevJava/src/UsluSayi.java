import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Taban değeri giriniz :");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz :");
        int us = scanner.nextInt();

        System.out.println("Sonuç : " + calculate(taban, us));
    }

    public static int calculate(int taban, int us) {

        if (taban == 1 || us == 0) {
            return 1;
        }

        return taban * calculate(taban, us - 1);
    }
}
