
public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integerpair ip =new Integerpair(10,20);
   ip.print();
   ip.swap();
   ip.print();
	}

}
class Integerpair{
	int x;
	int y;
	Integerpair(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	public void print() {
		System.out.println("x"+x);
		System.out.println("y"+y);
	}
	public void swap() {
		System.out.println("Swapping..");
		int temp=x;
		x=y;
		y=temp;
		System.out.println("swapped..");
	}
}