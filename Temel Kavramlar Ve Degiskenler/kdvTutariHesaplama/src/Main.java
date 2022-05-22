import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("KDV'siz fiyat : ");
		float fiyat = input.nextFloat();
		
		// eðer girilen fiyat 1000 den küçük veya eþit ise kdv 18 büyükse 8 olarak alýnýr.
		float kdv = (fiyat * (fiyat <= 1000 && fiyat > 0 ? 18:8)) / 100;
		
		float kdvFiyat = fiyat + kdv;
		
		System.out.println("KDV'li fiyat : " + kdvFiyat);
		System.out.println("KDV tutarý = " + kdv);
		
	}

}
