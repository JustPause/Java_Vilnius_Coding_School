package Trecia_Pamoka;

public class MainWork {
    int x; // Create a class attribute
    int y=6;

    // Create a class constructor for the Main class
    public MainWork() {
        x = 5; // Set the initial value for the class attribute x
        System.out.println("Print");
        y = 5;
    }

    public static void main(String[] args) {
        MainWork myObj = new MainWork(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.y); // Print the value of x
    }
}