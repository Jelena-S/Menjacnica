import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import interfejs.InterfejsMenjacnica;
import kurs.Kurs;
import valuta.Valuta;

public class MenjacnicaKlasa implements InterfejsMenjacnica {
	
	List<Valuta> valute = new ArrayList<>();

	@Override
	public void dodavanjeKursa(Kurs kurs, Date datum, Valuta valuta) {
		//ja sam drugacija metoda

	}

	@Override
	public void brisanjeKursa(Date datum, Valuta valuta) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs vratiKursNaDan(Valuta valuta, Date datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
