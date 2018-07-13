import java.util.HashMap;
import java.util.Set;

class HashMapTest {
	
	public static void main(String [] args) {
		HashMap<String,Boolean> attendance = new HashMap<>();
		attendance.put("Dimitar Tomov",true);
		attendance.put("Stefan Stefanov",false);
		attendance.put("Ivan Ivanov",true);
		
		Set<String> names = attendance.keySet();
		
		for(String name:names) {
			System.out.print(name + " ");
			if(attendance.get(name)) {
				System.out.println("prisustva");
			} else {
				System.out.println("ne prisustva");
			}
			
		}
		
	}
	
}
