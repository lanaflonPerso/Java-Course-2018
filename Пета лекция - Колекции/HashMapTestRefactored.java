import java.util.HashMap;
import java.util.Set;

class HashMapTestRefactored {
	
	public static void main(String [] args) {
		HashMap<String,Boolean> attendance = new HashMap<>();
		attendance.put("Dimitar Tomov",true);
		attendance.put("Stefan Stefanov",false);
		attendance.put("Ivan Ivanov",true);
		
		Set<String> names = attendance.keySet();
		
		for(String name:names) {
			String attStr = attendance.get(name)?"prisustva":"ne prisustva";
			System.out.println(name + " " + attStr);
		}
		
	}
	
}
