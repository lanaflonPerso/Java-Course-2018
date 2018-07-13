import java.util.ArrayList;

class ArrayListGenericTest {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(15);
		//list.add("hello");
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);	
	}
	
}