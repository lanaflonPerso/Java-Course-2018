class ZeroPointException extends Exception {
	private String pointName;
	public ZeroPointException(String pointName) {
		this.pointName = pointName;
	}
	@Override
	public String toString(){
		return "WrongOrderOfPointsException " + pointName;
	}
}