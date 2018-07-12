class TwoDArrayRefactored {
	public static void main(String [] args) {
		int [] [] twoDim = new int[4][5];
		int currentNumber = 0;
		
		for(int i = 0; i < twoDim.length; i++) {
			for(int j = 0; j < twoDim[i].length; j++ ) {
				twoDim[i][j] = currentNumber++;
			}
		}
		printTwoDimArr(twoDim);
	}
	
	private static void printTwoDimArr(int [] [] arr){
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}