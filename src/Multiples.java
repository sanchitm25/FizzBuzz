public class Multiples {
    public static void main(String[] args) {
        final int MAX_NUM = 1000;

        int count = 0;

        for (int i = 1; i < MAX_NUM; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
