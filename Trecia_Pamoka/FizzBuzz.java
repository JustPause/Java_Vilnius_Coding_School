package Trecia_Pamoka;

public class FizzBuzz {
    public static void main(String[] args) {

        int Patikrinimas1 = 3;
        int Patikrinimas2 = 5;

        for (int i = 0; i < 100; i++) {
            if (i % Patikrinimas1 == 0) {
                System.out.println("Fizz");
            }
            if (i % Patikrinimas2 == 0) {
                System.out.println("Buzz");
            }
            if (i % Patikrinimas1 == 0 && i % Patikrinimas2 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.printf("%d\n", i);
            }
        }
    }
}
