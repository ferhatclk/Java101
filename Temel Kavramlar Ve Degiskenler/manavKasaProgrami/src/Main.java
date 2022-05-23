import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double perA = 2.14, perE = 3.67, perD = 1.11, perM = 0.95, perP = 5.00;
		
		System.out.print("Armut Kaç Kilo ? : ");
		int armut = input.nextInt();
		
		System.out.print("Elma Kaç Kilo ? : ");
		int elma = input.nextInt();
		
		System.out.print("Domates Kaç Kilo ? : ");
		int domates = input.nextInt();
		
		System.out.print("Muz Kaç Kilo ? : ");
		int muz = input.nextInt();
		
		System.out.print("Patlýcan Kaç Kilo ? : ");
		int patlican = input.nextInt();
		
		double total = (perA * armut) + (perE * elma) + (perD * domates) + (perM * muz) + (perP * patlican);
		System.out.print("Toplam Tutar : " + total + " TL");
	}

}
