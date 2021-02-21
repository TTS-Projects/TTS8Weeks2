
public class Car {
	private String model;
	private int year;
	private String make;
	
	
	public void Car() {
		this.model = "";
		this.year = 0;
		this.make = "";
		
	}
	public void Car(String model, int year) {
		this.model = model;
		this.year = -year;
		
	}
	public void Car(String model, int year, String make) {
		this.model = model;
		this.year = -year;
		this.make = make;
		
	}
	
	// getters
		public String getMake() {
			return this.make;
		}
		public int getYear() {
			return this.year;
		}
		public String getModel() {
			return this.model;
		}
		
		//setters
		public boolean setMake(String make) {
			this.make = make;
			return true;
		}
		public boolean setYear(int year) {
			this.year = year;
			return true;
		}
		public boolean setModel(String model) {
			this.model = model;
			return true;
		}
		
		public boolean olderThan20Years() {
			if (2001 - this.year < -20) {
				return true;
			}
			return false;
		}
		public String returnString() {
			return "String";
		}
}
