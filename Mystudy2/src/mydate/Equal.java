package mydate;

class Date{
	int year;
	int month;
	int day;
	
	public Date(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Date) {
			Date date =(Date)obj;
			if(this.year == date.year && this.month == date.month && this.day == date.day)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return day*11 + month*101 + year*1001;
	}
	
	

}

public class Equal {

	public static void main(String[] args) {
		
		Date date1 = new Date(10,12,2020);
		Date date2 = new Date(10,12,2020);
	
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	
	
	}
}
