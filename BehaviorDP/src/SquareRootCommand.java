
public class SquareRootCommand implements Command {
	SpecialMath specialMath;

	public SquareRootCommand(SpecialMath specialMath) {
		super();
		this.specialMath = specialMath;
	}

	@Override
	public int execute() {
		return specialMath.getSquareRoot();
	}
}
