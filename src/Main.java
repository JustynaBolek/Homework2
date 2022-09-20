public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int x = 0;
        while (x < numbers.length) {
            ++x;
            if (x == 5) {
                System.out.println("Znalazlam piatke");
                break;
            }
        }
    }
}