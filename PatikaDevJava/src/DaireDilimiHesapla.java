import java.util.Scanner;

public class DaireDilimiHesapla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float r, a,result;
		
		System.out.print("Yarıçap girin : ");
		r = scanner.nextFloat();
		
		System.out.print("Merkez açısının ölçüsünü girin : ");
		a = scanner.nextFloat();
		
		result = (float) ((3.14f * Math.pow(r, 2) * a) / 360);
		
		System.out.println("Daire diliminin alanı : " +result);
	}

}
