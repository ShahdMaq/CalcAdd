package najah.edu.code;

public class calc {
	public int add(int x, int y) {
		return x+y;
	}
	
	public int subtract(int x, int y) {
		return x-y;
	}
	
	public int divide(int x, int y) {
		if (y==0) {
			throw new ArithmeticException();
		}
		return x/y;
	}

}
