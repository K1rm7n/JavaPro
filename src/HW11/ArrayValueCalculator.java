package HW11;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || array[0].length != 4)
            throw new ArraySizeException("Array should be 4x4");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at cell [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(array);
            System.out.println("Sum of array values: " + result);
        } catch (ArraySizeException e) {
            System.out.println("ArraySizeException: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("ArrayDataException: " + e.getMessage());
        }
    }
}
class ArraySizeException extends Exception {
    public ArraySizeException(String message) {
        super(message);
    }
}

class ArrayDataException extends Exception {
    public ArrayDataException(String message) {
        super(message);
    }
}