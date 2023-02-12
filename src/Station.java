import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Station {
    public static void main(String[] args) {

        int numberOfTremors = 10;

        List<Integer> earthquake = new ArrayList<>();
        int earthquakeCount = 0;

        Random random = new Random();

        for (int i = 0; i < numberOfTremors; i++) {
            earthquake.add(random.nextInt(11));
        }

        for (Integer integer : earthquake) {
            if (integer > 3) {
                earthquakeCount++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int isDayOver = scanner.nextInt();

        if (isDayOver == -97 && earthquakeCount >= 5) {
            System.out.println("За время моего дежурства зафиксированно " + earthquakeCount + " землетрясений магнитудой более 3 балов");
        }
    }

}
