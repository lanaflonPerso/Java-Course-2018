import java.util.HashSet;

class HashSetTest {
	
	public static void main(String [] args) {
		HashSet<String> names = new HashSet<>();
		names.add("Dimitar");
		names.add("Ivan");
		names.add("Stefan");
		names.add("Dimitar");
		
		for(String name:names) {
			System.out.println(name);
		}
			
	}
	
}