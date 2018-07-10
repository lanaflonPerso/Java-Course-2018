class Problems {
	
	public static void main(String [] args) {
		int [] first = {1,2,3,4,5,6,7,8,9};
		int [] second = {9,8,7,6,5,4,3,2,1};
		printSkipArr(first);
		System.out.println("Ednakav razmer dva cikala " + sumOfTwoArrSameSizeTwoCycle(first,second));
		System.out.println("Ednakav razmer edin cikal " + sumOfTwoArrSameSizeOneCycle(first,second));
		System.out.println("Razlichen razmer dva cikala " + sumOfTwoArrDiffSizeTwoCycle(first,second));
		System.out.println("Razlichen razmer edin cikal " + sumOfTwoArrDiffSizeOneCycle(first,second));
		int [] third = arrWithSumOfTwoArrEls(first,second);
		System.out.println("Suma ot elementite na dva masiva:");
		for(int i = 0; i < third.length; i++) {
			System.out.print(third[i] + " ");
		}
		System.out.println();
		System.out.println("Minimalna suma na vseki dva susedni elementa");
		System.out.println(minSumPair(second));
		
	}
	//Izprintirajte vseki vtori element na masiv
	private static void printSkipArr(int arr[]){
		for(int i = 0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
	}
	//Namerete obshtata suma na dva masiva
	//Ednakuv razmer
	//Dva cikula
	private static int sumOfTwoArrSameSizeTwoCycle(int [] first, int [] second){
		int sum = 0;
		for(int i = 0; i < first.length;i++){
			sum += first[i];
		}
		for(int i = 0; i < second.length;i++){
			sum += second[i];
		}
		return sum;
	}
	//Edin cikul
	private static int sumOfTwoArrSameSizeOneCycle(int [] first, int [] second){
		int sum = 0;
		//masivite imat ednakuv razmer za tova nqma znachenie koi razmer vzimame
		for(int i = 0; i < first.length;i++){
			sum += first[i] + second[i];
		}
		return sum;
	}
	//Razlichen razmer
	//Dva cikula - koda ne se razlichava ot tozi s ednakuv razmer
	private static int sumOfTwoArrDiffSizeTwoCycle(int [] first, int [] second) {
		int sum = 0;
		for(int i = 0; i < first.length;i++){
			sum += first[i];
		}
		for(int i = 0; i < second.length;i++){
			sum += second[i];
		}
		return sum;		
	}
	//Edin cikul
	private static int sumOfTwoArrDiffSizeOneCycle(int [] first, int [] second) {
		int sum = 0;
		int maxLength = Math.max(first.length,second.length);
		for(int i = 0; i < maxLength;i++){
			if(!(i>=first.length)){
				sum += first[i];
			}
			if(!(i>=second.length)){
				sum += second[i];
			}
		}
		return sum;		
	}
	// Treti masiv s elementi sumata na elementite ot dvata masiva
	private static int [] arrWithSumOfTwoArrEls(int [] first, int [] second){
		int [] res = new int [first.length];
		
		for(int i = 0; i < first.length; i++) {
			res[i] = first[i]+second[i];
		}
		return res;
	}
	// Minimalnata suma na vseki dva elementa ot masiv
	private static int minSumPair(int [] arr) {
		int minSum = arr[0] + arr[1];
		for(int i=0, j=1; j<arr.length; i++,j++){
			if(arr[i]+arr[j]<minSum) {
				minSum = arr[i] + arr[j];
			}
		}
		return minSum;
	}
}