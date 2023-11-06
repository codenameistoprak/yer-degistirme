import java.util.Scanner;

public class deneme4 {

	public static void main(String[] args) {
		// kullanıcıdan aldığımız iki sayının yerlerini değiştirme
		int birinci_sayi;
		int ikinci_sayi;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayı:");
		birinci_sayi = scanner.nextInt();
	
		System.out.print("İkinci sayi:");
		ikinci_sayi = scanner.nextInt();
		
		int gecici = birinci_sayi;
	    birinci_sayi = ikinci_sayi;
	    ikinci_sayi = gecici;
		System.out.println("Birinci sayı:"+ birinci_sayi);
		System.out.println("İkinci sayı:"+ ikinci_sayi);
		scanner.close();

	}

}
