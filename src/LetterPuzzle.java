import java.util.Stack;

public class LetterPuzzle {
    public static void main(String[] args) {

        String letterPuzzle = "евирПим ,тр";
        int firstStep = 5;
        int secondStep = firstStep * 2;
        int thirdStep = letterPuzzle.length();

        Stack<Character> firstPart = new Stack<>();
        for (int i = 0; i < firstStep; i++) {
            firstPart.add(letterPuzzle.charAt(i));
        }

        Stack<Character> secondPart = new Stack<>();
        for (int i = firstStep; i < secondStep; i++) {
            secondPart.add(letterPuzzle.charAt(i));
        }

        Stack<Character> thirdPart = new Stack<>();
        for (int i = secondStep; i < thirdStep; i++) {
            thirdPart.add(letterPuzzle.charAt(i));
        }

        for (int i = 0; i < firstStep; i++) {
            System.out.print(firstPart.pop());
        }
        for (int i = firstStep; i < secondStep; i++) {
            System.out.print(secondPart.pop());
        }
        for (int i = secondStep; i < thirdStep; i++) {
            System.out.print(thirdPart.pop());
        }

    }
}