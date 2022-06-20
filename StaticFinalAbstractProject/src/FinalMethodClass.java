
public class FinalMethodClass {
	public static void main(String[] args) {
		Chess c = new GraphicalChess();
		// c.moveMyBishop(); // error 
	}
}

class Chess {
	final int TOTAL_SQUARE = 64;
	
	final void moveBishop() {
		System.out.println("from chess");
	}
}

class GraphicalChess extends Chess {
	void moveMyBishop() {
		super.moveBishop();
		System.out.println("from graphical chess");
	}
}