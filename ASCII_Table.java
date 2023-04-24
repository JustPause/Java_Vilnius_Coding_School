import java.util.concurrent.TimeUnit;

public class ASCII_Table {

    public static void byte_ascii() {
        byte var = Byte.MAX_VALUE;

        for (byte i = 0; true; i++) {
            for (byte j = 0; j < 5; j++) {
                char Char = (char) (var + j + i + 1);
                System.out.printf("%3c" + " " + "%3d", Char, (var + j + i + 1));
            }
            System.out.println();
        }
    }

    public static void int_ascii() {

        for (int i = 200; true;) {
            for (int z = 0; z < 5; z++) {
                char Char = (char) (i + 1);
                System.out.printf("%2c %5d ", Char, (i + 1));
                i++;
            }
            System.out.println();

            try {
            Thread.sleep(100);
            } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        int_ascii();

    }
}
// https://www.asciitable.com/

// char Char = (char) (var + j + 1);
// System.out.printf("%3c" + " " + "%3d", Char, (var + j + 1));