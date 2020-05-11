
public class CommulativeSum {
	int number;

	public CommulativeSum() {
	}

	CommulativeSum add(int number) {
		this.number += number;
		return this;
	}

	int sum() {
		return number;
	}
}
