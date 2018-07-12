class Exc4 {
	public static void main(String args[]) {
		int [] arr = new int[4];
		try {
			arr[4] = 5;
		} catch(IndexOutOfBoundsException exc) {
			System.out.println("Ime na greshkata:" + exc);
			System.out.println("Callstack:" + exc.getStackTrace());
			System.out.println("----------Izpolzvane na printStackTrace----------");
			exc.printStackTrace();
		}	
	}
}

