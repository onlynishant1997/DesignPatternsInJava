
// Adapter for making those two classes compatible.

public class CalculatorAdapter implements Calculator {

	OldCalculator oldCalculator;
	NewCalculator newCalculator;

	public CalculatorAdapter() {
	}

	public CalculatorAdapter(OldCalculator oldCalculator) {
		this.oldCalculator = oldCalculator;
	}

	public CalculatorAdapter(NewCalculator newCalculator) {
		this.newCalculator = newCalculator;
	}

	public CalculatorAdapter(OldCalculator oldCalculator, NewCalculator newCalculator) {
		this.newCalculator = newCalculator;
		this.oldCalculator = oldCalculator;
	}

	@Override
	public int add(int a, int b) {
		return oldCalculator.perform(a, b, "add");
	}

	@Override
	public int sub(int a, int b) {
		return oldCalculator.perform(a, b, "sub");
	}

	@Override
	public int mul(int a, int b) {
		return newCalculator.multiply(a, b);
	}

	@Override
	public int div(int a, int b) {
		return newCalculator.divide(a, b);
	}

}
