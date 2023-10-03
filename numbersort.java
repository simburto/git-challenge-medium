import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class numbersort {
    public static void main(String[] args) {
        String fileName = "in.txt"; 
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numberStrings = line.split(" ");
                for (String numStr : numberStrings) {
                    try {
                        int number = Integer.parseInt(numStr);
                        numbers.add(number);
                    } catch (NumberFormatException e) {
                        System.err.println("skipping invalid number: " + numStr);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("cant read file: " + e.getMessage());
            System.exit(1);
        }
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
