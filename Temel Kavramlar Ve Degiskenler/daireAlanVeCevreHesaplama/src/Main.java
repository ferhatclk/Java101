import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yar� �ap�n� giriniz : ");
		int r = input.nextInt();
		
		double pi = 3.14;
		
		  double area = pi * r * r; double circum = (2 * pi * r);
		  
		  System.out.print("Dairenin alan� : "); System.out.format("%.2f\n",area);
		  
		  System.out.print("Dairenin �evresi : ");
		  System.out.format("%.2f\n\n",circum);
		 
		
		// Yar� �ap� ve merkez a��s� bilinen dairenin alan�n� bulma
		
		System.out.print("L�tfen dairenin yar� �ap�n� giriniz : ");
		int r1 = input.nextInt();
		System.out.print("L�tfen dairenin merkez a��s�n� giriniz : ");
		int o = input.nextInt();
		
		double area1 = (pi * r1*r1 * o) / 360;
		System.out.print("Dairenin alan� : " + area1);
		
	}

}
