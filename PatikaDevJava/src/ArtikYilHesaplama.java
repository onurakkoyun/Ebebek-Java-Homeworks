import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean artik = false;
		
		System.out.print("Yıl Giriniz : ");
		int yil = scanner.nextInt();
		
		
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;
 
        if(artik)
            System.out.println(yil + " bir artık yıldır !");
        else
            System.out.println(yil + " bir artık yıl değildir !");

	}

}
