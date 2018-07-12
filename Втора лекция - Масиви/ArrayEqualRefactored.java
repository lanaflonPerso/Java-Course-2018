import java.util.*;
class ArrayEqualRefactored {
	
	public static void main(String [] args) {
		
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = Arrays.copyOf(arr1,arr1.length);
		int [] arr3 = {6,5,3,2,1};
		int [] arr4 = {5,4,6,7,8,1};
		System.out.println("Arr1 == arr2? " + Arrays.equals(arr1,arr2));
		System.out.println("Arr1 == arr3? " + Arrays.equals(arr1,arr3));
		System.out.println("Arr1 == arr4? " + Arrays.equals(arr1,arr4));
	}
	
}