import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		matematik = input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		
		System.out.print("T�rk�e notunuzu giriniz: ");
		turkce = input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		tarih = input.nextInt();
		
		System.out.print("M�zik notunuzu giriniz: ");
		muzik = input.nextInt();
		
		int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
		int ortalama = toplam / 6;
				
		String durum = ortalama>60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
		
		System.out.println("Ortalaman�z: " + ortalama +" => "+ durum);		
		
	}	

}
