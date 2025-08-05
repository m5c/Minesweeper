package ca.mcgill.cs.swevo.minesweeper;

/**
 * Required for packaging to jar, see: https://stackoverflow.com/a/57691362 Just delegates call to actual main, which extends javafx.
 *
 * @author Maximilian Schiedermeier
 */
public final class ShadeMinesweeper
{
  /**
   * Default constructor. Required by checkstyle.
   */
  private ShadeMinesweeper()
  {

  }
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