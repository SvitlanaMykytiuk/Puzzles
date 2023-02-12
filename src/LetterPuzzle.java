import java.util.Stack;

public class LetterPuzzle {
    String puzzle;
    private int step = 5;
    private int count;
    private int rest;

    public LetterPuzzle(String puzzle, int step, int count, int rest) {
        this.puzzle = puzzle;
        this.step = step;
        this.count = count;
        this.rest = rest;
    }

    private int firstPoint = 0;

    public void answer() {
        for (int i = 0; i < count; i++) {
            print(puzzle, firstPoint, step);
            firstPoint = firstPoint + step;
        }

        if (rest > 0) {
            print(puzzle, count * step, rest);
        }
    }

    private void print(String puzzle, int firstPoint, int step) {
        Stack<Character> stack = new Stack<>();

        for (int i = firstPoint; i < firstPoint + step; i++) {
            stack.add(puzzle.charAt(i));
        }

        for (int j = firstPoint; j < firstPoint + step; j++) {
            System.out.print(stack.pop());
        }
    }
}


