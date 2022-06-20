
public class CompositionProject {
	public static void main(String args[]) {
		Person2 p = new Person2("nischal", "M", "25", 
				"street 101", "Belapur", "navi mumbai", "maharashtra", "india", 
				"street 102", "Vashi", "navi mumbai", "maharashtra", "india");
		System.out.println(p);
	}
}

class Adress {
	String street, area, city, state, country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Adress(String street, String area, String city, String state, String country) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
}

class Person2 {
	private String name, gender, age;
	Adress home; // has a
	Adress correspondance; // has a
	
	public Person2(String name, String gender, String age, 
			String street, String area, String city, String state, String country, 
			String street1, String area1, String city1, String state1, String country1) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.home = new Adress(street, area, city, state, country);
		this.correspondance = new Adress(street1, area1, city1, state1, country1);
	}

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", gender=" + gender + ", age=" + age + ", home=" + home + ", correspondance="
				+ correspondance + ", toString()=" + super.toString() + "]";
	}
}
