import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Main {

    public static void count(ArrayList<Object> mylist) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object element : mylist) {
            if (element instanceof Student) {
                studentCount++;
            }
            if (element instanceof Rockstar) {
                rockstarCount++;
            }
            if (element instanceof Hacker) {
                hackerCount++;
            }
        }

        System.out.println(studentCount + " " + rockstarCount + " " + hackerCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Object> mylist = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("Student")) {
                mylist.add(new Student());
            } else if (type.equals("Rockstar")) {
                mylist.add(new Rockstar());
            } else if (type.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }

        count(mylist);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna