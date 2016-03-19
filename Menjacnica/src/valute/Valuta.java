package valute;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;

	private GregorianCalendar datum;

	public String getNaziv() {
		return naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
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
		if (!(obj instanceof Valuta))
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
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
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datum=" + datum + "]";
	}

}
