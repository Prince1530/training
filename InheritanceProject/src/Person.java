
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("M", 25, "nischal dutt", 102, "GNDU", "CS", 102, 50000, "SBI", "AM");
		System.out.println(emp);
	}

}

class Person1 {
	private String gender, name;
	private int age;

	public Person1(String gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person1 [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
}

class Student extends Person1 {
	private String collegeName, stream;
	private int rollno;

	public Student(String gender, int age, String name, int rollno, String collegeName, String stream) {
		super(gender, age, name);
		this.rollno = rollno;
		this.collegeName = collegeName;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", stream=" + stream + ", toString()="
				+ super.toString() + "]";
	}
}

class Employee extends Student {
	private int empno, salary;
	private String companyName, designation;
	
	public Employee(String gender, int age, String name, int rollno, String collegeName, String stream, int empno,
			int salary, String companyName, String designation) {
		super(gender, age, name, rollno, collegeName, stream);
		this.empno = empno;
		this.salary = salary;
		this.companyName = companyName;
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", salary=" + salary + ", companyName=" + companyName + ", designation="
				+ designation + ", toString()=" + super.toString() + "]";
	}
}