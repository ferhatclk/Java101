import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yarý çapýný giriniz : ");
		int r = input.nextInt();
		
		double pi = 3.14;
		
		  double area = pi * r * r; double circum = (2 * pi * r);
		  
		  System.out.print("Dairenin alaný : "); System.out.format("%.2f\n",area);
		  
		  System.out.print("Dairenin Çevresi : ");
		  System.out.format("%.2f\n\n",circum);
		 
		
		// Yarý çapý ve merkez açýsý bilinen dairenin alanýný bulma
		
		System.out.print("Lütfen dairenin yarý çapýný giriniz : ");
		int r1 = input.nextInt();
		System.out.print("Lütfen dairenin merkez açýsýný giriniz : ");
		int o = input.nextInt();
		
		double area1 = (pi * r1*r1 * o) / 360;
		System.out.print("Dairenin alaný : " + area1);
		
	}

}
