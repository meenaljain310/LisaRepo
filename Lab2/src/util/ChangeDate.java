package util;

public class ChangeDate {

	private int day, month, year;
	
	public ChangeDate(int day,int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}
	
	public String getFormattedDate() {
		String formattedDate = day + "/"+ month + "/"+year;
		return formattedDate;
	}
	
//	@Override
	public String toString() {
		return getFormattedDate();
	}
	
	
	
}
	