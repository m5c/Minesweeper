package ca.mcgill.cs.swevo.minesweeper;

/**
 * Required for packaging to self-contained jar. The shade plugin needs a
 * "standard" `main` method to run the standalone application, but JavaFX
 * applications have their own launch mechanism, inherited from `Application`.
 * This class serves as proxy to bridge the gap between the shade plugin and
 * JavaFX's startup by delegating the `main` call to the existing JavaFX
 * launcher. See: https://stackoverflow.com/a/57691362
 *
 * @author Maximilian Schiedermeier
 */
public final class ShadeMinesweeper 
{
	/**
	 * Default constructor. Required by checkstyle.
	 */
	private ShadeMinesweeper() 
	{}

	/**
	 * Main method to delegate program startup to Minesweeper class.
	 *
	 * @param pArgs as program arguments. Can be left empty.
	 */
	public static void main(String[] pArgs) 
	{
		Minesweeper.main(pArgs);
	}
}