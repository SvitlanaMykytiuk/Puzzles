import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String letterPuzzle = "евирПим ,тр";
        int firstStep = 5;
        int secondStep = firstStep * 2;
        int thirdStep = letterPuzzle.length();

        System.out.println(firstStep);
        System.out.println(secondStep);
        System.out.println(thirdStep);


        Stack<Character> firstPart = new Stack<>();
        for (int i = 0; i < firstStep; i++) {
            firstPart.add(letterPuzzle.charAt(i));
        }
        System.out.println(firstPart);

        Stack<Character> secondPart = new Stack<>();
        for (int i = firstStep; i < secondStep; i++) {
            secondPart.add(letterPuzzle.charAt(i));
        }
        System.out.println(secondPart);

        Stack<Character> thirdPart = new Stack<>();
        for (int i = secondStep; i < thirdStep; i++) {
            thirdPart.add(letterPuzzle.charAt(i));
        }
        System.out.println(thirdPart);

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