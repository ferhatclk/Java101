import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double perA = 2.14, perE = 3.67, perD = 1.11, perM = 0.95, perP = 5.00;
		
		System.out.print("Armut Ka� Kilo ? : ");
		int armut = input.nextInt();
		
		System.out.print("Elma Ka� Kilo ? : ");
		int elma = input.nextInt();
		
		System.out.print("Domates Ka� Kilo ? : ");
		int domates = input.nextInt();
		
		System.out.print("Muz Ka� Kilo ? : ");
		int muz = input.nextInt();
		
		System.out.print("Patl�can Ka� Kilo ? : ");
		int patlican = input.nextInt();
		
		double total = (perA * armut) + (perE * elma) + (perD * domates) + (perM * muz) + (perP * patlican);
		System.out.print("Toplam Tutar : " + total + " TL");
	}

}
