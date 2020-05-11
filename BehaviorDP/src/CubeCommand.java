
public class CubeCommand implements Command {
	SpecialMath specialMath;

	public CubeCommand(SpecialMath specialMath) {
		super();
		this.specialMath = specialMath;
	}

	@Override
	public int execute() {
		return specialMath.getCube();
	}
}
