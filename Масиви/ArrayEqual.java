class ArrayEqual {
	
	public static void main(String [] args) {
		
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = {1,2,3,4,5,6};
		int [] arr3 = {6,5,3,2,1};
		int [] arr4 = {5,4,6,7,8,1};
		System.out.println("Arr1 == arr2? " + arrEqual(arr1,arr2));
		System.out.println("Arr1 == arr3? " + arrEqual(arr1,arr3));
		System.out.println("Arr1 == arr4? " + arrEqual(arr1,arr4));
	}
	
	static boolean arrEqual(int [] firstArr, int [] secondArr) {
		if(firstArr.length != secondArr.length) return false;
		
		for(int i = 0; i < firstArr.length; i++) {
			if(firstArr[i]!=secondArr[i]) return false;
		}
		
		return true;
	}
	
}