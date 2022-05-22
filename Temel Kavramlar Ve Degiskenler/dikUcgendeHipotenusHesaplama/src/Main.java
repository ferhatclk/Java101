import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen dik üçgenin kenar uzunluklarýný giriniz : ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		double c = Math.sqrt(a*a + b*b);
		
		System.out.println("Dik üçgenin hipotenüs uzunluðu : " + c + "\n\n");
		
		// 3 kenar uzunluðu verilen üçgenin alanýný hesaplama
		
		System.out.println("3 kenar uzunluðu verilen üçgenin alaný\n");
		System.out.println("Lütfen üçgenin kenar uzunluklarýný giriniz : ");
		
		int a1 = input.nextInt();
		int b1 = input.nextInt();
		int c1 = input.nextInt();
		
		double u = (a1 + b1 + c1) / 2;
		double alan = Math.sqrt(u * (u - a1) * (u - b1) * (u - c1));
		
		System.out.println("Üçgenin Alaný : " + alan);
		
	}

}
