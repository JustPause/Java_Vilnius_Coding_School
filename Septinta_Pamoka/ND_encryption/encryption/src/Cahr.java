public class Cahr {
    public static void main(String[] args) throws Exception {
        int x = 87869884;
        for (int i = 32 + x; i < (127 - 32) + x; i++) {
            System.out.printf("%d: %c. ", i, (char) i);
        }
        System.out.println();
    }
}
