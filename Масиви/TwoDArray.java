class TwoDArray {
	public static void main(String [] args) {
		int [] [] twoDim = new int[4][5];
		int currentNumber = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++ ) {
				twoDim[i][j] = currentNumber++;
			}
		}
		printTwoDimArr(twoDim);
	}
	
	private static void printTwoDimArr(int [] [] arr){
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 5; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}