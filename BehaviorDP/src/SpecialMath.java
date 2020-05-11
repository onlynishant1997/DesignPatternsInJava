
public class SpecialMath {
	int number;

	public SpecialMath(int number) {
		super();
		this.number = number;
	}

	int getSquare() {
		return number * number;
	}

	int getCube() {
		return number * number * number;
	}

	int getSquareRoot() {
		return (int) Math.sqrt(number);
	}

}
