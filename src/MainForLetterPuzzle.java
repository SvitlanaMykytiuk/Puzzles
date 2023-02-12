import java.util.Stack;

public class MainForLetterPuzzle {
    public static void main(String[] args) {

        String puzzle = "евирпим, тр";
        int step = 5;
        int count = puzzle.length() / step;
        int rest = puzzle.length() % step;

        LetterPuzzle letterPuzzle = new LetterPuzzle(puzzle, step, count, rest);
        letterPuzzle.answer();

    }
}