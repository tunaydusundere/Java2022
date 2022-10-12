
public class LoopDemo {

	public static void main(String[] args) {
		        //For
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
				System.out.println("For Dongusu Bitti");

				int i = 2;
				//While
				while (i < 10) {
					System.out.println(i);
					i += 2;
				}
				// infinite loop
				System.out.println("While Dongusu Bitti");
				i += 2;

				//Do while
				int j = 1;
				do {
					System.out.println(j);
					j += 2;
				} while (j < 10);
				System.out.println("Do While Dongusu Bitti");
	}

}
