package ca.mcgill.cs.swevo.minesweeper;

/**
 * Required for packaging to jar, see: https://stackoverflow.com/a/57691362 Just delegates call to
 * actual main, which extends javafx.
 */
public class ShadeMinesweeper {
  public static void main(String[] args) {
    Minesweeper.main(args);
  }
}