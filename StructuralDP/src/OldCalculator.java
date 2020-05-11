
public class OldCalculator {

	public int perform(int a, int b, String operation) {
		if (operation.equalsIgnoreCase("add")) {
			return a + b;
		} else if (operation.equalsIgnoreCase("sub")) {
			return a - b;
		} else {
			return -1;
		}
	}

}
