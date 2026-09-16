
import java.io.*;
import java.util.*;

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " +
            adder.getClass().getSuperclass().getSimpleName());

        System.out.println(adder.add(42, 0) + " " +
                           adder.add(13, 0) + " " +
                           adder.add(20, 0));
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna