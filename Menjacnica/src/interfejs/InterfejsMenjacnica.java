package interfejs;

import java.util.Date;

import kurs.Kurs;
import valuta.Valuta;

public interface InterfejsMenjacnica {
	void dodavanjeKursa(Kurs kurs, Date datum);
	void brisanjeKursa(Date datum);
	Kurs vratiKursNaDan(Valuta valuta, Date datum);
}
