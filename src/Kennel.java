import java.util.List;

public class Kennel {
	private List<Pet> petList;
	
	/** For every Pet in the kennel, print the name followed by
	 * the result of a call to its speak method, one line per Pet
	 */
	public void allSpeak(){
		for(Pet p : petList) {
			System.out.println(p.getName()+" "+p.speak());
		}
	}
	
	
}
