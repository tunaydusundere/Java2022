package pack1;

public class Methods {

	public static void main(String[] args) {
    int[] sayilar = new int [] {1,2,5,7,9,0};
    int aranacak=5;
    boolean varMi=false;
    
    for (int sayi : sayilar) {
		if (sayi == aranacak) {
			varMi=true;
			break;
		}
	}
if (varMi) {
	String mesaj ="İfade dizide mevcut.";
	mesajVer(mesaj);
}
else {
	String mesaj ="İfade dizide mevcut değildir.";
	mesajVer(mesaj);
	
	
}
    
    
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
		
		
	}

}
