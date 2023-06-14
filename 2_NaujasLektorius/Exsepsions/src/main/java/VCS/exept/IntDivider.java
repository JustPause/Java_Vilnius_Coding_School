package VCS.exept;

public class IntDivider {
    public static int divider(String[] InputNumber) throws ArgumentIsZeroException {
        int[] Skaicius = {Integer.parseInt(InputNumber[0]), Integer.parseInt(InputNumber[1])};
        int rezultatas = 0;

        if (Skaicius[1] == 0) {
            throw new ArgumentIsZeroException();
        } else {
            rezultatas = Skaicius[0] / Skaicius[1];
        }

        return rezultatas;
    }
}
