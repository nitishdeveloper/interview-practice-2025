package DSA;

public class PlusOne {
    public static void main(String[] args) {
        int[] result = solution(new int[]{5, 6, 2, 0, 0, 4, 6, 2, 4, 9});
        for (int j : result) {
            System.out.print(j);
        }
    }

    public static int[] solution(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}


