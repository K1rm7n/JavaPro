package HW12;
import java.io.*;
import java.util.*;

public class BookAnalyzer {
    private final String bookName;
    private final Map<String, Integer> wordFrequency;

    public BookAnalyzer(String bookName) {
        this.bookName = bookName;
        this.wordFrequency = new HashMap<>();
    }

    public boolean analyze() {
        try {
            String text = readFile(bookName);

            String[] words = text.split("\\s+");
            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (word.length() > 2) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void writeStatistics() {
        try (PrintWriter writer = new PrintWriter(bookName + "_statistic.txt")) {
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                writer.println(entry.getKey() + " -> " + entry.getValue());
            }
            writer.println("Total words: " + wordFrequency.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printStatistics() {
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("Total words: " + wordFrequency.size());
    }

    private String readFile(String fileName) throws IOException {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
        }
        return text.toString();
    }
}
