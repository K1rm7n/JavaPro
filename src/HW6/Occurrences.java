package HW6;
import java.util.*;

public class Occurrences {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bird", "fox", "cat", "bird", "dog", "fox", "cat", "bird", "dog", "bird");

        String wordToCount = "bird";
        int occurrences = countOccurance(words, wordToCount);
        System.out.println("Word '" + wordToCount + "' occurs " + occurrences + " times.");

        Integer[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("List: " + list);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 3, 6, 7);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);

        calcOccurance(words);

        List<Occurrence> occurrenceList = findOccurance(words);
        System.out.println("Occurrence list:");
        for (Occurrence occurrence : occurrenceList) {
            System.out.println(occurrence);
        }
    }

    public static int countOccurance(List<String> words, String wordToCount) {
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbersSet);
    }

    public static void calcOccurance(List<String> words) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : words) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static class Occurrence {
        private String name;
        private int occurrence;

        public Occurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        @Override
        public String toString() {
            return "{name: \"" + name + "\", occurrence: " + occurrence + "}";
        }
    }

    public static List<Occurrence> findOccurance(List<String> words) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : words) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }
        List<Occurrence> occurrenceList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            occurrenceList.add(new Occurrence(entry.getKey(), entry.getValue()));
        }
        return occurrenceList;
    }
}