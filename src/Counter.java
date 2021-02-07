import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Counter {
    int k;
    int n;

    ArrayList<Integer> numbers;

    public Counter(File file) {
        readFromFile(file);
        sort();
        saveToFile();
    }

    public void sort() {
        // Sort with O(n) complexity
    }

    public void readFromFile(File file) {
        numbers = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            k = sc.nextInt();

            while (sc.hasNext()) {
                // Initialize the array, O(k) complexity
                numbers.add(sc.nextInt());
            }

            n = numbers.size();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

        public void saveToFile() {
        /*
        try {
            FileWriter writer = new FileWriter("src/out" + fileNum + ".txt");
            String isFound;
            StringBuilder numbersWithSpaces = new StringBuilder();

            if (found) {
                isFound = "Yes";
            } else {
                isFound = "No";
            }

            for (Integer number : numbers) {
                numbersWithSpaces.append(number).append(" ");
            }

            writer.write(answer + "\n" + numbersWithSpaces + "\n" + isFound);

            if (found) {
                writer.write("\n" + num1 + "+" + num2 + "+" + num3 + "=" + answer);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }
}
