package Random_1;
import java.util.Random;

public class RandSayilar {

	public static void main(String[] args) {
		
		// 1-100 arası üretilen 30 adet rastgele sayıyı çift ve asal sayı olarak gruplama.
		
		
		Random rnd = new Random();
		int s, sayac;
		
		
		for(int i = 0; i < 30; i++) {
			s = 1 + rnd.nextInt(100);
			sayac = 0;
			for(int j = 2; j < s; j++) {
				if(s % j == 0) {
					sayac++;
				}
			}
			if(sayac == 0) {
				System.out.println("Asal Sayı: " + s);
			}
			if(s % 2 == 0) {
				System.out.println("Çift Sayılar: " + s);
			}
		}
		

	}

}
