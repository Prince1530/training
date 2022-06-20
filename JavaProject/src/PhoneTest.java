
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph = new Phone();
		ph.dail();
		byte police = 100;
		ph.dail(police);
		
		short shortNumber = 139;
	}

}

class Phone {
	void dail() {
		System.out.println("this is a function");
	}
	
	void dail(byte intercomm) {
		System.out.println("dail(byte) to ... " + intercomm);
	}
	
	void dail(short shortNumber) {
		System.out.println("");
	}
	
	void dail(short shortNumber, byte byteNumber) {
		System.out.println("");
	}
	
	void dail(short shortNumber, long longNumber) {
		System.out.println("");
	}
	
	void dail(long longNumber, short shortNumber) {
		System.out.println("");
	}
}