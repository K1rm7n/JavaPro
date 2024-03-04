package HW12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the book:");
        String bookName = scanner.nextLine();

        BookAnalyzer bookAnalyzer = new BookAnalyzer(bookName);
        if (bookAnalyzer.analyze()) {
            bookAnalyzer.writeStatistics();
            bookAnalyzer.printStatistics();
        } else {
            System.out.println("The book \"" + bookName + "\" is not found.");
        }
        scanner.close();
    }
}
