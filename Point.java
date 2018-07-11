	public boolean isInSameQuadrantWith(Point p1) {
		if(isDifferentSigns(x,p1.x)) return false;
		if(isDifferentSigns(y,p1.y)) return false;
		return true;
	}
	
	public boolean isDifferentSigns(int a, int b) {
		return a > 0 && b < 0 || a < 0 && b > 0;
	}
