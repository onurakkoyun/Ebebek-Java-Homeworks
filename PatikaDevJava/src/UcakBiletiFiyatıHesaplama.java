import java.util.Scanner;

public class UcakBiletiFiyatıHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double mesafe,tutar = 0;
		int tip,yas;
		
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		mesafe=scanner.nextDouble();
		tutar = mesafe * 0.10;
		System.out.print("Yaşınızı giriniz : ");
		yas=scanner.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		tip=scanner.nextInt();
		

		if (yas > 0 && mesafe > 0 && (tip == 1 || tip == 2)) {
			
			
			if (yas < 12) {
				
				if (tip == 1) {
					tutar -= tutar * 0.5;
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
				else {
					tutar -= tutar * 0.5;
					tutar -= tutar * 0.2;
					tutar *= 2;
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
			}
			else if ( yas >= 12 && yas <= 24 ) {
				
				if (tip == 1) {
					tutar -= tutar * 0.1;
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
				else {
					tutar -= tutar * 0.1;
					tutar -= tutar * 0.2;
					tutar *= 2;
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
			}
			else if ( yas > 24 && yas <= 65 ) 
			{
				
				if (tip == 1) {
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
				else {
					tutar -= tutar * 0.2;
					tutar *= 2;
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
			}
			else if ( yas > 65 ) 
			{
				
				if (tip == 1) {
					tutar -= tutar * 0.3;
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
				else {
					tutar -= tutar * 0.3;
					tutar -= tutar * 0.2;
					tutar *= 2;
					System.out.println("Toplam Tutar = " +tutar + " TL");
				}
			}
			
			}
			else {
				System.out.println("Hatalı Veri Girdiniz !");
			}
		

	}

}
