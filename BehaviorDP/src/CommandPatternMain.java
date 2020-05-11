
public class CommandPatternMain {
	public static void main(String[] args) {

		SpecialMath specialMath = new SpecialMath(4);
		Command command = new SquareCommand(specialMath);
		System.out.println(command.execute());

		SpecialMath specialMath1 = new SpecialMath(8);
		Command command1 = new CubeCommand(specialMath1);
		System.out.println(command1.execute());

		SpecialMath specialMath2 = new SpecialMath(36);
		Command command2 = new SquareRootCommand(specialMath2);
		System.out.println(command2.execute());

	}
}
