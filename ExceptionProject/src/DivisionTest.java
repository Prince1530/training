import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner x = new Scanner(System.in);
			Scanner y = new Scanner(System.in);
			
			System.out.println(x.nextInt()/y.nextInt());
			
		} catch(ArithmeticException ex) {
			System.out.println("exception");
		} catch(InputMismatchException e) {
			System.out.println("mismatch");
		}
	}

}
