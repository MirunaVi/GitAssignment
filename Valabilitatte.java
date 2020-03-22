package ro.ase.csie.cts.tema2;

import java.time.LocalDate;

public abstract class Valabilitatte implements InterfataValabilitate{
	public static final int ZILE_VALABILITATE_FRUCT = 3;
	public static final int ZILE_VALABILITATE_LEGUMA = 5;

	public static LocalDate dataCurenta = LocalDate.now();
	
	@Override
	public LocalDate getDataExpirare(Aliment aliment){
		
		if(aliment.getTipAliment() == TipAliment.FRUCT) {
			
			return dataCurenta.plusDays(ZILE_VALABILITATE_FRUCT);
		}
		else {
			return dataCurenta.plusDays(ZILE_VALABILITATE_LEGUMA);
		}

	}
}
