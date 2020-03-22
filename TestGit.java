package ro.ase.csie.cts.tema2;


public class TestGit {
	static Aliment mar = new Aliment("mar",TipAliment.FRUCT);
	static Aliment rosie = new Aliment("rosie", TipAliment.LEGUMA); 

	public static void main(String[] args) {
		System.out.println("Hello Git ! Denumirea proiectului de licenta este Asistent Inteligent de Nutritie.");


		Aliment.afisareAliment(mar);
		Aliment.afisareAliment(rosie); 
		
		Aliment.dataDeExpirareAliment(mar);
		Aliment.dataDeExpirareAliment(rosie);
	}

}
