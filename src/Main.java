import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> firstPart = new Stack<>();
        firstPart.add("е");
        firstPart.add("в");
        firstPart.add("и");
        firstPart.add("р");
        firstPart.add("П");

        Stack<String> secondPart = new Stack<>();
        secondPart.add("и");
        secondPart.add("м");
        secondPart.add(" ");
        secondPart.add(",");
        secondPart.add("т");

        Stack<String> thirdPart = new Stack<>();
        thirdPart.add("р");

        System.out.print(firstPart.pop() + firstPart.pop() + firstPart.pop() + firstPart.pop() + firstPart.pop());
        System.out.print(secondPart.pop() + secondPart.pop() + secondPart.pop() + secondPart.pop() + secondPart.pop());
        System.out.print(thirdPart.pop());
    }
}