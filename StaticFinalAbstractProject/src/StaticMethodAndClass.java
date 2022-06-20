
public class StaticMethodAndClass {
	public static void main(String[] args) {
		Kite k1 = new Kite("red");
		Kite k2 = new Kite("green");
		k1.fight(k2);
	}
}

class Kite {
	private static int count;
	private String color;
	
	public Kite(String color) {
		super();
		this.color = color;
		count++;
	}
	
	void printKiteCount() {
		System.out.println("count ===> " + count);
	}

	@Override
	public String toString() {
		return "Kite [color=" + color + "]";
	}
	
	void fight(Kite x) {
		for(int i=0;i<5;i++) {
			double random = Math.random()%10;
			System.out.println("random ==> " + random);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
				System.out.println("exception occured");
			}
			
			if(random < 0.50) {
				count--;
				System.out.println("count ==> " + count);
				break;
			}
		}
	}
}