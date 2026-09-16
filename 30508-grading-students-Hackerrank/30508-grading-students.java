
import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (int grade : grades) {

            // Failing grade: don't round
            if (grade < 38) {
                result.add(grade);
                continue;
            }

            // Find the next multiple of 5
            int nextMultiple = ((grade / 5) + 1) * 5;

            // Round if difference is less than 3
            if (nextMultiple - grade < 3) {
                result.add(nextMultiple);
            } else {
                result.add(grade);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(Integer.parseInt(br.readLine().trim()));
        }

        List<Integer> result = gradingStudents(grades);

        for (int grade : result) {
            System.out.println(grade);
        }
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna