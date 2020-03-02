package valuta;

import java.util.List;

import kurs.Kurs;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private List<Kurs> kurseviNaDatum;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public List<Kurs> getKurseviNaDatum() {
		return kurseviNaDatum;
	}
	public void setKurseviNaDatum(List<Kurs> kurseviNaDatum) {
		this.kurseviNaDatum = kurseviNaDatum;
	}
	
	
}
