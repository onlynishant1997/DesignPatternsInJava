
public class SquareCommand implements Command {
	
	SpecialMath specialMath;

	public SquareCommand(SpecialMath specialMath) {
		super();
		this.specialMath = specialMath;
	}

	@Override
	public int execute() {
		return specialMath.getSquare();
	}
}
