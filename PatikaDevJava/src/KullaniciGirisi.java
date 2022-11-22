import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName = "patika",password = "java123";
		
		System.out.print("Kullanıcı Adınız : ");
		String inputUserName = scanner.next();
		
		System.out.print("Şifreniz : ");
		String inputPassword = scanner.next();
		
			if (inputUserName.equals(userName) && inputPassword.equals(password)) {
				System.out.println("Giriş Yaptınız");
			}
			else {
				System.out.println("Şifreniz yanlış");
				System.out.print("Şifrenizi sıfırlamak istiyorusanız 'y' istemiyorsanız 'n' girin :");
				String isResetPass = scanner.next();
				
				if (isResetPass.equals("y")) {
					System.out.println("Yeni şifrenizi girin");
					String tempPass = scanner.next();
					
					if (!tempPass.equals(inputPassword) && !tempPass.equals(password)) 
					{
						password = tempPass;
						System.out.println("Şifre oluşturuldu");
						System.out.println(password);
					}
					else {
						System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
					}
				}
				else if(isResetPass.equals("n")){
					System.out.println("Giriş Başarısız!");
				}
			}
			
		
		
		
		

	}

}
