package kurs;

import java.util.Date;

public class Kurs {
	private Date datum;
	private double prodajni;
	private double srednji;
	private double kupovni;
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		if(datum == null) {
			throw new RuntimeException("Datum ne moze biti null");
		}
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni == 0) {
			throw new RuntimeException("Prodajni ne moze biti null");
		}
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji == 0) {
			throw new RuntimeException("Srednji ne moze biti null");
		}
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni == 0) {
			throw new RuntimeException("Kupovni ne moze biti null");
		}
		this.kupovni = kupovni;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs [datum=" + datum + ", prodajni=" + prodajni + ", srednji=" + srednji + ", kupovni=" + kupovni
				+ "]";
	}
	
	
}
