class Average {
	public static void main(String[] args) {
		double numbers[] = {10.1, 11.2, 12.3, 13.4, 14.5};
		double average = 0;
		for(int i = 0; i < 5; i++) {
			average = average + numbers[i];
		}
		System.out.println("Srednoto aritmetichno e " + average/5);
	}
}