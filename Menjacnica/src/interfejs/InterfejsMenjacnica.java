package interfejs;

import java.util.Date;

import kurs.Kurs;
import valuta.Valuta;

public interface InterfejsMenjacnica {
	void dodavanjeKursa(Kurs kurs, Date datum, Valuta valuta);
	void brisanjeKursa(Date datum, Valuta valuta);
	Kurs vratiKursNaDan(Valuta valuta, Date datum);
}
