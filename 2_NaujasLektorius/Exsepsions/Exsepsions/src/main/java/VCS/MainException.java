package VCS;

public class MainException {
    public static void main(String[] args) {
        String[] skaiciai = InputManager.askForInput();
        try {
            System.out.printf(
                    "%s / %s = %s%n", skaiciai[0],
                    skaiciai[1],
                    IntDivider.divider(skaiciai)
            );
        } catch (ArgumentIsZeroException e) {
            e.printStackTrace();
        }
    }
}
