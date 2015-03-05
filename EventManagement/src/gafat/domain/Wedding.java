package gafat.domain;

public class Wedding {
	String weddingDate;
	public Wedding() {
		
	}
	String wCountry;
	String wState;
	String wCity;
	String wNumberOfAttendies;	
	public Wedding(String weddingDate, String wCountry, String wState,
			String wCity, String wNumberOfAttendies) {
		super();
		this.weddingDate = weddingDate;
		this.wCountry = wCountry;
		this.wState = wState;
		this.wCity = wCity;
		this.wNumberOfAttendies = wNumberOfAttendies;
	}
	
	public String getWeddingDate() {
		return weddingDate;
	}
	public void setWeddingDate(String weddingDate) {
		this.weddingDate = weddingDate;
	}
	public String getwCountry() {
		return wCountry;
	}
	public void setwCountry(String wCountry) {
		this.wCountry = wCountry;
	}
	public String getwState() {
		return wState;
	}
	public void setwState(String wState) {
		this.wState = wState;
	}
	public String getwCity() {
		return wCity;
	}
	public void setwCity(String wCity) {
		this.wCity = wCity;
	}
	public String getwNumberOfAttendies() {
		return wNumberOfAttendies;
	}
	public void setwNumberOfAttendies(String wNumberOfAttendies) {
		this.wNumberOfAttendies = wNumberOfAttendies;
	}


}
