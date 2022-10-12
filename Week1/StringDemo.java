
public class StringDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı:" + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));

		
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));
        //STRİNG DEMO 2
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("e"));
		
		
		String msj = "Bugun hava cok guzel.";
		System.out.println(msj);

		String yeniMesaj = msj.replace(' ', '-');

		System.out.println(msj.replace(' ', '-')); 
		System.out.println(yeniMesaj);

		System.out.println(msj.substring(2, 10)); 
		for (String kelime : msj.split(" ")) { 
			System.out.println(kelime);
		}

	}

}
