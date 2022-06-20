import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChemicalElement element1 = new ChemicalElement (79,196.97f,"Gold","Au");
		ChemicalElement element2 = new ChemicalElement (47,107.87f,"Silver","Ag");
		ChemicalElement element3 = new ChemicalElement (13,26.982f,"Aluminium","Al");
		ChemicalElement element4 = new ChemicalElement (3,6.938f,"Lithium","Li");
		ChemicalElement element5 = new ChemicalElement (26,55.845f,"Iron","Fe");
		
		TreeSet<ChemicalElement> periodicTable = new TreeSet<ChemicalElement>();
		System.out.println("Container is ready....");
		
		System.out.println("Trying to add elements....");
		
		System.out.println("Adding 1 element....");
		periodicTable.add(element1);
		
		System.out.println("Adding 2 element....");
		periodicTable.add(element2);
		
		System.out.println("Adding 3 element....");
		periodicTable.add(element3);
		
		System.out.println("Adding 4 element....");
		periodicTable.add(element4);
		
		System.out.println("Adding 5 element....");
		periodicTable.add(element5);
		
		System.out.println("ALL elements are added....");
		
		Iterator<ChemicalElement> iterator = periodicTable.iterator();
		
		while(iterator.hasNext()) {
			ChemicalElement theElement = iterator.next();
			System.out.println("Element is : "+theElement);
			System.out.println("-----------------------");
		}
		
	}

}
class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	float atomicWeight;
	String atomicNAME;
	String atomicFormula;
	
	public ChemicalElement(int atomicNumber,float atomicWeight, String atomicNAME,String atomicFormula) {
		super();
		this.atomicNumber=atomicNumber;
		this.atomicWeight =atomicWeight;
		this.atomicNAME =atomicNAME;
		this.atomicFormula=atomicFormula;
		
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicWeight=" + atomicWeight + ", atomicNAME="
				+ atomicNAME + ", atomicFormula=" + atomicFormula + "]";
	}

	@Override
	public int compareTo(ChemicalElement o) {
		// TODO Auto-generated method stub
		System.out.println("comparing"+atomicNumber+"with"+o.atomicNumber);
		return Integer.compare(o.atomicNumber, atomicNumber);
	}
}