
public class ReCapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 32;
		int sayi2 = 23;
		int sayi3 = 12;
		int enBuyuk = sayi2;

		if (enBuyuk < sayi1) {
			enBuyuk = sayi1;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En buyuk sayi = " + enBuyuk);

	}

}
