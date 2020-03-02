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
		if(naziv == null) {
			throw new RuntimeException("Naziv ne moze bii null");
		}
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(naziv == null) {
			throw new RuntimeException("Skraceni naziv ne moze bii null");
		}
		this.skraceniNaziv = skraceniNaziv;
	}
	public List<Kurs> getKurseviNaDatum() {
		return kurseviNaDatum;
	}
	public void setKurseviNaDatum(List<Kurs> kurseviNaDatum) {
		if(kurseviNaDatum == null) {
			throw new RuntimeException("Lista je prazna");
		}
		this.kurseviNaDatum = kurseviNaDatum;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kurseviNaDatum == null) ? 0 : kurseviNaDatum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kurseviNaDatum == null) {
			if (other.kurseviNaDatum != null)
				return false;
		} else if (!kurseviNaDatum.equals(other.kurseviNaDatum))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kurseviNaDatum=" + kurseviNaDatum
				+ "]";
	}
	
	
}
