
public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.live();
		e.study();
		e.work();
	}
}

interface Living {
	void live();
}

interface Studying {
	void study();
}

interface Working {
	void work();
}

class Person implements Living {
	public void live() {
		System.out.println("living");
	}
}

class Student extends Person implements Studying {
	public void study() {
		System.out.println("Studying");
	}
}

class Employee extends Student implements Working {
	public void work() {
		System.out.println("working");
	}
}