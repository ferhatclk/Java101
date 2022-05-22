import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen mesafeyi KM cinsinden giriniz : ");
		int km = input.nextInt();
		
		double perKm = 2.20;
		
		double total = (km * perKm) + 10;
		
		double price = total > 20 ? total : 20;
		
		System.out.print("Ödemeniz gereken tutar : " + price);

	}

}
