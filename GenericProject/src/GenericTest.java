
public class GenericTest {
public static void main(String[] args) {
	Egg e = new Egg(Poultry, White, 6, 5);
	Egg eggArray[] = new Egg[12];
	
}
}
class Egg{
	String type;
	String color;
	float cost;
	float weight;
	public Egg (String type,String color,float cost,float weight) {
		super();
		this.color=color;
		this.type= type;
		this.cost=cost;
		this.weight=weight;
		
	}
}