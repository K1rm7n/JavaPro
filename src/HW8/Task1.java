package HW8;

public class Task1 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;

        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
