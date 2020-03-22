package ro.ase.csie.cts.tema2;

import java.time.LocalDate;

import ro.ase.csie.cts.tema2.Valabilitatte;
import ro.ase.csie.cts.tema2.InterfataValabilitate;

public class Aliment extends Valabilitatte{
	String denumire;
	TipAliment tipAliment;
	public static InterfataValabilitate ivalabilitate;

	public Aliment(String denumire,TipAliment tipAliment) {
		super();
		this.denumire = denumire;
		this.tipAliment = tipAliment;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public TipAliment getTipAliment() {
		return tipAliment;
	}

	public void setTipAliment(TipAliment tipAliment) {
		this.tipAliment = tipAliment;
	}

	public static void afisareAliment(Aliment aliment) {
		System.out.println("Alimentul " + aliment.denumire + " este " + aliment.tipAliment);
	}

	
	public static void dataDeExpirareAliment(Aliment aliment) {
		LocalDate dataDeExpirare =aliment.getDataExpirare(aliment);
		String dateAliment ="Data de expirare a alimentului " + aliment.denumire + " este : " + dataDeExpirare;
		System.out.println(dateAliment);
	}


}
