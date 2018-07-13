import java.util.*;

class CombineCollections {
	
	public static void main(String [] args) {
		
		ArrayList<HashSet<String>> classRoomList = new ArrayList<>();
		
		HashSet<String> classRoomA = new HashSet<>();
		classRoomA.add("Dimitar Tomov");
		classRoomA.add("Ivan Popov");
		classRoomA.add("Stefan Stefanov");
		HashSet<String> classRoomB = new HashSet<>();
		classRoomB.add("Dimitarinka Tomova");
		classRoomB.add("Ivanka Popova");
		classRoomB.add("Stefani Stefanova");
		
		classRoomList.add(classRoomA);
		classRoomList.add(classRoomB);
		
		for(int i = 0; i < classRoomList.size(); i++) {
			System.out.println("Classroom " + (i+1));
			printSet(classRoomList.get(i));
		}
		
	}
	
	private static void printSet(HashSet<String> set){
		for(String str:set) {
			System.out.println(str);
		}
	}
}
