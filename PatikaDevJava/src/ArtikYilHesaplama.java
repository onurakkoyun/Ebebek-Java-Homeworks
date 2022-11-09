import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isLeapYear = false;
		
		System.out.print("Yıl Giriniz : ");
		int year = scanner.nextInt();
		
		
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                	isLeapYear = true;
                else
                	isLeapYear = false;
            }
            else
            	isLeapYear = true;
        }
        else
        	isLeapYear = false;
 
        if(isLeapYear)
            System.out.println(year + " bir artık yıldır !");
        else
            System.out.println(year + " bir artık yıl değildir !");

	}

}
