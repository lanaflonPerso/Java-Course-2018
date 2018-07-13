import java.util.ArrayList;

class ArrayListTest {
	
	public static void main(String [] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(5);
		list.add(15);
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += (Integer)list.get(i);
		}
		System.out.println(sum);	
	}
	
}