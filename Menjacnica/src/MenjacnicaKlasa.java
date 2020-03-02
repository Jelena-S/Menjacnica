import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import interfejs.InterfejsMenjacnica;
import kurs.Kurs;
import valuta.Valuta;

public class MenjacnicaKlasa implements InterfejsMenjacnica {
	
	List<Valuta> valute = new ArrayList<>();

	List<Valuta> valute = new ArrayList<>();
	
	@Override
	public void dodavanjeKursa(Kurs kurs, Date datum, Valuta valuta) {

		for(Valuta v : valute) {
			for(Kurs k : v.getKurseviNaDatum()) {
				if(v.getNaziv().equals(valuta.getNaziv()) && k.getDatum().equals(datum)) {
					v.getKurseviNaDatum().add(kurs);
				}
				
			}
			
		}


	}

	@Override
	public void brisanjeKursa(Date datum, Valuta valuta) {
		
		for(Valuta v : valute) {
			for(Kurs k : v.getKurseviNaDatum()) {
				if(v.getNaziv().equals(valuta.getNaziv()) && k.getDatum().equals(datum)) {
					v.getKurseviNaDatum().remove(k);
				}
				
			}
			
		}

	}

	
	
	@Override
	public Kurs vratiKursNaDan(Valuta valuta, Date datum) {
		for(Valuta v : valute) {
			for(Kurs k : v.getKurseviNaDatum()) {
				if(v.getNaziv().equals(valuta.getNaziv()) && k.getDatum().equals(datum)) {
					return k;
				}
				
			}
			
		}
		return null;
	}

}
