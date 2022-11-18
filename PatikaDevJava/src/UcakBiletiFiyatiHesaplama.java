import java.util.Scanner;

public class UcakBiletiFiyatıHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distance,amount = 0;
		int type,age;
		
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		distance=scanner.nextDouble();
		amount = distance * 0.10;
		System.out.print("Yaşınızı giriniz : ");
		age=scanner.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		type=scanner.nextInt();
		

		if (age > 0 && distance > 0 && (type == 1 || type == 2)) {
			
			
			if (age < 12) {
				
				if (type == 1) {
					amount -= amount * 0.5;
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
				else {
					amount -= amount * 0.5;
					amount -= amount * 0.2;
					amount *= 2;
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
			}
			else if ( age >= 12 && age <= 24 ) {
				
				if (type == 1) {
					amount -= amount * 0.1;
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
				else {
					amount -= amount * 0.1;
					amount -= amount * 0.2;
					amount *= 2;
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
			}
			else if ( age > 24 && age <= 65 ) 
			{
				
				if (type == 1) {
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
				else {
					amount -= amount * 0.2;
					amount *= 2;
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
			}
			else if ( age > 65 ) 
			{
				
				if (type == 1) {
					amount -= amount * 0.3;
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
				else {
					amount -= amount * 0.3;
					amount -= amount * 0.2;
					amount *= 2;
					System.out.println("Toplam Tutar = " +amount + " TL");
				}
			}
			
			}
			else {
				System.out.println("Hatalı Veri Girdiniz !");
			}
		

	}

}
