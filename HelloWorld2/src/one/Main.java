package one;

public class Main {
	
	private static Oggetto1 a;
	private static Oggetto1 b;

	public static void main(String[] args) {
		System.out.println("Scrivo una riga sulla console");
		elabora();
	}
	
	public static void elabora() {
		
		a = new Oggetto1();
		
		a.setNumero_pezzi(10);
				
	}
}
