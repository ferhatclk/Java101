import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz : ");
		double kilo = input.nextDouble();
		
		double kitleIndeksi = kilo / (boy * boy);
		
		System.out.print("V�cut Kitle �ndeksiniz : " + kitleIndeksi);
		
		
		
		
	}

}
