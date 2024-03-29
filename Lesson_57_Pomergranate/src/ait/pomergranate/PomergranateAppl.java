import ait.pomergranate.model.Box;
import ait.pomergranate.model.Pomergranate;
import ait.pomergranate.model.Seed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PomergranateAppl {
    public static void main(String[] args) {
        List<Box> boxes = generateRandomBoxes();

        // Задача 2: Calculate total seeds in all boxes.
        int totalSeeds = calculateTotalSeeds(boxes);
        System.out.println("Total seeds in all boxes: " + totalSeeds);

        // Задача 3: Calculate maximum seeds in one box.
        int maxSeeds = calculateMaximumSeeds(boxes);
        System.out.println("Maximum seeds in one box: " + maxSeeds);

        // Задача 4: Find names of boxes with maximum seeds.
        List<String> boxesWithMaxSeeds = findBoxesWithMaximumSeeds(boxes, maxSeeds);
        System.out.println("Boxes with maximum seeds: " + boxesWithMaxSeeds);
    }

    private static List<Box> generateRandomBoxes() {
        List<Box> boxes = new ArrayList<>();
        Random random = new Random();

        int numBoxes = random.nextInt(101) + 100; // Random quantity of Boxes (range from 100 to 200)
        for (int i = 0; i < numBoxes; i++) {
            int numPomergranates = random.nextInt(11) + 10; // Random quantity of pomegranates (range from 10 to 20)
            String boxName = "Box " + (i + 1);
            boxes.add(new Box(boxName, numPomergranates));
        }

        return boxes;
    }

    private static int calculateTotalSeeds(List<Box> boxes) {
        int totalSeeds = 0;
        for (Box box : boxes) {
            for (Pomergranate pomergranate : box) {
                for (Seed seed : pomergranate) {
                    totalSeeds++;
                }
            }
        }
        return totalSeeds;
    }

    private static int calculateMaximumSeeds(List<Box> boxes) {
        int maxSeeds = 0;
        for (Box box : boxes) {
            for (Pomergranate pomegranate : box) {
                int numSeeds = 0;
                for (Seed seed : pomegranate) {
                    numSeeds++;
                }
                maxSeeds = Math.max(maxSeeds, numSeeds);
            }
        }
        return maxSeeds;
    }

    private static List<String> findBoxesWithMaximumSeeds(List<Box> boxes, int maxSeeds) {
        List<String> boxesWithMaxSeeds = new ArrayList<>();
        for (Box box : boxes) {
            for (Pomergranate pomergranate : box) {
                int numSeeds = 0;
                for (Seed seed : pomergranate) {
                    numSeeds++;
                }
                if (numSeeds == maxSeeds) {
                    boxesWithMaxSeeds.add(box.getName());
                    break;
                }
            }
        }
        return boxesWithMaxSeeds;
    }
}
