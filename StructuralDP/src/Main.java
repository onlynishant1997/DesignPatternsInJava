
public class Main {
	public static void main(String[] args) {
		Calculator calculator = new CalculatorAdapter(new OldCalculator(),new NewCalculator());
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.mul(5, 5));
	}
}
